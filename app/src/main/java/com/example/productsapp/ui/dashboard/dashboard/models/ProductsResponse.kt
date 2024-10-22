package com.example.productsapp.ui.dashboard.dashboard.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

data class ProductsResponse(
	@SerializedName("message")
	val productList: List<Product>,
	val status: Boolean)

@Entity(tableName = "product")
data class Product(
	val originalPrice: String,
	val productType: Int,
	val activeStatus: Boolean,
	val dateNTime: String,
	val V: Int,
	val description: String,
	@PrimaryKey(autoGenerate = false)
	val id: Int,
	val productName: String,
	val salePrice: String,
	val userRowId: Int
){
	constructor(): this("",0,false,"",0,"",
		0,"","",0)
}

