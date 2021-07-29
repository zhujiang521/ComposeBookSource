package com.zj.six

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun CustomViewTest() {
    Canvas(modifier = Modifier.fillMaxSize()) {
        drawLine(
            brush = Brush.linearGradient(
                colors = arrayListOf(
                    Color.Red,
                    Color.Green,
                    Color.Blue
                ),
            ),
            start = Offset.Zero,
            end = Offset(800f, 2500f),
            strokeWidth = 30f
        )
    }

}

@Preview(showBackground = true)
@Composable
fun CustomViewTestPreview() {
    CustomViewTest()
}