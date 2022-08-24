package com.example.dagger4

import android.util.Log
import javax.inject.Inject

class Car @Inject constructor(val engine:Engine) {

    companion object{
        const val TAG = "TAG"
    }

    init {
        Log.e("TAG","created")
    }

    fun drive(){
        Log.e("TAG","Vooooooo!!!")
    }

    @Inject
    fun checkFuel(fuel: Fuel){
        fuel.setListener(this)
    }
}