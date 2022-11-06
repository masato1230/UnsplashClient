package com.example.unsplashclient.presentation.search_photos

import com.example.unsplashclient.domain.model.Photo

data class SearchPhotosState(
    val isLoading: Boolean = false,
    val photos: List<Photo> = emptyList(),
    val error: String? = null,
)
