package com.example.jetpackcomposecourse.`3_CoreComponents`

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.ColorMatrix
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposecourse.R


@Composable
fun ImageSample() {
    val rainbowColors = remember {
        Brush.sweepGradient(
            listOf(
                Color.Blue,
                Color.Black,
                Color.Red,
                Color.Green,
                Color.Transparent,
                Color.Cyan,
                Color.Yellow,
                Color.White,
                Color.Magenta,
            )
        )
    }
    Image(
        painter = painterResource(id = R.drawable.react),
        contentDescription = "React image",
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .size(300.dp)
            .clip(CircleShape)
            .border(
                BorderStroke(4.dp, rainbowColors), CircleShape
            ),
        alignment = Alignment.Center,
        colorFilter = ColorFilter.colorMatrix(ColorMatrix().apply {
            setToSaturation(0f)
        }
        )
    )

}
