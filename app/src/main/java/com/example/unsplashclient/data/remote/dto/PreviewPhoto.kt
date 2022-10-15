package com.example.unsplashclient.data.remote.dto


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PreviewPhoto(
    @Json(name = "blur_hash")
    val blurHash: String,
    @Json(name = "created_at")
    val createdAt: String,
    val id: String,
    @Json(name = "updated_at")
    val updatedAt: String,
    val urls: UrlsXXXXXX
)