package com.example.productsapp.ui.auth.register

import androidx.lifecycle.ViewModel
import com.example.productsapp.ui.auth.register.data.RegisterRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class RegisterViewModel @Inject constructor(val repository: RegisterRepository): ViewModel() {


}