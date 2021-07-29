package com.zj.six

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun DrawArcTest() {

//    Canvas(modifier = Modifier.size(360.dp)) {
//        drawArc(
//            color = Color.Red,
//            startAngle = 0f,
//            sweepAngle = 90f,
//            useCenter = true
//        )
//    }

//    Canvas(modifier = Modifier.size(360.dp)) {
//        drawArc(
//            color = Color.Red,
//            startAngle = 90f,
//            sweepAngle = 150f,
//            useCenter = false
//        )
//    }

    Canvas(modifier = Modifier.size(360.dp)) {
        drawArc(
            color = Color.Red,
            startAngle = 90f,
            sweepAngle = 150f,
            useCenter = false,
            style = Stroke(width = 10f)
        )
    }


}

@Preview(showBackground = true)
@Composable
fun DrawArcTestPreview() {
    DrawArcTest()
}