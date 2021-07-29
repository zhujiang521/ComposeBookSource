package com.zj.seven

import android.util.Log
import androidx.compose.animation.animateColor
import androidx.compose.animation.core.animateDp
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.updateTransition
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.draw.scale
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Blue
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun TransitionTest() {


    var boxState: BoxState by remember { mutableStateOf(BoxState.Small) }
    val transition = updateTransition(targetState = boxState, label = "transition")
    val color by transition.animateColor(label = "color") {
        boxState.color
    }
    val size by transition.animateDp(label = "size") {
        boxState.size
    }
    val offset by transition.animateDp(label = "offset") {
        boxState.offset
    }
    val angle by transition.animateFloat(label = "angle") {
        boxState.angle
    }
    Column(Modifier.padding(16.dp).size(360.dp)) {
        Button(
            onClick = { boxState = !boxState }
        ) {
            Text("Transition Test")
        }
        Box(
            Modifier.padding(top = 20.dp)
                .rotate(angle)
                .size(size)
                .offset(x = offset)
                .background(color)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun TransitionTestPreview() {
    TransitionTest()
}


private sealed class BoxState(val color: Color, val size: Dp, val offset: Dp, val angle: Float) {
    operator fun not() = if (this is Small) Large else Small

    object Small : BoxState(Blue, 60.dp, 20.dp, 0f)
    object Large : BoxState(Red, 90.dp, 50.dp, 45f)
}
