package com.example.unsplashclient.data.remote


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Exif(
    val aperture: String?,
    @Json(name = "exposure_time")
    val exposureTime: String?,
    @Json(name = "focal_length")
    val focalLength: String?,
    val iso: Int?,
    val make: String?,
    val model: String?,
    val name: String?
)