package com.example.modulea.ui

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.modulea.AnotherUtilClassInA
import com.example.modulea.R
import com.example.modulea.di.DaggerModuleAComponent
import javax.inject.Inject

class ModuleAActivity : AppCompatActivity() {

    @Inject
    lateinit var anotherUtilClassInA: AnotherUtilClassInA

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inject Module A dagger component
        val moduleAComponent = DaggerModuleAComponent.create()
        moduleAComponent.inject(this)

        // use the injected dependency
        anotherUtilClassInA.justAnotherMethod("Just another method Injected from Module A!")

        enableEdgeToEdge()
        setContentView(R.layout.activity_module_aactivity)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}