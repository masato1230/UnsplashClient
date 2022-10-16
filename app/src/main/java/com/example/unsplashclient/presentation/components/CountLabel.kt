package com.example.unsplashclient.presentation.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp

@Composable
fun CountLabel(
    imageVector: ImageVector,
    count: Int,
    modifier: Modifier = Modifier,
    color: Color = Color.Unspecified,
    iconTint: Color = LocalContentColor.current.copy(alpha = LocalContentAlpha.current),
) {
    Row(modifier = modifier) {
        Icon(
            imageVector = imageVector,
            contentDescription = null,
            tint = iconTint,
        )
        Spacer(modifier = Modifier.width(5.dp))
        Text(
            text = count.toString(),
            color = color,
            style = MaterialTheme.typography.body1,
        )
    }
}