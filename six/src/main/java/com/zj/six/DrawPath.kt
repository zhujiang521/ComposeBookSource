package com.zj.six

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.addOutline
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun DrawPathTest() {

//    val path = Path()
//    //path.addRect(Rect(100f, 200f, 500f, 890f))
//    path.moveTo(100f, 300f)
//    path.lineTo(100f, 700f)
//    path.lineTo(800f, 700f)
//    path.lineTo(900f, 300f)
//    path.lineTo(600f, 100f)
//    path.close()
//    Canvas(modifier = Modifier.size(360.dp)) {
//        drawPath(
//            path = path, color = Color.Red,
//            style = Stroke(width = 10f)
//        )
//    }

    val path = Path()
    path.moveTo(100f, 300f)
    path.lineTo(100f, 700f)
    path.quadraticBezierTo(800f, 700f, 600f, 100f)
    path.cubicTo(700f, 200f, 800f, 400f, 100f, 100f)
    path.close()

    Canvas(modifier = Modifier.size(360.dp)) {
        drawPath(
            path = path, color = Color.Red,
            style = Stroke(width = 10f)
        )
    }

}

@Preview(showBackground = true)
@Composable
fun DrawPathTestPreview() {
    DrawPathTest()
}