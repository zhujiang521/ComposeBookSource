package com.zj.four

import android.graphics.BitmapFactory
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.chrisbanes.accompanist.coil.CoilImage

@Composable
fun ImageTest() {
//    Image(painter = painterResource(R.drawable.ic_launcher_background), "描述")

//    val bitmap = BitmapFactory.decodeFile("")
//    Image(bitmap = bitmap.asImageBitmap(),"")

//    Image(painter = painterResource(R.drawable.ic_launcher_background), "描述")


//    Box(modifier = Modifier.background(color = Color.Yellow)) {
//        Text("哈哈哈")
//        Image(
//            painter = painterResource(R.drawable.ic_launcher_background),
//            contentDescription = "描述", alpha = 1f
//        )
//    }

//    Box(modifier = Modifier.background(color = Color.Yellow)) {
//        Text("哈哈哈")
//        Image(
//            painter = painterResource(R.drawable.ic_launcher_background),
//            contentDescription = "描述", alpha = 0.5f
//        )
//    }

//    Image(
//        painter = painterResource(R.drawable.ic_launcher_background),
//        contentDescription = "描述", colorFilter = ColorFilter.tint(Color.Red)
//    )

    CoilImage(
        data = "https://img0.baidu.com/it/u=3155998395,3600507640&fm=26&fmt=auto&gp=0.jpg",
        contentDescription = null
    )

}

@Preview(showBackground = true, widthDp = 100, heightDp = 100)
@Composable
fun ImageTestPreview() {
    ImageTest()
}