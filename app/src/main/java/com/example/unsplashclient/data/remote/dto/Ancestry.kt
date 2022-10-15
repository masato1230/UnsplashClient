package com.example.unsplashclient.data.remote.dto


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Ancestry(
    val category: Category,
    val subcategory: Subcategory,
    val type: Type
)