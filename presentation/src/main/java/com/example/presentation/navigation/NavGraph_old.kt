/*package com.example.presentation.navigation

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
        startDestination = Screen.Catalog.route,
        modifier = modifier
    ) {
        composable(Screen.Catalog.route) {
            CatalogScreen()
        }

        composable(Screen.Profile.route) {
            ProfileScreen()
        }

        composable(Screen.Notes.route) {
            NotesScreen()
        }

        composable(Screen.Brewing.route) {
            BrewingScreen(
                openTeaDetail = { id ->
                    val route = Screen.TeaDetails.createById(id)
                    navHostController.navigate(route)
                }
            )
        }

        composable(Screen.Guide.route) {
            GuideScreen(
                openTeaDetail = { id ->
                    val route = Screen.TeaDetails.createById(id)
                    navHostController.navigate(route)
                }
            )
        }

        composable("TeaDetails/{teaId}") { backStackEntry ->
            val teaId = backStackEntry.arguments?.getString("teaId") ?: ""
            TeaDetailsScreen(
                teaId = teaId
            )
        }

    }

}*/