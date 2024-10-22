package com.example.productsapp.utils

import android.content.SharedPreferences
import android.util.Log

fun SharedPreferences.putAny(name: String, any: Any) {
    when (any) {
        is String -> edit().putString(name, any).apply()
        is Int -> edit().putInt(name, any).apply()
        is Boolean -> edit().putBoolean(name,any).apply()
    }
}

fun SharedPreferences.remove(name:String){
    edit().remove(name).apply()
}