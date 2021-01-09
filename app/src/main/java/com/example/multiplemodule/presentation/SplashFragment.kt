package com.example.multiplemodule.presentation

import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.multiplemodule.App
import com.example.multiplemodule.FakeService
import com.example.multiplemodule.LoginRequest
import com.example.multiplemodule.R
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import javax.inject.Inject
import kotlin.coroutines.suspendCoroutine

class SplashFragment : Fragment(R.layout.fragment_splash) {
    @Inject lateinit var retrofit: Retrofit
    @Inject lateinit var fakeService: FakeService
    private lateinit var button:Button
    companion object {
        private const val TAG = "SplashFragment"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        (requireContext().applicationContext as App).appComponent.inject(this)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
         if (view != null){
             button = requireView().findViewById(R.id.button)
             button.setOnClickListener {
                 it.findNavController().navigate(R.id.auth_graph)
             }
         }
        Log.d(TAG, "onActivityCreated: "+ fakeService)
        GlobalScope.launch {
           val response = fakeService.login(LoginRequest("nilson@email.com","nilson"))
            Log.d(TAG, "GlobalScope.launch : "+ response)
        }
    }
}