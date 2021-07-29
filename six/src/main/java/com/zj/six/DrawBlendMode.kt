package com.zj.six

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun DrawBlendModeTest() {

    Canvas(modifier = Modifier.size(360.dp)) {
        drawCircle(
            color = Color.Yellow,
            radius = 175f,
            center = Offset(350f, 350f),
            blendMode = BlendMode.Clear
        )
        drawRect(
            color = Color.Blue,
            topLeft = Offset(300f, 300f),
            size = Size(350f, 350f),
            blendMode = BlendMode.Clear
        )
    }

}

@Preview(showBackground = true)
@Composable
fun DrawBlendModeTestPreview() {
    DrawBlendModeTest()
}