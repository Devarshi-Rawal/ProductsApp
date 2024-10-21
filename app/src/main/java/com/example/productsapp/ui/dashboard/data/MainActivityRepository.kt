package com.example.productsapp.ui.dashboard.data

import com.example.productsapp.db.dao.ProductDao
import com.example.productsapp.db.entities.ProductEntity
import com.example.productsapp.networking.ApiService
import com.example.productsapp.networking.AuthApiService
import com.example.productsapp.ui.auth.login.models.LoginReqBody
import com.example.productsapp.utils.Constants
import javax.inject.Inject

class MainActivityRepository @Inject constructor(private val productDao: ProductDao, private val apiService: ApiService) {

    suspend fun insertProduct(productEntity: ProductEntity){
        productDao.insertProduct(productEntity)
    }

    suspend fun updateProduct(productEntity: ProductEntity){
        productDao.updateProduct(productEntity)
    }

    suspend fun deleteProduct(productEntity: ProductEntity){
        productDao.deleteProduct(productEntity)
    }

    suspend fun getAllProducts(): List<ProductEntity>{
        return productDao.getAllProducts()
    }

    suspend fun fetchProducts() = apiService.fetchProducts(Constants.API_KEY)
}