package com.syncfit.repository

import com.syncfit.model.ExerciseInfo
import com.syncfit.model.ExerciseInfoApiResponse
import com.syncfit.model.ExerciseType
import com.syncfit.model.ExercisesListApiResponse
import com.syncfit.model.WorkoutInfo

interface ExerciseInfoRepository {
    val exerciseInfoByType: Map<ExerciseType, ExerciseInfo>
    suspend fun getExerciseInfo(exerciseName: String): ExerciseInfoApiResponse
    val exercisesList: List<WorkoutInfo>
    suspend fun getExerciseList(): ExercisesListApiResponse
}