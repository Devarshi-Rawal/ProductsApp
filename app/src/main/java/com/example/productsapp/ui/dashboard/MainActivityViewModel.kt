package com.example.productsapp.ui.dashboard

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.productsapp.db.entities.ProductEntity
import com.example.productsapp.ui.auth.login.models.LoginResponse
import com.example.productsapp.ui.dashboard.data.MainActivityRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainActivityViewModel @Inject constructor(private val repository: MainActivityRepository): ViewModel() {

    val productEntity = ProductEntity()

    fun insertProduct(){
        viewModelScope.launch {
            repository.insertProduct(productEntity)
        }
    }

    fun updateProduct(){
        viewModelScope.launch {
            repository.updateProduct(productEntity)
        }
    }

    fun deleteProduct(){
        viewModelScope.launch {
            repository.deleteProduct(productEntity)
        }
    }

    fun getAllProducts(): List<ProductEntity>{
        var listOfProductEntities = listOf<ProductEntity>()
        viewModelScope.launch {
            listOfProductEntities = async {
                repository.getAllProducts()
            }.await()
        }
        return listOfProductEntities
    }
}