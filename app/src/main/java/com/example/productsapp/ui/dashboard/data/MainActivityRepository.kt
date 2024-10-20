package com.example.productsapp.ui.dashboard.data

import com.example.productsapp.db.dao.ProductDao
import com.example.productsapp.db.entities.Product
import javax.inject.Inject

class MainActivityRepository @Inject constructor(private val productDao: ProductDao) {

    suspend fun insertProduct(product: Product){
        productDao.insertProduct(product)
    }

    suspend fun updateProduct(product: Product){
        productDao.updateProduct(product)
    }

    suspend fun deleteProduct(product: Product){
        productDao.deleteProduct(product)
    }

    suspend fun getAllProducts(): List<Product>{
        return productDao.getAllProducts()
    }
}