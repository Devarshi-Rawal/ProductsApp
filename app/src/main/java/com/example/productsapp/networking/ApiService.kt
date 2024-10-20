package com.example.productsapp.networking

import com.example.productsapp.ui.auth.login.models.LoginReqBody
import com.example.productsapp.ui.auth.login.models.LoginResponse
import com.example.productsapp.ui.dashboard.dashboard.models.ProductsResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST

interface ApiService {

    @POST("login")
    fun loginUser(@Body loginReqBody: LoginReqBody): Response<LoginResponse>

    @GET("product/list")
    fun getProducts(@Header("api_key") apiKey: String): Response<ProductsResponse>
}