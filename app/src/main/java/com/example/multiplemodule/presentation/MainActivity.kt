package com.example.multiplemodule.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.multiplemodule.App
import com.example.multiplemodule.R

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        (application as App).appComponent.inject(this)
    }
}