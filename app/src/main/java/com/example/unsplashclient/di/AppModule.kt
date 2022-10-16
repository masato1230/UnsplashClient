package com.example.unsplashclient.di

import com.example.unsplashclient.common.Constants.BASE_URL
import com.example.unsplashclient.data.remote.UnsplashApi
import com.example.unsplashclient.data.repository.PhotoRepositoryImpl
import com.example.unsplashclient.domain.repository.PhotoRepository
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun providePaprikaApi(): UnsplashApi {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(
                MoshiConverterFactory.create(
                    Moshi.Builder().add(KotlinJsonAdapterFactory()).build()
                )
            )
            .build()
            .create(UnsplashApi::class.java)
    }

    @Provides
    @Singleton
    fun providePhotoRepository(api: UnsplashApi): PhotoRepository {
        return PhotoRepositoryImpl(api)
    }
}