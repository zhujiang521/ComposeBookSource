package com.zj.three.one

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ColumnTest() {
//
//    Column(
//        modifier = Modifier.fillMaxSize(),
//        verticalArrangement = Arrangement.Center,
//        horizontalAlignment = Alignment.CenterHorizontally,
//    ) {
//        Text("One")
//        Text("Two")
//        Text("Three")
//    }
//

    //    Column(
//        modifier = Modifier.fillMaxSize(),
//    ) {
//        Text("One")
//    Text("Two")
//    Text("Three")
//    }

//    Column(
//        modifier = Modifier.fillMaxSize(),
//        verticalArrangement = Arrangement.Bottom,
//        horizontalAlignment = Alignment.CenterHorizontally,
//    ) {
//        Text("1")
//        Text("2")
//        Text("3")
//    }

//    Column(
//        modifier = Modifier.fillMaxSize(),
//        verticalArrangement = Arrangement.SpaceEvenly,
//        horizontalAlignment = Alignment.Start,
//    ) {
//        DefaultText("1")
//        DefaultText("2")
//        DefaultText("3")
//    }
//
//    Column(
//        modifier = Modifier.fillMaxSize(),
//        verticalArrangement = Arrangement.SpaceAround,
//        horizontalAlignment = Alignment.CenterHorizontally,
//    ) {
//        DefaultText("4")
//        DefaultText("5")
//        DefaultText("6")
//    }
//
//
//    Column(
//        modifier = Modifier.fillMaxSize(),
//        verticalArrangement = Arrangement.SpaceBetween,
//        horizontalAlignment = Alignment.End,
//    ) {
//        DefaultText("7")
//        DefaultText("8")
//        DefaultText("9")
//    }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        DefaultText("13")
        DefaultText("14")
        DefaultText("15")
    }

}

@Composable
fun DefaultText(text: String) {
    Text(
        text,
        modifier = Modifier.size(100.dp)
            .background(Color.Red),
        fontSize = 30.sp,
        textAlign = TextAlign.Center
    )
}

@Preview(showBackground = true)
@Composable
fun ColumnTestPreview() {
    ColumnTest()
}
