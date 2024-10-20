package com.example.productsapp.di

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.productsapp.db.dao.ProductDao
import com.example.productsapp.db.database.ProductsDatabase
import com.example.productsapp.utils.Constants
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    @Singleton
    fun providesDatabase(@ApplicationContext appContext: Context): ProductsDatabase{
        return Room.databaseBuilder(appContext,ProductsDatabase::class.java,Constants.PRODUCT_DB)
            .build()
    }

    @Provides
    @Singleton
    fun providesDao(productsDatabase: ProductsDatabase): ProductDao = productsDatabase.productDao()
}