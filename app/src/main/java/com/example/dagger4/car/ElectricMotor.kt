package com.example.dagger4.car

import android.util.Log
import javax.inject.Inject

class ElectricMotor @Inject constructor(): Engine {
    override fun start() {
        Log.e("TAG","Starting the electric motor ")
    }
}