package com.example.dagger4.di

import com.example.dagger4.car.Engine
import com.example.dagger4.car.GasEngine
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class GasEngineModule {

    @Binds
    abstract fun gasEngineProvide(gasEngine: GasEngine):Engine
}