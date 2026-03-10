package com.example.presentation.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.ui.unit.dp
import com.example.presentation.data.teaTypes
import com.example.presentation.ui.components.TeaTypeCard
import com.example.presentation.data.TeaType

@Composable
fun GuideScreen(
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
