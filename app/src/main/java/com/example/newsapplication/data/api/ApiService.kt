package com.example.newsapplication.data.api

import com.example.newsapplication.data.model.News
import retrofit2.http.GET

interface ApiService {

    @GET("news")
    suspend fun getNews(): List<News>

    @GET("more-news")
    suspend fun getMoreNews(): List<News>

}