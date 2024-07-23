package com.example.daggerapp

import android.util.Log
import com.example.modulea.UtilClass
import com.example.moduleb.UtilB

class UtilClassImpl : UtilClass {
    override fun methodA(message: String) {
        Log.d("TAG", message)
        // call method of module b
        UtilB().methodTwo(message)
    }
}