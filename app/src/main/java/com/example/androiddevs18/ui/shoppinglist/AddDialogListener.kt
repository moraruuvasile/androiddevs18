package com.example.androiddevs18.ui.shoppinglist

import com.example.androiddevs18.data.db.entities.ShoppingItem


interface AddDialogListener {
    fun onAddButtonClicked(item: ShoppingItem)
}