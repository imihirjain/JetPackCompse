package com.example.jetpackcomposecourse

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.jetpackcomposecourse.`02_Fundamental`.AccessStringResource
import com.example.jetpackcomposecourse.`02_Fundamental`.Greeting
import com.example.jetpackcomposecourse.`02_Fundamental`.ImageAccess
import com.example.jetpackcomposecourse.`3_CoreComponents`.AnnotatedStringWithLink
import com.example.jetpackcomposecourse.`3_CoreComponents`.MarqueeText
import com.example.jetpackcomposecourse.`3_CoreComponents`.PartiallySelectedText
import com.example.jetpackcomposecourse.`3_CoreComponents`.SimpleOutlinedTextField
import com.example.jetpackcomposecourse.ui.theme.JetpackComposeCourseTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpackComposeCourseTheme {
//                Greeting()
//                AccessStringResource()
//                ImageAccess()
//                MarqueeText()
//                SimpleOutlinedTextField()
//                PartiallySelectedText()
                AnnotatedStringWithLink()
            }
        }
    }
}
