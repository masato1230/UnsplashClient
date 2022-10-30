package com.example.unsplashclient.data.remote


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CurrentUserCollection(
    @Json(name = "cover_photo")
    val coverPhoto: Any?,
    val id: Int?,
    @Json(name = "last_collected_at")
    val lastCollectedAt: String?,
    @Json(name = "published_at")
    val publishedAt: String?,
    val title: String?,
    @Json(name = "updated_at")
    val updatedAt: String?,
    val user: Any?
)