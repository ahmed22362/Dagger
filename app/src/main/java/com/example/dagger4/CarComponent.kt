package com.example.dagger4

import dagger.Component

@Component
interface CarComponent {
    fun getCar():Car
    fun inject(mainActivity: MainActivity)
}