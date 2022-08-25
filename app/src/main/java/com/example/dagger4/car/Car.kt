package com.example.dagger4.car

import android.util.Log
import com.example.dagger4.car.dont_have.Wheels
import javax.inject.Inject

class Car @Inject constructor(private val engine: Engine, val wheels: Wheels) {

    companion object{
        const val TAG = "TAG"
    }

    init {
        Log.e("TAG","created")
    }

    fun drive(){
        engine.start()
        Log.e("TAG","Vooooooo!!!")
    }

    @Inject
    fun checkFuel(fuel: Fuel){
        fuel.setListener(this)
    }
}