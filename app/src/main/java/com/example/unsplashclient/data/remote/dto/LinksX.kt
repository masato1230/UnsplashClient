package com.example.unsplashclient.data.remote.dto


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class LinksX(
    val html: String?,
    val likes: String?,
    val photos: String?,
    val self: String?
)