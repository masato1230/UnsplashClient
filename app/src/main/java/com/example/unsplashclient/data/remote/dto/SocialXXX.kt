package com.example.unsplashclient.data.remote.dto


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class SocialXXX(
    @Json(name = "instagram_username")
    val instagramUsername: String,
    @Json(name = "paypal_email")
    val paypalEmail: Any,
    @Json(name = "portfolio_url")
    val portfolioUrl: String,
    @Json(name = "twitter_username")
    val twitterUsername: Any
)