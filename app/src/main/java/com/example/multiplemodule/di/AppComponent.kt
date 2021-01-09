package com.example.multiplemodule.di

import com.example.multiplemodule.presentation.MainActivity
import com.example.multiplemodule.presentation.SplashFragment
import dagger.Component

@Component(modules = [AppModule::class])
interface AppComponent {
    fun inject(activity: MainActivity)
    fun inject(fragment: SplashFragment)
}