package com.example.unsplashclient.data.remote


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PhotoDetailDto(
    @Json(name = "blur_hash")
    val blurHash: String?,
    val color: String?,
    @Json(name = "created_at")
    val createdAt: String?,
    @Json(name = "current_user_collections")
    val currentUserCollections: List<CurrentUserCollection>?,
    val description: String?,
    val downloads: Int?,
    val exif: Exif?,
    val height: Int?,
    val id: String?,
    @Json(name = "liked_by_user")
    val likedByUser: Boolean?,
    val likes: Int?,
    val links: LinksXX?,
    val location: Location?,
    @Json(name = "public_domain")
    val publicDomain: Boolean?,
    val tags: List<Tag>?,
    @Json(name = "updated_at")
    val updatedAt: String?,
    val urls: UrlsX?,
    val user: UserX?,
    val width: Int?
)