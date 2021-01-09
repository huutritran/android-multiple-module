package com.example.multiplemodule

import android.app.Application
import com.example.multiplemodule.di.DaggerAppComponent

class App: Application() {
    val appComponent = DaggerAppComponent.create()
}