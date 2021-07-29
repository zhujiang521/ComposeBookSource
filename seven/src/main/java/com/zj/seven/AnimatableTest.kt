package com.zj.seven

import android.util.Log
import androidx.compose.animation.Animatable
import androidx.compose.animation.VectorConverter
import androidx.compose.animation.core.*
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun AnimatableTest() {


    val ok = remember { mutableStateOf(false) }
    val color = remember {
        Animatable(
            initialValue = Color.Red,
        )
    }
    LaunchedEffect(ok) {
        color.animateTo(if (ok.value) Color.Yellow else Color.Green)
    }
    Box(Modifier.size(360.dp).background(color.value))

//    Column(Modifier.padding(16.dp)) {
//        Button(
//            onClick = {
//                ok.value = !ok.value
//
//            },
//            modifier = Modifier.padding(vertical = 16.dp)
//        ) {
//            Text("Change Color")
//        }
//        Box(Modifier.size(360.dp).background(color.value))
//    }

}

@Preview(showBackground = true)
@Composable
fun AnimatableTestPreview() {
    AnimatableTest()
}
