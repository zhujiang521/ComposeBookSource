package com.zj.seven

import androidx.compose.animation.animateColor
import androidx.compose.animation.core.*
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun InfiniteTransitionTest() {
//    val infiniteTransition = rememberInfiniteTransition()
//    val color by infiniteTransition.animateColor(
//        initialValue = Color.Red,
//        targetValue = Color.Green,
//        animationSpec = infiniteRepeatable(
//            animation = tween(1000, easing = LinearEasing),
//            repeatMode = RepeatMode.Reverse
//        )
//    )
//
//    Box(Modifier.size(360.dp).background(color))


    val infiniteTransition = rememberInfiniteTransition()
    val size by infiniteTransition.animateValue(
        initialValue = 100.dp,
        targetValue = 200.dp,
        typeConverter = TwoWayConverter({ AnimationVector1D(it.value) }, { it.value.dp }),
        animationSpec = infiniteRepeatable(
            animation = tween(1000, easing = LinearEasing),
            repeatMode = RepeatMode.Restart
        )
    )

    Box(
        Modifier
            .size(size)
            .padding(20.dp)
            .background(Color.Red)
    )

}

@Preview(showBackground = true)
@Composable
fun InfiniteTransitionTestPreView() {
    InfiniteTransitionTest()
}