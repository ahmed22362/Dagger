package com.example.dagger

import android.util.Log

class EmailService {

    fun send(to: String,from: String,body:String){
        Log.d("TAG","Email sent")
    }
}