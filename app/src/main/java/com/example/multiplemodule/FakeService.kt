package com.example.multiplemodule

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import retrofit2.http.Body
import retrofit2.http.POST

@JsonClass(generateAdapter = true)
data class LoginRequest(@Json(name="email") val email: String, @Json(name="password") val password: String)
data class LoginResponse(@Json(name = "access_token") val token: String)
interface FakeService {
    @POST("auth/login")
    suspend fun login(@Body loginRequest: LoginRequest): LoginResponse
}