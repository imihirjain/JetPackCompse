package com.example.jetpackcomposecourse.`6_Cards`

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun ElevatedCardExample() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        ElevatedCard(
            modifier = Modifier.size(width = 200.dp, height = 100.dp),
            elevation = CardDefaults.cardElevation(20.dp)
        ) {
            Text(
                "This is the elevated card",
                modifier = Modifier.padding(horizontal = 16.dp),
                textAlign = TextAlign.Center,

            )
        }
    }
}
