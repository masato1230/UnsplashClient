package com.example.unsplashclient.presentation.photo_detail

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Share
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import coil.compose.AsyncImage
import com.example.unsplashclient.domain.model.PhotoDetail
import com.example.unsplashclient.presentation.components.CountLabel

@Composable
fun PhotoDetailScreen(
    viewModel: PhotoDetailViewModel = hiltViewModel(),
) {
    val state = viewModel.state.value

    Box(modifier = Modifier.fillMaxSize()) {
        when {
            state.isLoading -> {
                CircularProgressIndicator(modifier = Modifier.align(Alignment.Center))
            }
            !state.error.isNullOrBlank() -> {
                Text(
                    text = state.error,
                    modifier = Modifier.align(Alignment.Center),
                    color = MaterialTheme.colors.error,
                )
            }
            else -> {
                state.photoDetail?.let { photoDetail ->
                    PhotoDetailContent(photoDetail = photoDetail)
                }
            }
        }
    }
}

@Composable
private fun PhotoDetailContent(photoDetail: PhotoDetail) {
    Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
        Box(modifier = Modifier.heightIn(200.dp)) {
            var isLoadingImage by remember { mutableStateOf(true) }
            if (isLoadingImage) {
                CircularProgressIndicator(
                    modifier = Modifier.align(Alignment.Center)
                )
            }
            AsyncImage(
                model = photoDetail.imageUrl,
                contentDescription = photoDetail.description,
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(
                        RoundedCornerShape(
                            topStartPercent = 0,
                            topEndPercent = 0,
                            bottomStartPercent = 5,
                            bottomEndPercent = 5,
                        )
                    ),
                onSuccess = { isLoadingImage = false },
            )
        }
        Column(Modifier.padding(10.dp)) {

            // Description
            Text(
                text = photoDetail.description ?: "No description",
                style = MaterialTheme.typography.h6,
            )
            Spacer(modifier = Modifier.height(5.dp))
            // Photographer
            Text(
                text = photoDetail.photographer ?: "Unknown photographer",
                style = MaterialTheme.typography.body2,
            )
            Spacer(modifier = Modifier.height(20.dp))
            // likes
            CountLabel(
                imageVector = Icons.Default.Favorite,
                count = photoDetail.likes ?: 0,
                iconTint = Color.Magenta,
            )
            // downloads
            CountLabel(
                imageVector = Icons.Default.Share,
                count = photoDetail.downloads ?: 0,
                iconTint = Color.Green,
            )
            Spacer(modifier = Modifier.height(20.dp))
            // Camera
            Text(text = "Camera: ${photoDetail.camera}")
            // Location
            Text(text = "Location: ${photoDetail.location}")
        }
    }
}