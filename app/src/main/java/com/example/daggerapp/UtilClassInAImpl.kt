package com.example.daggerapp

import android.util.Log
import com.example.modulea.UtilClassInA
import com.example.moduleb.UtilClassInB

class UtilClassInAImpl : UtilClassInA {
    override fun methodA(message: String) {
        Log.d("TAG", message)
        // call method of module b
        UtilClassInB().methodB(message)
    }
}