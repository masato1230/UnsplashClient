package com.example.unsplashclient.data.remote.dto


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CoverPhotoX(
    @Json(name = "alt_description")
    val altDescription: String,
    @Json(name = "blur_hash")
    val blurHash: String,
    val color: String,
    @Json(name = "created_at")
    val createdAt: String,
    @Json(name = "current_user_collections")
    val currentUserCollections: List<Any>,
    val description: String,
    val height: Int,
    val id: String,
    @Json(name = "liked_by_user")
    val likedByUser: Boolean,
    val likes: Int,
    val links: LinksXXXXXX,
    @Json(name = "promoted_at")
    val promotedAt: String,
    val sponsorship: Any,
    @Json(name = "topic_submissions")
    val topicSubmissions: TopicSubmissionsX,
    @Json(name = "updated_at")
    val updatedAt: String,
    val urls: UrlsXXXXXX,
    val user: UserXX,
    val width: Int
)