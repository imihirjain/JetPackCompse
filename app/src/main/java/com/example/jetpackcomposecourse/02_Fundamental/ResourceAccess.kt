package com.example.jetpackcomposecourse.`02_Fundamental`

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpackcomposecourse.R

@Composable
fun AccessStringResource() {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.TopCenter) {
        Text(
            text = stringResource(R.string.myName),
            color = colorResource(R.color.mjCyan)
        )
    }
}

@Composable
fun ImageAccess(){
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
        Image(
            painter = painterResource(R.drawable.react),
            contentDescription = "React logo",
        )
    }
}

//@Preview(showSystemUi = true)
//@Composable
//fun ResourcePreview(){
////    AccessStringResource()
//    ImageAccess()
//}
