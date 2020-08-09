package com.example.jsonapi.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


object ApiClient {
    private var retrofit: Retrofit? = null

    fun getClient(): Retrofit? {
        if (retrofit == null)
            retrofit =
                Retrofit.Builder().baseUrl("http://newsapi.org/v2/")
                    .addConverterFactory(
                        GsonConverterFactory
                            .create()
                    )
                    .build()
        return retrofit
    }
}