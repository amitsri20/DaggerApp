package com.example.daggerapp

import android.util.Log

class SomeDependency {
    fun someMethod(){
        Log.d("TAG","SomeDependency injected!")
    }
}