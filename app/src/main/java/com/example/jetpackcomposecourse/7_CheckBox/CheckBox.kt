package com.example.jetpackcomposecourse.`7_CheckBox`

import android.graphics.Paint.Align
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.material3.TriStateCheckbox
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.state.ToggleableState
import androidx.compose.ui.util.fastForEachIndexed

@Composable
fun CheckBoxExample(){

    val childCheckedStates = remember { mutableListOf(
        mutableStateOf(false),
        mutableStateOf(false),
        mutableStateOf(false),
        mutableStateOf(false)
    ) }

    val parentState = when{
        childCheckedStates.all { it.value }-> ToggleableState.On
        childCheckedStates.none{it.value}->ToggleableState.Off
        else ->ToggleableState.Indeterminate
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {

            Text("Select All")
            TriStateCheckbox(
                state = parentState,
                onClick = {
                    val newState = parentState != ToggleableState.On
                   childCheckedStates.forEach { it.value = newState }
                }
            )
        }
        childCheckedStates.forEachIndexed { index, checkedState ->
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text("Option ${index+1}")
                Checkbox(
                    checked=checkedState.value,
                    onCheckedChange = {
                        checkedState.value=it
                    }
                )
            }
        }
    }

    if(childCheckedStates.all{it.value}){
        Text("All options are Selected")
    }
}