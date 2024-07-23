package com.example.daggerapp

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
