package com.syncfit.model

import kotlinx.serialization.Serializable

@Serializable
data class ExercisesListApiResponse(
    val success: Boolean,
    val message: String? = null,
    val exercisesList: List<WorkoutInfo>? = null,
)
