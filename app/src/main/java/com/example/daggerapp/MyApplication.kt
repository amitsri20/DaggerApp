package com.example.daggerapp

import android.app.Application
import com.example.daggerapp.di.AppComponent
import com.example.daggerapp.di.AppModule

class MyApplication : Application() {

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()

        appComponent = DaggerAppComponent.builder()
            .appModule(AppModule())
            .build()
    }
}
