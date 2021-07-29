package com.zj.four

import androidx.compose.foundation.layout.*
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.LinearProgressIndicator
import androidx.compose.material.ProgressIndicatorDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ProgressTest() {
//    Row(
//        modifier = Modifier.fillMaxSize(),
//        horizontalArrangement = Arrangement.Center,
//        verticalAlignment = Alignment.CenterVertically,
//    ) {
//        CircularProgressIndicator()
//        //LinearProgressIndicator()
//    }

//    Row(
//        modifier = Modifier.fillMaxSize(),
//        horizontalArrangement = Arrangement.Center,
//        verticalAlignment = Alignment.CenterVertically,
//    ) {
//        CircularProgressIndicator(
//            modifier = Modifier.size(80.dp),
//            color = Color.Red,
//            strokeWidth = 10.dp
//        )
//    }

//    Row(
//        modifier = Modifier.fillMaxSize(),
//        horizontalArrangement = Arrangement.Center,
//        verticalAlignment = Alignment.CenterVertically,
//    ) {
//        CircularProgressIndicator(
//            progress = 0.65f,
//            modifier = Modifier.size(80.dp),
//            color = Color.Red,
//            strokeWidth = 10.dp
//        )
//    }

//    Row(
//        modifier = Modifier.fillMaxSize(),
//        horizontalArrangement = Arrangement.Center,
//        verticalAlignment = Alignment.CenterVertically,
//    ) {
//        LinearProgressIndicator()
//    }

//    Row(
//        modifier = Modifier.fillMaxSize(),
//        horizontalArrangement = Arrangement.Center,
//        verticalAlignment = Alignment.CenterVertically,
//    ) {
//        LinearProgressIndicator(
//            modifier = Modifier.height(20.dp),
//            color = Color.Red,
//            backgroundColor = Color.Yellow
//        )
//    }

    Row(
        modifier = Modifier.fillMaxSize(),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically,
    ) {
        LinearProgressIndicator(
            progress = 0.65f,
            color = Color.Red,
            backgroundColor = Color.Yellow
        )
    }

}

@Preview(showBackground = true, widthDp = 200, heightDp = 200)
@Composable
fun ProgressTestPreview() {
    ProgressTest()
}