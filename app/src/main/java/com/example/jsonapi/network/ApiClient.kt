package com.example.jsonapi.network

import android.util.Log
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


object ApiClient {
    private lateinit var postService: PostService

    fun getClient(): PostService {
        postService =
            Retrofit.Builder().baseUrl("https://newsapi.org/v2/")
                .addConverterFactory(
                    GsonConverterFactory
                        .create()
                )
                .build()
                .create(PostService::class.java)
        Log.d("ApiClient", "Retrofit creation successful")
        return postService
    }
}