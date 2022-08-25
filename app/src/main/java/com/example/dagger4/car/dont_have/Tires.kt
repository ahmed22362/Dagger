package com.example.dagger4.car.dont_have

import android.util.Log

//let's say we don't own this class and it comes from 3rd party library

class Tires {

    fun inflateTires(){
        Log.e("TAG","tires inflated")
    }
}