package com.zj.nine

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ScreenAdapter1() {
    val config = LocalConfiguration.current
    if (config.orientation == Configuration.ORIENTATION_LANDSCAPE) {
        // 横屏适配
        BaseText("横屏适配")
    } else {
        // 竖屏适配
        BaseText("竖屏适配")
    }
}

@Composable
fun BaseText(content: String) {
    Text(
        content,
        modifier = Modifier.fillMaxSize().wrapContentHeight(Alignment.CenterVertically),
        textAlign = TextAlign.Center,
        fontSize = 50.sp
    )
}

@Composable
fun ScreenAdapter2() {
    BoxWithConstraints {
        when {
            minWidth < 360.dp -> {
                // 最小宽度小于360dp
            }
            minWidth < 480.dp -> {
                // 最小宽度小于480dp
            }
            minWidth < 720.dp -> {
                // 最小宽度小于720dp
            }
            else -> {
                // 最小宽度大于720dp
            }
        }
    }

}