package com.example.teacarpproject.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.example.teacarpproject.ui.theme.TeaCarpProjectTheme
import com.example.teacarpproject.ui.navigation.Screen

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.ui.unit.dp
import com.example.teacarpproject.ui.data.teaTypes
import com.example.teacarpproject.ui.data.TeaType

@Composable
fun GuideScreen(
    navController: NavController
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
                    navController.navigate("TeaDetails/${teaType.id}")
                }
            )
        }
    }
}

@Composable
fun TeaTypeCard(
    teaType: TeaType,
    onClick: () -> Unit
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(100.dp),
        shape = MaterialTheme.shapes.medium,
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.primaryContainer,
            contentColor = MaterialTheme.colorScheme.onPrimaryContainer
        ),
        onClick = onClick
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = teaType.title
            )

            Spacer(modifier = Modifier.height(4.dp))

            Text(
                text = teaType.description
            )
        }
    }
}
