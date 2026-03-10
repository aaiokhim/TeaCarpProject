package com.example.presentation.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.presentation.data.teaTypes
import com.example.presentation.ui.components.TeaTypeCard
import com.example.presentation.data.TeaType

@Composable
fun BrewingScreen(
    openTeaDetail: (String) -> Unit,
) {
    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(12.dp),
        contentPadding = PaddingValues(16.dp)
    ) {
        items(teaTypes) { teaType ->
            TeaTypeCard(
                teaType = teaType,
                onClick = {
                    openTeaDetail(teaType.id)
                }
            )
        }
    }
}
