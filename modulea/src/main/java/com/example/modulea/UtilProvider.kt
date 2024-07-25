package com.example.modulea

import javax.inject.Inject

class UtilProvider @Inject constructor(private val utilClassInA: UtilClassInA) {
    fun methodToCallUtilClassInA() {
        utilClassInA.methodA("Module A of Util class injected via Util Provider!")
    }
}