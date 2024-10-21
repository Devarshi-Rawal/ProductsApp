package com.example.productsapp.networking

import com.example.productsapp.ui.auth.login.models.LoginReqBody
import com.example.productsapp.ui.auth.login.models.LoginResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface AuthApiService {

    @POST("login")
    suspend fun loginUser(@Body loginReqBody: LoginReqBody): Response<LoginResponse>
}