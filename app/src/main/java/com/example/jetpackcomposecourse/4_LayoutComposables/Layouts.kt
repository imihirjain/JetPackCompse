package com.example.jetpackcomposecourse.`4_LayoutComposables`

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout


@Composable
fun ColumnExample() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Blue),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("text1")
        Text("text2")
        Text("text3")
        Text("text4")
        Text("text5")
    }
}

@Composable
fun RowExample() {

    Row(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 20.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text("text1")
        Text("text2")
        Text("text3")
        Text("text4")
        Text("text5")
    }
}

@Composable
fun BoxExample() {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 20.dp),
        contentAlignment = Alignment.Center
    ) {
        Box(
            modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {


            Text("text1")
            Text("text2")
            Text("text3")
            Text("text4")
            Text("text5")
        }
    }
}

@Composable
fun ConstraintExample() {

    Column {
        ConstraintLayout(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .background(Color.Gray)
        ) {
            val (text1, text2, text3) = createRefs()

            Text(
                "Bottom Left",
                modifier = Modifier.constrainAs(text1) {
                    bottom.linkTo(parent.bottom, margin = 8.dp)
                    start.linkTo(parent.start, margin = 8.dp)
                }
            )
            Text(
                "Center Left",
                modifier = Modifier.constrainAs(text2) {
                    top.linkTo(parent.top, margin = 8.dp)
                    bottom.linkTo(text1.bottom, margin = 8.dp)
                    start.linkTo(parent.start, margin = 8.dp)
                }
            )

            Text(
                "Top Right",
                modifier = Modifier.constrainAs(text3){
                    top.linkTo(parent.top, margin = 8.dp)
                    end.linkTo(parent.end, margin = 8.dp)
                }
            )
        }
    }
}


@Preview(showSystemUi = true)
@Composable
fun LayoutPreview() {
//    ColumnExample()
//    RowExample()
//    BoxExample()
    ConstraintExample()
}

/*
* things to keep in mind
* don't do over nesting
* */