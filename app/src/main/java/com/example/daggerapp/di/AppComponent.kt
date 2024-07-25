package com.example.daggerapp.di

import com.example.daggerapp.MyApplication
import com.example.daggerapp.ui.MainActivity
import com.example.modulea.AnotherUtilClassInA
import com.example.modulea.di.ModuleAComponent
import dagger.Component

@Component(modules = [AppModule::class], dependencies = [ModuleAComponent::class])
interface AppComponent {

    // Classes that want to use dependencies from this component
    // need to be declared as functions here.
    fun inject(app: MyApplication)

    fun inject(activity: MainActivity)
    // Add more inject functions for other classes as needed
    fun anotherUtilClassInA(): AnotherUtilClassInA
}
