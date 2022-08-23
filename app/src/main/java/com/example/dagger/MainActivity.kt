package com.example.dagger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*
        UserRegistrationService class is dependent on two classes,
        it is easy for us to make its object manually.
        If a class is dependent on a number of other classes then
        we can use the Dagger framework for dependency injection.
         */

        val userRepo = UserRepo()
        val emailService = EmailService()

        //this called manual constructor injection
        val userRegistrationService = UserRegistrationService(userRepo, emailService)
        userRegistrationService.userRegistration("xyz@gmail.com", "11111")

    }
}