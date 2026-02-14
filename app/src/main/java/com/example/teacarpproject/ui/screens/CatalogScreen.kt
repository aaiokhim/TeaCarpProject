package com.example.teacarpproject.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import com.example.teacarpproject.ui.theme.TeaCarpProjectTheme
import androidx.navigation.NavController
import com.example.teacarpproject.ui.navigation.Screen




@Composable
fun CatalogScreen() {
    Text(
        modifier = Modifier.fillMaxSize().wrapContentHeight(align = Alignment.CenterVertically),
        text = "CatalogScreen",
        color = Color.Black,
        textAlign = TextAlign.Center,
        fontSize = 24.sp
    )
}