package com.example.dagger4.car

import android.util.Log
import com.example.dagger4.utils.Cylinders
import com.example.dagger4.utils.HorsePower
import javax.inject.Inject

class ElectricMotor @Inject constructor(
    @HorsePower private val horsePower: Int,
    @Cylinders private val cylinders: Int
) : Engine {
    override fun start() {
        Log.e(
            "TAG",
            "Starting the electric motor the horse power is: $horsePower and my cylinders are $cylinders"
        )
    }
}