package com.example.dagger4

import com.example.dagger4.dont_have.Rims
import com.example.dagger4.dont_have.Tires
import com.example.dagger4.dont_have.Wheels
import dagger.Module
import dagger.Provides

@Module
object WheelsModule {

    @Provides
    @JvmStatic
    fun provideRims() = Rims()

    @Provides
    @JvmStatic
    fun provideTires(): Tires {
        val tires = Tires()
        tires.inflateTires()
        return tires
    }


    @Provides
    @JvmStatic
    fun provideWheels(rims: Rims, tires: Tires) = Wheels(tires,rims)
}