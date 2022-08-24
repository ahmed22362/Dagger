package com.example.dagger4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var car: Car
    override fun onCreate(savedInstanceState: Bundle?) {

        val component = DaggerCarComponent.create()
        component.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        car = component.getCar()
        car.drive()
    }
}