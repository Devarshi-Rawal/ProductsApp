package com.example.productsapp.ui.auth.data

import android.app.Application
import android.content.SharedPreferences
import android.util.Log
import com.example.productsapp.app.ProductsApp
import com.example.productsapp.networking.AuthApiService
import com.example.productsapp.ui.auth.login.models.LoginReqBody
import javax.inject.Inject

class AuthRepository @Inject constructor(private val authApiService: AuthApiService) {

    suspend fun loginUser(email: String, password: String) {
        val loginResponse = authApiService.loginUser(LoginReqBody(password,email))
        if (loginResponse.isSuccessful){
            if (loginResponse.code() == 200){
                ProductsApp().setLoginToken(loginResponse.body()?.token.toString())
                Log.e("LoginUser", "fetchProducts: Login Success")
            } else{
                Log.e("LoginUser", "fetchProducts: Login Unsuccessful")
            }
        } else{
            Log.e("LoginUser", "fetchProducts: Login Unsuccessful")
        }
    }
}