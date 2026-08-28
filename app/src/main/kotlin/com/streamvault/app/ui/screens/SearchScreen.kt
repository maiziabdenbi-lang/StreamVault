package com.streamvault.app.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun SearchScreen(navController: NavHostController) {
    val searchQuery = remember { mutableStateOf("") }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
    ) {
        OutlinedTextField(
            value = searchQuery.value,
            onValueChange = { searchQuery.value = it },
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            placeholder = { Text("Search movies, series...") },
            leadingIcon = { Icon(Icons.Default.Search, contentDescription = "Search") },
            shape = RoundedCornerShape(12.dp),
            singleLine = true
        )
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 16.dp)
        ) {
            items(10) { index ->
                Card(modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp)) {
                    Text("Search Result $index", style = MaterialTheme.typography.titleMedium, modifier = Modifier.padding(16.dp))
                    Text("Description", style = MaterialTheme.typography.bodySmall, modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp))
                }
            }
        }
    }
}