package com.example.unsplashclient.data.remote.dto


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Spirituality(
    @Json(name = "approved_on")
    val approvedOn: String,
    val status: String
)