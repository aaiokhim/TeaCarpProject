package com.example.presentation.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.ui.unit.dp
import com.example.presentation.data.teaTypes
import com.example.presentation.ui.theme.subTitle

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
                modifier = Modifier.padding(bottom = 16.dp),
                color = MaterialTheme.colorScheme.onBackground
            )

            Text(
                text = tea.baseDescription,
                color = MaterialTheme.colorScheme.subTitle
            )

            Text(
                text = tea.brewing,
                style = MaterialTheme.typography.headlineMedium,
                modifier = Modifier.padding(bottom = 16.dp)
            )

            Text(
                text = tea.fastBrew,
                style = MaterialTheme.typography.headlineMedium,
                modifier = Modifier.padding(bottom = 16.dp),
                color = MaterialTheme.colorScheme.subTitle
            )

            Text(
                text = tea.fastBrewDescription,
            )

            Text(
                text = tea.longBrew,
                style = MaterialTheme.typography.headlineMedium,
                modifier = Modifier.padding(bottom = 16.dp),
                color = MaterialTheme.colorScheme.subTitle
            )

            Text(
                text = tea.longBrewDescription,
            )
        }
    }
}