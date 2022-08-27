package com.example.dagger4.views

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.dagger4.R
import com.example.dagger4.car.Car
import com.example.dagger4.di.DaggerCarComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var car: Car
    override fun onCreate(savedInstanceState: Bundle?) {

        val component =
            DaggerCarComponent.builder()
                .horsePower(1300)
                .cylinders(0)
                .built()

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
            4-run time variables
            in that order
     */
}