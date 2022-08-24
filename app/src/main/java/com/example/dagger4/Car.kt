package com.example.dagger4

import android.util.Log
import com.example.dagger4.dont_have.Wheels
import javax.inject.Inject

class Car @Inject constructor(val engine:Engine , val wheels: Wheels) {

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