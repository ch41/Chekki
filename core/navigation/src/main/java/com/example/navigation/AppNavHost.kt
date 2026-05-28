package com.example.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.ui.screen.ScannerScreen
import com.example.navigation.model.AppDestinations
import com.example.ui.screen.DashboardScreen

@Composable
fun AppNavHost(
    navController: NavHostController = rememberNavController()
) {
    NavHost(
        navController = navController,
        startDestination = AppDestinations.Scanner
    ) {

        composable<AppDestinations.Dashboard> {
            DashboardScreen()
        }
        composable<AppDestinations.Scanner> {
            ScannerScreen(
                onBack = {
                    navController.popBackStack()
                }
            )
        }

    }
}