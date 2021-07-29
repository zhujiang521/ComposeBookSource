package com.zj.six

import android.graphics.BitmapFactory
import android.util.Log
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.drawscope.drawIntoCanvas
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.dp

@Composable
fun DrawImageTest() {

    val context = LocalContext.current
    val bitmap = BitmapFactory.decodeResource(context.resources, R.drawable.head)
    val image = bitmap.asImageBitmap()
//    Canvas(modifier = Modifier.size(360.dp)) {
//        drawImage(
//            image = image,
//        )
//    }

    Canvas(modifier = Modifier.size(360.dp)) {
        drawImage(
            image = image,
            srcOffset = IntOffset(0, 0),
            srcSize = IntSize(100, 100),
            dstOffset = IntOffset(100, 100),
            dstSize = IntSize(800, 800)
        )
    }

}

@Preview(showBackground = true)
@Composable
fun DrawImageTestPreview() {
    DrawImageTest()
}