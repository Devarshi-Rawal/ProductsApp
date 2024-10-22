package com.example.productsapp.ui.auth

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.productsapp.ui.auth.data.AuthRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AuthViewModel @Inject constructor(private val repository: AuthRepository) : ViewModel(){

    fun loginUser(email: String, password: String){
        viewModelScope.launch {
            repository.loginUser(email,password)
        }
    }
}