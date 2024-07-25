package com.example.daggerapp.di

import com.example.daggerapp.SomeDependency
import com.example.daggerapp.UtilClassInAImpl
import com.example.modulea.UtilClassInA
import dagger.Module
import dagger.Provides

@Module
class AppModule {

    @Provides
    fun provideSomeDependency(): SomeDependency {
        return SomeDependency()
    }

    @Provides
    fun provideUtilClass(): UtilClassInA {
        return UtilClassInAImpl()
    }
}
