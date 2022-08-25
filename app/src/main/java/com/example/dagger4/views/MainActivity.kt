package com.example.dagger4.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dagger4.R
import com.example.dagger4.car.Car
import com.example.dagger4.di.DaggerCarComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var car: Car
    override fun onCreate(savedInstanceState: Bundle?) {

        val component = DaggerCarComponent.create()
        component.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        car.drive()
    }

    /*
        dagger inject:
            1-constructor
            2-field
            3-methods
            in that order
     */
}