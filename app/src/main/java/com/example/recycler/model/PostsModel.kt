package com.example.recycler.model


data class PostsModel(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)