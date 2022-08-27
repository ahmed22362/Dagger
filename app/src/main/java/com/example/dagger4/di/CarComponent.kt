package com.example.dagger4.di

import com.example.dagger4.car.Car
import com.example.dagger4.utils.Cylinders
import com.example.dagger4.utils.HorsePower
import com.example.dagger4.views.MainActivity
import dagger.Binds
import dagger.BindsInstance
import dagger.Component

@Component(modules = [WheelsModule::class, ElectricMotorModule::class])
interface CarComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun horsePower(@HorsePower horsePower: Int): Builder

        @BindsInstance
        fun cylinders(@Cylinders cylinders: Int): Builder

        fun built(): CarComponent

    }


    fun getCar(): Car
    fun inject(mainActivity: MainActivity)
}