package com.example.daggerapp

import android.util.Log
import com.example.modulea.UtilClass

class UtilClassImpl : UtilClass {
    override fun methodA(message: String) {
        Log.d("TAG", message)
    }
}