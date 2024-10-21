package com.example.productsapp.ui.auth.data

import com.example.productsapp.networking.AuthApiService
import com.example.productsapp.ui.auth.login.models.LoginReqBody
import javax.inject.Inject

class AuthRepository @Inject constructor(private val authApiService: AuthApiService) {

    suspend fun loginUser(email: String, password: String) = authApiService.loginUser(LoginReqBody(password,email))
}