package com.example.unsplashclient.data.remote.dto


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class SourceXX(
    val ancestry: AncestryXX,
    @Json(name = "cover_photo")
    val coverPhoto: CoverPhotoXXX,
    val description: String,
    @Json(name = "meta_description")
    val metaDescription: String,
    @Json(name = "meta_title")
    val metaTitle: String,
    val subtitle: String,
    val title: String
)