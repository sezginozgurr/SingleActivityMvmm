package com.example.model


data class PostsModel(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)