package com.syncfit.routes

import com.syncfit.constants.Constants.EXERCISE_NAME_QUERY_PARAM
import com.syncfit.model.ExerciseInfoApiResponse
import com.syncfit.model.ExerciseType
import com.syncfit.repository.ExerciseInfoRepository
import io.ktor.http.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject

fun Route.getExerciseInfo() {
    val repository: ExerciseInfoRepository by inject()
    get("/syncfit/exerciseInfo") {
        val exerciseName = call.request.queryParameters[EXERCISE_NAME_QUERY_PARAM] ?: return@get call.respond(
            message = ExerciseInfoApiResponse(
                success = false,
                message = "Invalid or missing exercise type"
            ),
            status = HttpStatusCode.BadRequest,
        )

        ExerciseType.entries.find { it.name.equals(exerciseName, true) } ?: run {
            call.respond(
                message = ExerciseInfoApiResponse(
                    success = false,
                    message = "Invalid or missing exercise type: $exerciseName"
                ),
                status = HttpStatusCode.BadRequest,
            )
            return@get
        }

        val response = repository.getExerciseInfo(exerciseName)
        call.respond(message = response, status = HttpStatusCode.OK)
    }
}
