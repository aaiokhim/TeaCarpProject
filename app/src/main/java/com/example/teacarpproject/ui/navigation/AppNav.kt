package com.example.teacarpproject.ui.navigation

import androidx.compose.material3.NavigationBar
import androidx.compose.runtime.Composable
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.navigation.compose.composable
import com.example.teacarpproject.ui.screens.*
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding

//import com.example.teacarpproject.ui.navigation.NavGraph

@Composable
fun AppNav() {
    val navController = rememberNavController()
    Scaffold(
        bottomBar = {
            BottomBar(navController = navController)
        }
    ) { innerPadding: PaddingValues ->
        MainNav(
            navHostController = navController,
            modifier = Modifier.padding(innerPadding)
        )
    }
}