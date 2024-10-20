package com.example.productsapp.db.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "products")
data class Product(
    @PrimaryKey(autoGenerate = false)
    val id: Int,
    val productName: String,
    val originalPrice: String,
    val salePrice: String,
    val activeStatus: Boolean,
    val date: String){

    constructor(): this(0,"","","",false, "")
}