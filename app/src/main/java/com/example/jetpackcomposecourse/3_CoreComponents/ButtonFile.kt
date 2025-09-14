package com.example.jetpackcomposecourse.`3_CoreComponents`

import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonElevation
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp


@Composable
fun ButtonSample() {
    val context = LocalContext.current
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
//      Filled button
        Button(
            onClick = {
                Toast.makeText(context, "Button is clicked", Toast.LENGTH_SHORT).show()
            }
        ) {
            Text(
                "Filled Button"
            )
        }

//        Tonal Button used to add to cart or sign in purpose
        FilledTonalButton(
            onClick = {
                Toast.makeText(context,"Tonal button is clicked",Toast.LENGTH_SHORT).show()
            }
        ) {
            Text("Tonal Button")
        }

//        Outlined button which is mainly used as secondary button for cancel or back in alert dialog
        OutlinedButton(
            onClick = {
                Toast.makeText(context,"Outlined Button", Toast.LENGTH_SHORT).show()
            }
        ) {
            Text(
                "Outlined Button"
            )
        }

//        Elevate button
        ElevatedButton(
            onClick = {
                Toast.makeText(context, "Elevated Button Clicked",Toast.LENGTH_SHORT).show()
            }
        ) {
            Text(
                "Elevated Button"
            )
        }

//        TextButton
        TextButton(
            onClick = {
                Toast.makeText(context, "Text Button Clicked",Toast.LENGTH_SHORT).show()            }
        ) {
            Text(
                "Text Button"
            )
        }
    }
}

