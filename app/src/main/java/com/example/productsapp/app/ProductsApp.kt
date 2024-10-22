package com.example.productsapp.app

import android.app.Application
import android.content.SharedPreferences
import com.example.productsapp.utils.Constants
import com.example.productsapp.utils.putAny
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class ProductsApp : Application(){

    lateinit var prefs: SharedPreferences

    override fun onCreate() {
        super.onCreate()
        prefs = this.getSharedPreferences(Constants.PREF_APP, MODE_PRIVATE)
    }

    fun setLoginToken(token: String){
        prefs.putAny(Constants.LOGIN_TOKEN,token)
    }

    fun getLoginToken(): String{
        return prefs.getString(Constants.LOGIN_TOKEN,"").toString()
    }
}