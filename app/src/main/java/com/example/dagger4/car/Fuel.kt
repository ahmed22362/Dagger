package com.example.dagger4.car

import android.util.Log
import javax.inject.Inject

class Fuel @Inject constructor() {

    fun setListener(car: Car){
        Log.e(Car.TAG,"fuel is low and need to refill")
    }
}