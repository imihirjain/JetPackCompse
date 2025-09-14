package com.example.jetpackcomposecourse.`4_LayoutComposables`

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

// Modifiers are available in all the composable functions like text,button,image,column,row etc...

@Composable
fun ModifierExample(){
Box(modifier = Modifier.fillMaxSize().background(Color.Blue)){
    Text(
        "Jetpack Compose",
        modifier = Modifier.background(Color.Yellow)
    )
}
}

