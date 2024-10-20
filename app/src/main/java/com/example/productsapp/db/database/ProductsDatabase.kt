package com.example.productsapp.db.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.productsapp.db.dao.ProductDao
import com.example.productsapp.db.entities.ProductEntity

@Database(entities = [ProductEntity::class], version = 1, exportSchema = false)
abstract class ProductsDatabase : RoomDatabase() {

    abstract fun productDao(): ProductDao
}