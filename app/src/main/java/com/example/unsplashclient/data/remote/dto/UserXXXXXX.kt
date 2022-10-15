package com.example.unsplashclient.data.remote.dto


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class UserXXXXXX(
    @Json(name = "accepted_tos")
    val acceptedTos: Boolean,
    val bio: Any,
    @Json(name = "first_name")
    val firstName: String,
    @Json(name = "for_hire")
    val forHire: Boolean,
    val id: String,
    @Json(name = "instagram_username")
    val instagramUsername: Any,
    @Json(name = "last_name")
    val lastName: String,
    val links: LinksXXXXXXXXXXXXX,
    val location: Any,
    val name: String,
    @Json(name = "portfolio_url")
    val portfolioUrl: Any,
    @Json(name = "profile_image")
    val profileImage: ProfileImageXXXXXX,
    val social: SocialXXXXX,
    @Json(name = "total_collections")
    val totalCollections: Int,
    @Json(name = "total_likes")
    val totalLikes: Int,
    @Json(name = "total_photos")
    val totalPhotos: Int,
    @Json(name = "twitter_username")
    val twitterUsername: Any,
    @Json(name = "updated_at")
    val updatedAt: String,
    val username: String
)