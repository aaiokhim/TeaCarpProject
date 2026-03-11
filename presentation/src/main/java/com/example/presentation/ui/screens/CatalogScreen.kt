package com.example.presentation.ui.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import com.example.presentation.ui.theme.TeaCarpAppTheme

import com.example.presentation.ui.theme.mainTitleColor


@Composable
fun CatalogScreen() {
    Text(
        modifier = Modifier.fillMaxSize().wrapContentHeight(align = Alignment.CenterVertically),
        text = "CatalogScreen",
        color = MaterialTheme.colorScheme.onBackground,
        textAlign = TextAlign.Center,
        fontSize = 24.sp
    )
}