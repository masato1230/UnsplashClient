package com.example.unsplashclient.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.unsplashclient.presentation.search_photos.SearchPhotosScreen
import com.example.unsplashclient.presentation.ui.theme.UnsplashClientTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UnsplashClientTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    val navController = rememberNavController()
                    NavHost(
                        navController = navController,
                        startDestination = ScreenRoute.SearchPhotosScreen.route,
                    ) {
                        // 画像検索画面
                        composable(route = ScreenRoute.SearchPhotosScreen.route) {
                            SearchPhotosScreen(navController)
                        }
                        // 画像詳細表示画面
                        composable(route = ScreenRoute.PhotoDetailScreen.route + "/{photoId}") {
                            Text(text = "画像詳細表示画面")
                        }
                    }
                }
            }
        }
    }
}