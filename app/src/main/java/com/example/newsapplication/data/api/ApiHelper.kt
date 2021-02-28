package com.example.newsapplication.data.api

import com.example.newsapplication.data.model.News


interface ApiHelper {

    suspend fun getNews(): List<News>

    suspend fun getMoreNews(): List<News>

}