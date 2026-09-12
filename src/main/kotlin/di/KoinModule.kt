package com.syncfit.di

import com.syncfit.repository.ExerciseInfoRepository
import com.syncfit.repository.ExerciseInfoRepositoryImpl
import org.koin.dsl.module

val KoinModule = module {
    single<ExerciseInfoRepository> {
        ExerciseInfoRepositoryImpl()
    }
}