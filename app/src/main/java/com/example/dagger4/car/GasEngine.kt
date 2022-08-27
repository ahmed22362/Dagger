package com.example.dagger4.car

import android.util.Log
import com.example.dagger4.utils.Cylinders
import com.example.dagger4.utils.HorsePower
import javax.inject.Inject

class GasEngine @Inject constructor
    (
    @HorsePower private val horsePower: Int,
    @Cylinders private val cylinders: Int
) :
    Engine {
    override fun start() {
        Log.e(
            "TAG",
            "starting gas engine and HorsePower is $horsePower and cylinders are $cylinders"
        )
    }
}