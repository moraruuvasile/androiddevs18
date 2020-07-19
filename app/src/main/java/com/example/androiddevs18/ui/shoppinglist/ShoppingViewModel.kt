package com.example.androiddevs18.ui.shoppinglist


import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import com.example.androiddevs18.data.db.entities.ShoppingItem
import com.example.androiddevs18.data.repositories.ShoppingRepository

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class ShoppingViewModel : AndroidViewModel {
     val repository: ShoppingRepository

    constructor(application: Application) : super(application) {
        repository = ShoppingRepository(application)
    }

    fun upsert(item: ShoppingItem) =
        GlobalScope.launch {
            repository.upsert(item)
        }

    fun delete(item: ShoppingItem) = GlobalScope.launch {
        repository.delete(item)
    }

    fun getAllShoppingItems() = repository.getAllShoppingItems()

}
