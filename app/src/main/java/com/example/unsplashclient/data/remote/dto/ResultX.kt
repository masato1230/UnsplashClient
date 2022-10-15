package com.example.unsplashclient.data.remote.dto


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ResultX(
    @Json(name = "cover_photo")
    val coverPhoto: CoverPhoto,
    val curated: Boolean,
    val description: String,
    val featured: Boolean,
    val id: String,
    @Json(name = "last_collected_at")
    val lastCollectedAt: String,
    val links: LinksXXXXX,
    @Json(name = "preview_photos")
    val previewPhotos: List<PreviewPhoto>,
    val `private`: Boolean,
    @Json(name = "published_at")
    val publishedAt: String,
    @Json(name = "share_key")
    val shareKey: String,
    val tags: List<Tag>,
    val title: String,
    @Json(name = "total_photos")
    val totalPhotos: Int,
    @Json(name = "updated_at")
    val updatedAt: String,
    val user: UserXXX
)