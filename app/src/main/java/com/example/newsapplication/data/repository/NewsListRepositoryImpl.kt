package com.example.newsapplication.data.repository

import com.example.newsapplication.data.api.ApiHelper

class NewsListRepositoryImpl(private val apiHelper: ApiHelper) : NewsListRepository {

    override suspend fun getNews() = apiHelper.getNews()

    override suspend fun getMoreNews() = apiHelper.getMoreNews()

}