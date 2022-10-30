package com.example.unsplashclient.data.remote


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class UserX(
    val bio: String?,
    val id: String?,
    val links: LinksXXX?,
    val location: String?,
    val name: String?,
    @Json(name = "portfolio_url")
    val portfolioUrl: String?,
    @Json(name = "total_collections")
    val totalCollections: Int?,
    @Json(name = "total_likes")
    val totalLikes: Int?,
    @Json(name = "total_photos")
    val totalPhotos: Int?,
    @Json(name = "updated_at")
    val updatedAt: String?,
    val username: String?
)