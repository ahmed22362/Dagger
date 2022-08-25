package com.example.dagger4.di

import com.example.dagger4.car.Engine
import com.example.dagger4.car.GasEngine
import dagger.Module
import dagger.Provides

@Module
class GasEngineModule {

    @Provides
    fun gasEngineProvide(gasEngine: GasEngine):Engine = gasEngine
}