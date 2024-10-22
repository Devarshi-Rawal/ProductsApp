package com.example.productsapp.ui.dashboard

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.productsapp.ui.auth.login.models.LoginResponse
import com.example.productsapp.ui.dashboard.dashboard.models.Product
import com.example.productsapp.ui.dashboard.data.MainActivityRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainActivityViewModel @Inject constructor(private val repository: MainActivityRepository): ViewModel() {

    val product = Product()

    fun insertProduct(){
        viewModelScope.launch {
            repository.insertProduct(product)
        }
    }

    fun updateProduct(){
        viewModelScope.launch {
            repository.updateProduct(product)
        }
    }

    fun deleteProduct(){
        viewModelScope.launch {
            repository.deleteProduct(product)
        }
    }

    fun getAllProducts(): List<Product>{
        var listOfProductEntities = listOf<Product>()
        viewModelScope.launch {
            listOfProductEntities = async {
                repository.getAllProducts()
            }.await()
        }
        return listOfProductEntities
    }
}