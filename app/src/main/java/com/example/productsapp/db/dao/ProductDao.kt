package com.example.productsapp.db.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.productsapp.ui.dashboard.dashboard.models.Product

@Dao
interface ProductDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insertProduct(product: Product)

    @Update
    fun updateProduct(product: Product)

    @Delete
    fun deleteProduct(product: Product)

    @Query("SELECT * FROM product")
    fun getAllProducts(): List<Product>
}