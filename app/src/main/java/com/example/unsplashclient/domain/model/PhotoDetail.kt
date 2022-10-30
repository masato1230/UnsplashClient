package com.example.unsplashclient.domain.model

data class PhotoDetail(
    val description: String?,
    val likes: Int?,
    val imageUrl: String,
    val photographer: String?,
    val camera: String?,
    val location: String?,
    val downloads: Int?,
)
