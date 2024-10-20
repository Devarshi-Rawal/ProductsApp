package com.example.productsapp.ui.dashboard.dashboard.models

import com.google.gson.annotations.SerializedName

data class ProductsResponse(
	@SerializedName("message")
	val productList: List<Product>,
	val status: Boolean)

data class Product(
	val originalPrice: String,
	val productType: Int,
	val activeStatus: Boolean,
	val dateNTime: String,
	val V: Int,
	val description: String,
	val id: Int,
	val productName: String,
	val salePrice: String,
	val userRowId: Int
)

