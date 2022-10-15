package com.example.unsplashclient.data.remote.dto


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class UrlsXXXXXX(
    val full: String,
    val raw: String,
    val regular: String,
    val small: String,
    @Json(name = "small_s3")
    val smallS3: String,
    val thumb: String
)