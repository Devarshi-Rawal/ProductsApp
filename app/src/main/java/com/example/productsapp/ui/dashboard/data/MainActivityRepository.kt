package com.example.productsapp.ui.dashboard.data

import com.example.productsapp.db.dao.ProductDao
import com.example.productsapp.db.entities.ProductEntity
import javax.inject.Inject

class MainActivityRepository @Inject constructor(private val productDao: ProductDao) {

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
}