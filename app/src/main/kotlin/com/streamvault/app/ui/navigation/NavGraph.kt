package com.streamvault.app.ui.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Download
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.streamvault.app.ui.screens.HomeScreen
import com.streamvault.app.ui.screens.SearchScreen
import com.streamvault.app.ui.screens.DownloadsScreen
import com.streamvault.app.ui.screens.SettingsScreen

sealed class Screen(val route: String) {
    object Home : Screen("home")
    object Search : Screen("search")
    object Downloads : Screen("downloads")
    object Settings : Screen("settings")
}

@Composable
fun StreamVaultApp() {
    val navController = rememberNavController()
    Scaffold(bottomBar = { BottomNavigationBar(navController) }) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = Screen.Home.route,
            modifier = Modifier.padding(innerPadding)
        ) {
            composable(Screen.Home.route) { HomeScreen(navController) }
            composable(Screen.Search.route) { SearchScreen(navController) }
            composable(Screen.Downloads.route) { DownloadsScreen(navController) }
            composable(Screen.Settings.route) { SettingsScreen(navController) }
        }
    }
}

@Composable
private fun BottomNavigationBar(navController: NavHostController) {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination

    // FIX: Use Triple instead of nested Pairs to allow 3-variable destructuring
    val items = listOf(
        Triple(Screen.Home, "Home", Icons.Default.Home),
        Triple(Screen.Search, "Search", Icons.Default.Search),
        Triple(Screen.Downloads, "Downloads", Icons.Default.Download),
        Triple(Screen.Settings, "Settings", Icons.Default.Settings)
    )

    NavigationBar {
        items.forEach { (screen, label, icon) ->
            NavigationBarItem(
                icon = { Icon(icon, contentDescription = label) },
                label = { Text(label) },
                selected = currentDestination?.hierarchy?.any { it.route == screen.route } == true,
                onClick = {
                    navController.navigate(screen.route) {
                        popUpTo(navController.graph.findStartDestination().id) { saveState = true }
                        launchSingleTop = true
                        restoreState = true
                    }
                }
            )
        }
    }
}
