package com.example.musicplayercompose.models

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector

data class TabsModel(
    val title: String,
    val icon: ImageVector,
    val screen: @Composable () -> Unit
)