package com.example.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost

import com.example.presentation.ui.screens.*

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
            BrewingScreen(navHostController)
        }

        composable("Guide") {
                GuideScreen(navHostController)
        }

        composable("TeaDetails/{teaId}") { backStackEntry ->
            val teaId = backStackEntry.arguments?.getString("teaId") ?: ""
            TeaDetailsScreen(
                teaId = teaId
            )
        }

    }

}