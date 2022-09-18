package com.zj.seven

import android.util.Log
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun AnimateAsStateTest() {

//    val blue = remember { mutableStateOf(true) }
//    val color by animateColorAsState(
//        if (blue.value) Blue else Red,
//        animationSpec = spring(Spring.StiffnessVeryLow)
//    )
//    Column(Modifier.padding(16.dp)) {
//        Text("AnimateAsStateDemo")
//        Spacer(Modifier.height(16.dp))
//
//        Button(
//            onClick = { blue.value = !blue.value }
//        ) {
//            Text("Change Color")
//        }
//        Spacer(Modifier.height(16.dp))
//        Box(
//            Modifier.size(100.dp).background(color)
//        )
//    }

    var isSmall by remember { mutableStateOf(true) }
    val size: Dp by animateDpAsState(
        targetValue = if (isSmall) 40.dp else 100.dp,
        animationSpec = tween(durationMillis = 1500)
    ) {
        Log.e("ZHUJIANG", "AnimateAsStateTest: $it")
    }


    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Button(
            onClick = { isSmall = !isSmall },
        ) {
            Text("修改Dp值")
        }
        Box(
            modifier = Modifier
                .size(size)
                .background(Red)
        )
    }

}

@Preview(showBackground = true)
@Composable
fun AnimateAsStatePreview() {
    AnimateAsStateTest()
}
