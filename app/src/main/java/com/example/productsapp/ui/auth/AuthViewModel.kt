package com.example.productsapp.ui.auth

import androidx.lifecycle.ViewModel
import com.example.productsapp.ui.auth.data.AuthRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class AuthViewModel @Inject constructor(val repository: AuthRepository) : ViewModel(){
}