package com.example.jetpackcomposecourse.`3_CoreComponents`

import androidx.compose.foundation.basicMarquee
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SimpleText(){
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
        Text(
            "Hello Jetpack Compose",
            color = Color.Blue,
            fontSize = 30.sp,
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.Bold,
            style = TextStyle(
                shadow = Shadow(color = Color.Green, blurRadius = 10f)
            )
        )
    }
}

@Composable
fun ColorfulText(){
    val rainbowColor = listOf(
        Color.Magenta,
        Color.Blue,
        Color.Yellow,
        Color.Red,
        Color.Green,
        Color.Cyan,
    )
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
        Text(
            text = buildAnnotatedString {
                append("Do no allow people to dim your shine \n")
                withStyle(
                    SpanStyle(
                        brush = Brush.linearGradient(
                            colors = rainbowColor
                        )
                    )
                ){
                    append("This is the string which color is rainbow")
                }
                append("\n This is the last line")
            }

        )
    }
}


@Composable
fun OverFlowText(){
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(
            "Hi i am mihir jain and i am learning jetpack compose and KMP in android studio".repeat(50),
            maxLines = 2,
            fontSize = 24.sp,
            overflow = TextOverflow.Ellipsis
        )
    }
}

@Composable
fun MarqueeText(){
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
        Text(
            "Hi my name is mihir jain and i am learning jetpack compose",
            modifier = Modifier.padding(24.dp).basicMarquee(),
            fontSize = 50.sp
        )
    }
}

@Preview(showSystemUi = true)
@Composable
fun TextPreview(){
//    SimpleText()
//    ColorfulText()
    MarqueeText()
//    OverFlowText()
}