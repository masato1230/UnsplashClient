package com.example.unsplashclient.data.remote.dto


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RelatedCollections(
    val results: List<ResultX>,
    val total: Int,
    val type: String
)