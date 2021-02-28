package com.example.newsapplication.ui.base

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.newsapplication.data.api.ApiHelper
import com.example.newsapplication.data.repository.NewsListRepositoryImpl
import com.example.newsapplication.ui.newslist.viewmodel.NewsListViewModel
import com.example.newsapplication.ui.newslist.viewmodel.ParallelNewsListViewModel
import com.example.newsapplication.ui.newslist.viewmodel.SeriesNewsListViewModel

class ViewModelFactory(private val apiHelper: ApiHelper) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(NewsListViewModel::class.java)) {
            return NewsListViewModel(NewsListRepositoryImpl(apiHelper)) as T
        }
        if (modelClass.isAssignableFrom(SeriesNewsListViewModel::class.java)) {
            return SeriesNewsListViewModel(NewsListRepositoryImpl(apiHelper)) as T
        }
        if (modelClass.isAssignableFrom(ParallelNewsListViewModel::class.java)) {
            return ParallelNewsListViewModel(NewsListRepositoryImpl(apiHelper)) as T
        }
        throw IllegalArgumentException("Unknown class name")
    }

}