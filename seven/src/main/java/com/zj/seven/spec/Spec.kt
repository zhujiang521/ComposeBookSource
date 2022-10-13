package com.zj.seven.spec

import android.util.Log
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.*
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.Blue
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.graphics.Color.Companion.Yellow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun SpecTest() {

    var isSmall by remember { mutableStateOf(true) }
    val size: Dp by animateDpAsState(
        targetValue = if (isSmall) 40.dp else 100.dp,
        animationSpec = infiniteRepeatable(animation = tween(500))
    ) {
        Log.e("ZHUJIANG", "AnimateAsStateTest: $it")
    }


    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 40.dp),
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
                .background(Blue)
                .padding(top = 10.dp)
        )
    }

//    DecayAnimation()


//    val blue = remember { mutableStateOf(true) }
//    val color by animateColorAsState(
//        if (blue.value) Blue else Red,
//        animationSpec = spring(
//            dampingRatio = Spring.DampingRatioHighBouncy,
//            stiffness = Spring.StiffnessVeryLow,
//            visibilityThreshold = Yellow,
//        )
//    )
//    Column(
//        modifier = Modifier
//            .fillMaxWidth()
//            .padding(top = 40.dp),
//        horizontalAlignment = Alignment.CenterHorizontally,
//    ) {
//        Button(
//            onClick = { blue.value = !blue.value },
//        ) {
//            Text("修改颜色值")
//        }
//        Box(
//            modifier = Modifier
//                .size(100.dp)
//                .background(color)
//                .padding(top = 10.dp)
//        )
//    }

}

@Preview(showBackground = true)
@Composable
fun AnimateAsStatePreview() {
    SpecTest()
}
