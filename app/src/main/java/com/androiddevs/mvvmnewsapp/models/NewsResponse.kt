package com.androiddevs.mvvmnewsapp.models

import androidx.lifecycle.MutableLiveData
import com.androiddevs.mvvmnewsapp.models.Article

data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)