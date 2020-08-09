package com.example.jsonapi.network

import com.example.recycler.model.PostsModel
import retrofit2.Call
import retrofit2.http.GET


interface PostService {
    @GET("top-headlines?country=tr&apiKey=3731ae5c419e41faa755f7a7d174fe60")
    fun listPost(): Call<PostsModel>
}

//"top-headlines?country=tr&apiKey=3731ae5c419e41faa755f7a7d174fe60"