package com.syncfit.model

import kotlinx.serialization.Serializable

@Serializable
data class WorkoutInfo(
    val id: Int,
    val exerciseName: String,
    val bodyPart: String,
    val exerciseType: ExerciseType,
)
