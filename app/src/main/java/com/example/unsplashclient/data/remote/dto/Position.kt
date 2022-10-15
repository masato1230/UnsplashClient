package com.example.unsplashclient.data.remote.dto


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Position(
    val latitude: Double,
    val longitude: Double
)