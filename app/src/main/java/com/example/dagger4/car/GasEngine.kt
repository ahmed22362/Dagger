package com.example.dagger4.car

import android.util.Log
import javax.inject.Inject

class GasEngine @Inject constructor(): Engine {
    override fun start() {
        Log.e("TAG","starting gas engine")
    }
}