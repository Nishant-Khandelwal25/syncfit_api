package com.syncfit.plugins

import com.syncfit.routes.getExerciseInfo
import io.ktor.server.application.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        getExerciseInfo()
    }
}