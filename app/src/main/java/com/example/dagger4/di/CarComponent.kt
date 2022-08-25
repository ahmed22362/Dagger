package com.example.dagger4.di

import com.example.dagger4.car.Car
import com.example.dagger4.views.MainActivity
import dagger.Component

@Component(modules = [WheelsModule::class, ElectricMotorModule::class])
interface CarComponent {
    fun getCar(): Car
    fun inject(mainActivity: MainActivity)
}