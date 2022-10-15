package com.example.unsplashclient.data.remote.dto


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class LinksXXXXX(
    val html: String,
    val photos: String,
    val related: String,
    val self: String
)