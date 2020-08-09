package com.example.jsonapi.model

data class NewsModel(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)