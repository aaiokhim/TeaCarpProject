package com.example.teacarpproject.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.composable
import com.example.teacarpproject.ui.screens.*
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost

@Composable
fun MainNav(
    navHostController: NavHostController, //= rememberNavController()
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navHostController,
        startDestination = "Catalog",
        modifier = modifier
    ) {
        composable("Catalog") {
            CatalogScreen()
        }

        composable("Profile") {
            ProfileScreen()
        }

        composable("Notes") {
            NotesScreen()
        }

        composable("Brewing") {
            BrewingScreen()
        }

        composable("Guide") {
                GuideScreen()
        }

    }

}