package com.example.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.navigation.model.AppDestinations

@Composable
fun AppNavHost(
    navController: NavHostController = rememberNavController()
) {
    NavHost(
        navController = navController,
        startDestination = AppDestinations.Dashboard
    ) {

        composable<AppDestinations.Dashboard> {

        }

        composable<AppDestinations.Scanner> {
        }

        composable<AppDestinations.Receipts> {
        }

        composable<AppDestinations.Analytics> {
        }

        composable<AppDestinations.Settings> {
        }

        composable<AppDestinations.ReceiptDetails> { backStackEntry ->
      }
    }
}