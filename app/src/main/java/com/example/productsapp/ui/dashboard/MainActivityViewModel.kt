package com.example.productsapp.ui.dashboard

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.productsapp.db.entities.Product
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

    fun getAllProducts(): ArrayList<Product>{
        val listOfProducts = arrayListOf<Product>()
        var isListPopulated: Boolean = false
        viewModelScope.launch {
            isListPopulated = async {
                listOfProducts.addAll(repository.getAllProducts())
            }.await()
        }
        return if (isListPopulated) listOfProducts else arrayListOf()
    }
}