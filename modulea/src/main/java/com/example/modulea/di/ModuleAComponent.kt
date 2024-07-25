package com.example.modulea.di

import com.example.modulea.AnotherUtilClassInA
import com.example.modulea.ui.ModuleAActivity
import dagger.Component

@Component(modules = [ModuleA::class])
interface ModuleAComponent {

    // Classes that want to use dependencies from this component
    // need to be declared as functions here.
    fun inject(activity: ModuleAActivity)
    // Add more inject functions for other classes as needed
    fun anotherUtilClass(): AnotherUtilClassInA
}
