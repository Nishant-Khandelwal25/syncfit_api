package com.syncfit.routes

import com.syncfit.repository.ExerciseInfoRepository
import io.ktor.http.HttpStatusCode
import io.ktor.server.response.respond
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject

fun Route.getExercises() {
    val repository: ExerciseInfoRepository by inject()
    get("/syncfit/exercises") {
        val response = repository.getExerciseList()
        call.respond(message = response, status = HttpStatusCode.OK)
    }
}