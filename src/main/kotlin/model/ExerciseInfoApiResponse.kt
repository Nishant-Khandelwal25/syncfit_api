package com.syncfit.model

import kotlinx.serialization.Serializable

@Serializable
data class ExerciseInfoApiResponse(
    val success: Boolean,
    val message: String? = null,
    val exerciseInfo: ExerciseInfo? = null,
)
