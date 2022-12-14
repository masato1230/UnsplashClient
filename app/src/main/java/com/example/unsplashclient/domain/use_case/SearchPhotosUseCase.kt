package com.example.unsplashclient.domain.use_case

import android.util.Log
import com.example.unsplashclient.common.NetworkResponse
import com.example.unsplashclient.data.remote.toPhotos
import com.example.unsplashclient.domain.model.Photo
import com.example.unsplashclient.domain.repository.PhotoRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class SearchPhotosUseCase @Inject constructor(
    private val repository: PhotoRepository,
) {
    operator fun invoke(query: String): Flow<NetworkResponse<List<Photo>>> = flow {
        try {
            emit(NetworkResponse.Loading<List<Photo>>())
            Log.d("Loading", "loadingoading")
            val photos = repository.searchPhotos(query).toPhotos()
            Log.d("Success", "kd")
            emit(NetworkResponse.Success<List<Photo>>(photos))
        } catch (e: Exception) {
            e.printStackTrace()
            emit(NetworkResponse.Failure<List<Photo>>(e.message.toString()))
        }
    }
}