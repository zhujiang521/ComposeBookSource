package com.zj.six

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.*
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun DrawPointTest() {
    val points = arrayListOf(
        Offset(100f, 100f),
        Offset(300f, 300f),
        Offset(500f, 500f),
        Offset(700f, 700f),
        Offset(900f, 900f),
    )


//    Canvas(modifier = Modifier.size(360.dp)) {
//        drawPoints(
//            points = points,
//            pointMode = PointMode.Points,
//            color = Color.Blue,
//            strokeWidth = 30f
//        )
//    }

//    Canvas(modifier = Modifier.size(360.dp)) {
//        drawPoints(
//            points = points,
//            pointMode = PointMode.Lines,
//            color = Color.Blue,
//            strokeWidth = 30f
//        )
//    }

//    Canvas(modifier = Modifier.size(360.dp)) {
//        drawPoints(
//            points = points,
//            pointMode = PointMode.Polygon,
//            color = Color.Blue,
//            strokeWidth = 30f
//        )
//    }

//    Canvas(modifier = Modifier.size(360.dp)) {
//        drawPoints(
//            points = points,
//            pointMode = PointMode.Polygon,
//            color = Color.Blue,
//            strokeWidth = 50f,
//            cap = StrokeCap.Round
//        )
//    }

//    val points2 = arrayListOf(
//        Offset(900f, 100f),
//        Offset(700f, 300f),
//        Offset(500f, 500f),
//        Offset(300f, 700f),
//        Offset(100f, 900f),
//    )
//
//    Canvas(modifier = Modifier.size(360.dp)) {
//        drawPoints(
//            points = points,
//            pointMode = PointMode.Polygon,
//            color = Color.Blue,
//            strokeWidth = 30f,
//            cap = StrokeCap.Butt
//        )
//        drawPoints(
//            points = points2,
//            pointMode = PointMode.Polygon,
//            color = Color.Blue,
//            strokeWidth = 30f,
//            cap = StrokeCap.Square
//        )
//    }

    val points3 = arrayListOf(
        Offset(0f, 100f),
        Offset(700f, 300f),
        Offset(500f, 500f),
        Offset(700f, 600f),
        Offset(900f, 200f),
    )

//    Canvas(modifier = Modifier.size(360.dp)) {
//        drawPoints(
//            points = points3,
//            pointMode = PointMode.Polygon,
//            color = Color.Blue,
//            strokeWidth = 30f,
//            cap = StrokeCap.Square,
//            pathEffect = PathEffect.cornerPathEffect(20f)
//        )
//    }

//    Canvas(modifier = Modifier.size(360.dp)) {
//        drawPoints(
//            points = points,
//            pointMode = PointMode.Polygon,
//            brush = Brush.linearGradient(
//                colors = arrayListOf(
//                    Color.Red,
//                    Color.Green,
//                    Color.Blue
//                ),
//            ),
//            strokeWidth = 30f
//        )
//    }

    Canvas(modifier = Modifier.size(360.dp)) {
        drawPoints(
            points = points,
            pointMode = PointMode.Polygon,
            brush = Brush.linearGradient(
                0.0f to Color.Red,
                0.3f to Color.Green,
                0.6f to Color.Yellow,
                1.0f to Color.Blue,
            ),
            strokeWidth = 30f
        )
    }

}

@Preview(showBackground = true)
@Composable
fun DrawPointTestPreview() {
    DrawPointTest()
}