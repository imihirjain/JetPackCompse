package com.example.jetpackcomposecourse.`02_Fundamental`

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

// what is the composable function:- core building blocks of JC ui, can't create UI without composable function, jab ui build krna ho to @Composable lgate hai
@Composable
fun Greeting(){
    Text(
        text = "Hello this message is from fundamental/Basics.kt file"
    )
}

//@Preview(showSystemUi = true)
//@Composable
//fun GreetingPreview(){
//    Greeting()
//}