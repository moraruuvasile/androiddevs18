package com.example.androiddevs18.data.repositories

import android.app.Application
import com.example.androiddevs18.data.db.ShoppingDatabase
import com.example.androiddevs18.data.db.entities.ShoppingItem


class ShoppingRepository(val application: Application) {

    private val db: ShoppingDatabase = ShoppingDatabase.getInstance(application)

    suspend fun upsert(item: ShoppingItem) = db.getShoppingDao().upsert(item)

    suspend fun delete(item: ShoppingItem) = db.getShoppingDao().delete(item)

    fun getAllShoppingItems() = db.getShoppingDao().getAllShoppingItems()
}