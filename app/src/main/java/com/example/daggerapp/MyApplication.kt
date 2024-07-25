package com.example.daggerapp

import android.app.Application
import com.example.daggerapp.di.AppComponent
import com.example.daggerapp.di.AppModule
import com.example.daggerapp.di.DaggerAppComponent
import com.example.modulea.di.DaggerModuleAComponent

class MyApplication : Application() {

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()

        val moduleAComponent = DaggerModuleAComponent.create()

        appComponent = DaggerAppComponent.builder()
            .moduleAComponent(moduleAComponent)
            .build()

//        appComponent = DaggerAppComponent.builder()
//            .appModule(AppModule())
//            .build()
    }
}
