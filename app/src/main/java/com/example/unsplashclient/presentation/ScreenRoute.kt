package com.example.unsplashclient.presentation

sealed class ScreenRoute(val route: String) {
    object SearchPhotoScreen : ScreenRoute("search_photo_screen")
    object PhotoDetailScreen : ScreenRoute("photo_detail_screen")
}