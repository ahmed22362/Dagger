package com.example.dagger4.di

import com.example.dagger4.car.ElectricMotor
import com.example.dagger4.car.Engine
import dagger.Module
import dagger.Provides

@Module
class ElectricMotorModule constructor(private val horsePower:Int){

    @Provides
    fun provideEngine(): Engine = ElectricMotor(horsePower)
}