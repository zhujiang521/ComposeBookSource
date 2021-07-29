package com.zj.six

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun DrawOvalTest() {

    val topLeft = Offset(100f, 100f)
    val ovalSize = Size(600f, 800f)

//    Canvas(modifier = Modifier.size(360.dp)) {
//        drawOval(
//            color = Color.Red,
//            topLeft = topLeft,
//            size = ovalSize
//        )
//    }

    Canvas(modifier = Modifier.size(360.dp)) {
        drawRect(
            color = Color.Blue,
            topLeft = topLeft,
            size = ovalSize
        )
        drawOval(
            color = Color.Red,
            topLeft = topLeft,
            size = ovalSize
        )
    }

}

@Preview(showBackground = true)
@Composable
fun DrawOvalTestPreview() {
    DrawOvalTest()
}