package com.zj.seven.dynamic

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.Fill
import androidx.compose.ui.unit.dp
import kotlin.math.abs

@Composable
fun CanvasDropWater(animateFloatAsState: Float) {
    Canvas(modifier = Modifier.padding(start = 70.dp)) {
        val path = Path()

        val width = (animateFloatAsState + 30) * density
        val x = animateFloatAsState * density

        val p2x = density * 15f
        val p2y = density * 25f

        val p1x = density * 15f
        val p1y = density * 5f


        val p4x = width - 15f * density
        val p4y = density * 30f

        val p3x = width - 15f * density
        val p3y = 0f


        val c2x = (abs(p4x - p2x)) / 2
        val c2y = density * 20f


        val c1x = (abs(p3x - p1x)) / 2
        val c1y = density * 10f

        path.moveTo(p2x, p2y)
        path.lineTo(p1x, p1y)
        // 用二阶贝塞尔曲线画右边的曲线，参数的第一个点是上面的一个控制点
        path.quadraticBezierTo(c1x, c1y, p3x, p3y)
        path.lineTo(p4x, p4y)
        // 用二阶贝塞尔曲线画左边边的曲线，参数的第一个点是下面的一个控制点
        path.quadraticBezierTo(c2x, c2y, p2x, p2y)

        if (animateFloatAsState == 35f) {
            path.reset()
        } else {
            drawPath(
                path = path, color = Color.Black,
                style = Fill
            )
        }

        path.addOval(Rect(0f, 0f, density * 30f, density * 30f))

        path.addOval(Rect(x + 0f, 0f, x + density * 30f, density * 30f))
        path.close()
        drawPath(
            path = path, color = Color.Black,
            style = Fill
        )
    }
}