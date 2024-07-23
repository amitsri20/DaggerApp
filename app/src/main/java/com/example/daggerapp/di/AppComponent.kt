package com.example.daggerapp.di

import com.example.daggerapp.ui.MainActivity
import com.example.modulea.ModuleA
import dagger.Component

@Component(modules = [AppModule::class, ModuleA::class])
interface AppComponent {

    // Classes that want to use dependencies from this component
    // need to be declared as functions here.
    fun inject(activity: MainActivity)
    // Add more inject functions for other classes as needed

}
