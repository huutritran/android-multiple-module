package com.example.auth

import androidx.navigation.NavController

interface LoginResultListener {
    fun onLoginSuccess()
    fun onLoginFailure()
}

interface IAuthModule {
    fun isLoggedIn(): Boolean
    fun goToLogin(navController: NavController, loginResultListener: LoginResultListener)
}

class AuthModule : IAuthModule {
    var loginListener: LoginResultListener? = null

    override fun isLoggedIn(): Boolean {
        TODO("Not yet implemented")
    }

    override fun goToLogin(navController: NavController, loginResultListener: LoginResultListener) {
        this.loginListener = loginResultListener;
        navController.navigate(R.id.auth_graph)
    }

}