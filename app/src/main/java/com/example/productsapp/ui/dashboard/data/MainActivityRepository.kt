package com.example.productsapp.ui.dashboard.data

import android.util.Log
import com.example.productsapp.db.dao.ProductDao
import com.example.productsapp.networking.ApiService
import com.example.productsapp.networking.AuthApiService
import com.example.productsapp.ui.auth.login.models.LoginReqBody
import com.example.productsapp.ui.dashboard.dashboard.models.Product
import com.example.productsapp.utils.Constants
import javax.inject.Inject

class MainActivityRepository @Inject constructor(private val productDao: ProductDao, private val apiService: ApiService) {

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

    suspend fun fetchProducts(): ArrayList<Product>{
        val listOfProducts = arrayListOf<Product>()
        val productsResponse = apiService.fetchProducts(Constants.API_KEY)
        if (productsResponse.isSuccessful){
            productsResponse.body()?.productList?.let {
                listOfProducts.addAll(it)
            }
            for (i in listOfProducts){
                insertProduct(i)
            }
            Log.e("FetchProducts", "fetchProducts: Fetch Products Success")
        } else{
            Log.e("FetchProducts", "fetchProducts: Fetch Products Unsuccessful")
        }
        return listOfProducts
    }
}