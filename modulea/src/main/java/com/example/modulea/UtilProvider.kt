package com.example.modulea

import javax.inject.Inject

class UtilProvider @Inject constructor(val utilClass: UtilClass) {
    fun methodOne() {
        utilClass.methodA("Module A of Util class injected via Util Provider!")
    }
}