package com.example.productsapp.ui.auth.login

import androidx.lifecycle.ViewModel
import com.example.productsapp.ui.auth.login.data.LoginRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(val repository: LoginRepository): ViewModel() {
}