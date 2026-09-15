package com.syncfit.plugins

import com.syncfit.routes.getExerciseInfo
import com.syncfit.routes.getExercises
import io.ktor.server.application.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        getExercises()
        getExerciseInfo()
    }
}