package com.zj.six

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun DrawCircleTest() {

//    Canvas(modifier = Modifier.size(360.dp)) {
//        drawCircle(
//            color = Color.Red,
//            radius = 300f,
//            center = center
//        )
//    }


    Canvas(modifier = Modifier.size(360.dp)) {
        drawCircle(
            color = Color.Red,
            radius = 300f,
            center = center,
            style = Stroke(
                width = 30f,
            )
        )
    }

}

@Preview(showBackground = true)
@Composable
fun DrawCircleTestPreview() {
    DrawCircleTest()
}