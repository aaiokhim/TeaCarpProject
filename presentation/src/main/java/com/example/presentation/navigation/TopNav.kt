package com.example.presentation.navigation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.material3.Text
import com.example.presentation.R

interface TopBar{
    @Composable
    fun ContentForTopBar(modifier: Modifier = Modifier)
}

class CatalogScreenTopBar: TopBar {
    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    override fun ContentForTopBar(modifier: Modifier) {
        TopAppBar(
            title = { Text(Screen.Catalog.title) },
            modifier = modifier
        )
    }
}

class NotesScreenTopBar: TopBar {
    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    override fun ContentForTopBar(modifier: Modifier) {
        TopAppBar(
            title = { Text(Screen.Notes.title) },
            modifier = modifier
        )

    }
}

class GuideScreenTopBar: TopBar {
    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    override fun ContentForTopBar(modifier: Modifier) {
        TopAppBar(
            title = { Text(Screen.Guide.title) },
            modifier = modifier
        )
    }
}

class ProfileScreenTopBar: TopBar {
    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    override fun ContentForTopBar(modifier: Modifier) {
        TopAppBar(
            title = {Text(Screen.Profile.title)},
            modifier = modifier
        )
    }
}

class LoginScreenTopBar: TopBar {
    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    override fun ContentForTopBar(modifier: Modifier) {
        TopAppBar(
            title = {Text(Screen.Login.title)},
            modifier = modifier
        )
    }
}

class SettingsScreenTopBar: TopBar {
    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    override fun ContentForTopBar(modifier: Modifier) {
        TopAppBar(
            title = {Text(Screen.Settings.title)},
            modifier = modifier
        )
    }
}

class TeaDetailsScreenTopBar: TopBar {
    private val teaId: String
    constructor(teaId: String) {
        this.teaId = teaId
    }

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable

    override fun ContentForTopBar(modifier: Modifier) {
        TopAppBar(
            title = {Text(Screen.TeaDetails.title)},
            modifier = modifier
        )
    }
}

@Composable
fun ScreenWithTopBar(
    topBar: TopBar,
    content: @Composable (PaddingValues) -> Unit
) {
    Scaffold(
        topBar = {
            topBar.ContentForTopBar()
        }
    ) { innerPadding ->
        Box(modifier = Modifier.padding(innerPadding)) {
            content(innerPadding)
        }
    }
}


