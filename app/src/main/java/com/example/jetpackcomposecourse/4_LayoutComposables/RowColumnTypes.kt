package com.example.jetpackcomposecourse.`4_LayoutComposables`

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


@Composable
fun LazyColumnExample(){
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("LazyColumn(preferred for the list)")
        LazyColumn(
            modifier = Modifier.fillMaxWidth().height(300.dp).background(Color.LightGray),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            items(100){index->
                Text("Item ${index + 1} in LazyColumn", modifier = Modifier.fillMaxWidth().padding(20.dp).background(Color.White))
            }
        }
    }
}

@Composable
fun LazyRowExample(){
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("LazyColumn(preferred for the list)")
        LazyRow(
            modifier = Modifier.fillMaxWidth().height(300.dp).background(Color.LightGray),
            horizontalArrangement = Arrangement.Center
        ) {
            items(100){index->
                Text("Item ${index + 1} in LazyColumn", modifier = Modifier.fillMaxWidth().padding(20.dp).background(Color.White))
            }
        }
    }
}


