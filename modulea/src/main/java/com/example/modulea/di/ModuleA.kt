package com.example.modulea.di

import com.example.modulea.AnotherUtilClassInA
import dagger.Module
import dagger.Provides

@Module
class ModuleA {

    @Provides
    fun provideAnotherUtilClass(): AnotherUtilClassInA {
        return AnotherUtilClassInA()
    }
}
