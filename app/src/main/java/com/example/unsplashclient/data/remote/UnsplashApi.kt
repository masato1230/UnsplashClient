package com.example.unsplashclient.data.remote

import com.example.unsplashclient.common.Constants
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface UnsplashApi {

    @Headers("Authorization: Client-ID ${Constants.API_KEY}")
    @GET("search/photos")
    suspend fun searchPhotos(@Query("query") query: String): SearchPhotosResultDto
}