package com.zj.three.one

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun BoxTest() {

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Row {
            Box(
                contentAlignment = Alignment.TopStart,
                modifier = Modifier.size(100.dp).background(Color.Gray),
            ) {
                Text("1", fontSize = 20.sp)
            }
            Box(
                contentAlignment = Alignment.TopCenter,
                modifier = Modifier.size(100.dp).background(Color.Magenta),
            ) {
                Text("2", fontSize = 20.sp)
            }
            Box(
                contentAlignment = Alignment.TopEnd,
                modifier = Modifier.size(100.dp).background(Color.Cyan),
            ) {
                Text("3", fontSize = 20.sp)
            }
        }
        Row {
            Box(
                contentAlignment = Alignment.CenterStart,
                modifier = Modifier.size(100.dp).background(Color.DarkGray),
            ) {
                Text("4", fontSize = 20.sp)
            }
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier.size(100.dp).background(Color.Green),
            ) {
                Text("5", fontSize = 20.sp)
            }
            Box(
                contentAlignment = Alignment.CenterEnd,
                modifier = Modifier.size(100.dp).background(Color.Red),
            ) {
                Text("6", fontSize = 20.sp)
            }
        }

        Row {
            Box(
                contentAlignment = Alignment.BottomStart,
                modifier = Modifier.size(100.dp).background(Color.Magenta),
            ) {
                Text("7", fontSize = 20.sp)
            }
            Box(
                contentAlignment = Alignment.BottomCenter,
                modifier = Modifier.size(100.dp).background(Color.Yellow),
            ) {
                Text("8", fontSize = 20.sp)
            }
            Box(
                contentAlignment = Alignment.BottomEnd,
                modifier = Modifier.size(100.dp).background(Color.Magenta),
            ) {
                Text("9", fontSize = 20.sp)
            }
        }

    }

}