package com.example.dagger4

import android.util.Log
import javax.inject.Inject

class Car @Inject constructor(val engine:Engine) {
    init {
        Log.e("TAG","created")
    }

    fun drive(){
        Log.e("TAG","Vooooooo!!!")
    }
}