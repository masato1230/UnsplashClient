package com.example.unsplashclient.data.remote


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class LinksXX(
    val download: String?,
    @Json(name = "download_location")
    val downloadLocation: String?,
    val html: String?,
    val self: String?
)