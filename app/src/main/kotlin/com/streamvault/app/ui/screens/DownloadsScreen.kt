package com.streamvault.app.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Download
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun DownloadsScreen(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
    ) {
        Text(
            "Downloads",
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(16.dp),
            color = MaterialTheme.colorScheme.onBackground
        )
        LazyColumn(modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp)) {
            items(5) { index ->
                Card(modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp)) {
                    Column(modifier = Modifier.padding(16.dp)) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Icon(Icons.Default.Download, contentDescription = "Downloaded", tint = MaterialTheme.colorScheme.primary, modifier = Modifier.size(32.dp))
                            Column(modifier = Modifier
                                .weight(1f)
                                .padding(horizontal = 16.dp)) {
                                Text("Downloaded Movie $index", style = MaterialTheme.typography.titleMedium)
                                Text("1.2 GB", style = MaterialTheme.typography.bodySmall)
                            }
                            Text("100%", style = MaterialTheme.typography.labelMedium)
                        }
                        Spacer(modifier = Modifier.height(8.dp))
                        LinearProgressIndicator(progress = 1.0f, modifier = Modifier.fillMaxWidth())
                    }
                }
            }
        }
    }
}