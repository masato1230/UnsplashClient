package com.example.unsplashclient.domain.model

data class Photo(
    val photoId: String,
    val description: String?,
    val likes: Int?,
    val imageUrl: String,
    val photographer: String?,
)
