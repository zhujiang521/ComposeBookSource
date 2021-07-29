package com.zj.six

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun DrawLineTest() {

    val start = Offset(100f, 100f)
    val end = Offset(900f, 900f)

    Canvas(modifier = Modifier.size(360.dp)) {
        drawLine(
            color = Color.Red,
            start = start,
            end = end,
            strokeWidth = 30f,
            cap = StrokeCap.Round,
        )
    }

}

@Preview(showBackground = true)
@Composable
fun DrawLineTestPreview() {
    DrawLineTest()
}