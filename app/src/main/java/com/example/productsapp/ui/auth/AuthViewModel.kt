package com.example.productsapp.ui.auth

import android.text.Editable
import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.productsapp.ui.auth.data.AuthRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AuthViewModel @Inject constructor(private val repository: AuthRepository) : ViewModel(){

    val emailStateFlow: StateFlow<String> = repository._emailMutableStateFlow
    val passwordStateFlow: StateFlow<String> = repository._passwordMutableStateFlow

    fun afterEmailTextChanged(editable: Editable?){
        viewModelScope.launch {
            repository.afterEmailTextChanged(editable)
        }
    }

    fun afterPasswordTextChanged(editable: Editable?){
        viewModelScope.launch {
            repository.afterPasswordTextChanged(editable)
        }
    }

    fun loginUser(){
        viewModelScope.launch {
            repository.loginUser(emailStateFlow.toString(),passwordStateFlow.toString())
        }
    }
}