package com.example.teacarpproject.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.ui.unit.dp
import com.example.teacarpproject.ui.data.teaTypes

@Composable
fun TeaDetailsScreen(
    teaId: String
) {
    val tea = teaTypes.find { it.id == teaId }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        if (tea != null) {
            Text(
                text = tea.title,
                style = MaterialTheme.typography.headlineLarge,
                modifier = Modifier.padding(bottom = 16.dp)
            )

            Text(
                text = tea.description,
            )
        }
    }
}