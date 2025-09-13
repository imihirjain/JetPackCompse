package com.example.jetpackcomposecourse.`3_CoreComponents`

import android.graphics.Paint.Align
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.selection.DisableSelection
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.LinkAnnotation
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextLinkStyles
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withLink

@Composable
fun PartiallySelectedText() {

    SelectionContainer {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text("This is the text which is selectable")
            Text("This is too selectable")
            Text("This is also")
            DisableSelection {
                Text("This text is not selectable")
                Text("This text is too not selectable")
                Text("This text is also")
            }
        }
    }

}


@Composable
fun AnnotatedStringWithLink() {
    val uriHandler = LocalUriHandler.current

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        Text(
            buildAnnotatedString {
                append("Build better apps faster with")
                val link = LinkAnnotation.Url(
                    "https://www.youtube.com/watch?v=U5dE-_E1wsg",
                    TextLinkStyles(
                        SpanStyle(
                            color = Color.Blue
                        )
                    )
                ){
                    val uri = (it as LinkAnnotation.Url).url
                    uriHandler.openUri(uri)
                }
                withLink(link){
                    append("Jetpack Compose")
                }
            }
        )
    }



}