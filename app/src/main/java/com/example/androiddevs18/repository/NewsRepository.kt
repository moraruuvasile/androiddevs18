package com.example.androiddevs18.repository

import com.example.androiddevs18.api.RetrofitInstance
import com.example.androiddevs18.db.ArticleDatabase

class NewsRepository(
    val db: ArticleDatabase
) {
    suspend fun getBreakingNews(countryCode: String, pageNumber: Int) =
        RetrofitInstance.api.getBreakingNews(countryCode, pageNumber)
}