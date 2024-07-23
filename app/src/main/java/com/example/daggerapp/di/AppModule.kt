package com.example.daggerapp.di

import com.example.daggerapp.SomeDependency
import com.example.daggerapp.UtilClassImpl
import com.example.modulea.UtilClass
import dagger.Module
import dagger.Provides

@Module
class AppModule {

    @Provides
    fun provideSomeDependency(): SomeDependency {
        return SomeDependency()
    }


    @Provides
    fun provideUtilClass(): UtilClass {
        return UtilClassImpl()
    }
}
