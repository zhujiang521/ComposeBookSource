package com.zj.six

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun DrawRectTest() {

    val topLeft = Offset(100f, 100f)
    val rectSize = Size(400f, 600f)

//    Canvas(modifier = Modifier.size(360.dp)) {
//        drawRect(
//            color = Color.Red,
//            topLeft = topLeft,
//            size = rectSize
//        )
//    }

    Canvas(modifier = Modifier.size(360.dp)) {
        drawRect(
            color = Color.Red,
            topLeft = topLeft,

            size = rectSize,
            style = Stroke(
                width = 30f,
                miter = 4f,
                join = StrokeJoin.Round
            )
        )
    }

}

@Preview(showBackground = true)
@Composable
fun DrawRectTestPreview() {
    DrawRectTest()
}