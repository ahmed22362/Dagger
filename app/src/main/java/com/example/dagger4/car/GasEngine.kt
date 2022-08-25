package com.example.dagger4.car

import android.util.Log
import javax.inject.Inject

class GasEngine @Inject constructor(private val horsePower:Int): Engine {
    override fun start() {
        Log.e("TAG","starting gas engine and HorsePower is $horsePower")
    }
}