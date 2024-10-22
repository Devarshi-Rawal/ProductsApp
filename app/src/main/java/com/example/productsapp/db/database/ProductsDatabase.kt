package com.example.productsapp.db.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.productsapp.db.dao.ProductDao
import com.example.productsapp.ui.dashboard.dashboard.models.Product

@Database(entities = [Product::class], version = 1, exportSchema = false)
abstract class ProductsDatabase : RoomDatabase() {

    abstract fun productDao(): ProductDao
}