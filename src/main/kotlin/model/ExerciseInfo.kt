package com.syncfit.model

import kotlinx.serialization.Serializable
import java.util.UUID

@Serializable
data class ExerciseInfo(
    val id: Int = UUID.randomUUID().hashCode(),
    val exerciseName: String,
    val exerciseVariations: List<String>,
    val primaryMuscle: String,
    val targetedMuscleGroup: List<String>,
    val secondaryMuscle: String,
    val equipment: String,
    val howToPerform: List<String>,
    val exerciseLevel: String,
    val isAiFormCheckEnabled: Boolean,
    val demonstrationLink: String,
)
