package com.example.unsplashclient.domain.repository

import com.example.unsplashclient.data.remote.dto.PhotoDetailDto
import com.example.unsplashclient.data.remote.dto.SearchPhotosResultDto

interface PhotoRepository {

    suspend fun searchPhotos(query: String): SearchPhotosResultDto

    suspend fun getPhotoById(photoId: String): PhotoDetailDto
}