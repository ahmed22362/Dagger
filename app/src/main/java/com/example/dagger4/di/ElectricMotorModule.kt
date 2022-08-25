package com.example.dagger4.di

import com.example.dagger4.car.ElectricMotor
import com.example.dagger4.car.Engine
import dagger.Binds
import dagger.Module

@Module
abstract class ElectricMotorModule {

@Binds
abstract fun bindEngine(electricMotor: ElectricMotor):Engine
}