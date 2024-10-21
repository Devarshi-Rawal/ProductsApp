package com.example.productsapp.networking

import com.example.productsapp.ui.dashboard.dashboard.models.ProductsResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header

interface ApiService {

    @GET("product/list")
    suspend fun fetchProducts(@Header("api_key") apiKey: String): Response<ProductsResponse>
}