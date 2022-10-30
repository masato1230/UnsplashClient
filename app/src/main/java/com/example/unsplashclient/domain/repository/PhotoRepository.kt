package com.example.unsplashclient.domain.repository

import com.example.unsplashclient.data.remote.SearchPhotosResultDto

interface PhotoRepository {

    suspend fun searchPhotos(query: String): SearchPhotosResultDto
}