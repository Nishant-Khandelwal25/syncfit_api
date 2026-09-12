package com.syncfit.repository

import com.syncfit.model.ExerciseInfo
import com.syncfit.model.ExerciseInfoApiResponse
import com.syncfit.model.ExerciseType

interface ExerciseInfoRepository {
    val exerciseInfoByType: Map<ExerciseType, ExerciseInfo>
    suspend fun getExerciseInfo(exerciseName: String): ExerciseInfoApiResponse
}