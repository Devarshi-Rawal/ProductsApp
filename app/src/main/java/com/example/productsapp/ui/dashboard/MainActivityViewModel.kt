package com.example.productsapp.ui.dashboard

import androidx.lifecycle.ViewModel
import com.example.productsapp.ui.dashboard.data.MainActivityRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainActivityViewModel @Inject constructor(val repository: MainActivityRepository): ViewModel() {
}