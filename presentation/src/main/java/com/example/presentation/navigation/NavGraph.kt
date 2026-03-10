package com.example.presentation.navigation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import androidx.navigation.createGraph
import androidx.navigation.navigation
import com.example.presentation.ui.screens.*

@Composable
fun MainNav(
    navHostController: NavHostController, //= rememberNavController() почему не remember??
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navHostController,
        startDestination = "main_graph"
    ) {
        composable(route = "main_graph") {
            val currentNavController = rememberNavController()
            Scaffold(
                bottomBar = {
                    BottomBar(navController = currentNavController)
                }
            ) { innerPadding: PaddingValues ->
                Box(modifier = Modifier.padding(innerPadding)) {
                    NavHost(
                        navController = currentNavController,
                        startDestination = "Catalog",
                        modifier = modifier
                    ) {

                        composable(Screen.Catalog.route) {
                            CatalogScreen()
                        }

                        composable("Profile") {
                            ProfileScreen()
                        }

                        composable("Notes") {
                            NotesScreen()
                        }

                        composable("Guide") {
                            GuideScreen(
                                openTeaDetail = { id ->
                                    val route = Screen.TeaDetails.createById(id)
                                    navHostController.navigate(route)
                                }
                            )
                        }
                    }
                }
            }
        }

        composable(Screen.TeaDetails.route) { backStackEntry ->
            val teaId = backStackEntry.arguments?.getString("teaId") ?: ""
            TeaDetailsScreen(teaId = teaId)
        }

        composable(Screen.Settings.route) { backStackEntry ->
            SettingsScreen()
        }
    }

}