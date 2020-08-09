package com.example.model

import com.google.gson.annotations.SerializedName


data class ListModel(
    @SerializedName("urlToImage")
    val imgPhotoLink: String,
    @SerializedName("author")
    val namecompany: String,
    @SerializedName("title")
    val title: String,
    @SerializedName("description")
    val detail: String
) {
}

