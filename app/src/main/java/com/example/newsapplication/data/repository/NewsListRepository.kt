package com.example.newsapplication.data.repository

import com.example.newsapplication.data.model.News

interface NewsListRepository {

    suspend fun getNews(): List<News>

    suspend fun getMoreNews(): List<News>

}