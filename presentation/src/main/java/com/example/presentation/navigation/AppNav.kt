package com.example.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import com.example.presentation.ui.screens.*


/*@Composable
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
}*/


@Composable
fun AppNav() {
    val navController = rememberNavController()
    MainNav(
        navHostController = navController
    )

}