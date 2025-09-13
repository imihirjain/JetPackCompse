package com.example.jetpackcomposecourse

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.jetpackcomposecourse.`4_LayoutComposables`.LazyColumnExample
import com.example.jetpackcomposecourse.`4_LayoutComposables`.LazyRowExample
import com.example.jetpackcomposecourse.`4_LayoutComposables`.ModifierExample
import com.example.jetpackcomposecourse.`5_BottomSheet`.BottomSheetExample
import com.example.jetpackcomposecourse.`6_Cards`.ElevatedCardExample
import com.example.jetpackcomposecourse.`7_CheckBox`.CheckBoxExample
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
//                AnnotatedStringWithLink()
//                ButtonSample()
//                ImageSample()
//                LazyColumnExample()
//                LazyRowExample()
//                ModifierExample()
//                BottomSheetExample()
//                ElevatedCardExample()
                CheckBoxExample()



            }
        }
    }
}
