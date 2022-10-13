package com.zj.seven.dynamic

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.os.BatteryManager
import android.util.Log
import androidx.compose.animation.core.TargetBasedAnimation
import androidx.compose.animation.core.VectorConverter
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

sealed class DynamicState

object DynamicStart : DynamicState()
object DynamicMid : DynamicState()
object DynamicEnd : DynamicState()


@Composable
fun DynamicIsLand() {
    val anim = remember {
        TargetBasedAnimation(
            animationSpec = tween(2000),
            typeConverter = Float.VectorConverter,
            initialValue = 0f,
            targetValue = 2000f
        )
    }
    var playTime by remember { mutableStateOf(0L) }

    var dynamicState by remember {
        mutableStateOf(0)
    }

    LaunchedEffect(anim) {
        val startTime = withFrameNanos { it }

        playTime = withFrameNanos { it } - startTime
        val animationValue = anim.getValueFromNanos(playTime)
        Log.e("ZHUJIANG", "DynamicIsLand: playTime:$playTime  $startTime  ${anim.initialValue}   $animationValue", )

        dynamicState = if (animationValue < 0.25) {
            0
        } else if (animationValue < 0.75) {
            1
        } else {
            2
        }

        Log.e("ZHUJIANG", "DynamicIsLand: $dynamicState")
    }

    var isSmall by remember { mutableStateOf(true) }
    val size: Dp by animateDpAsState(
        targetValue = if (isSmall) 0.dp else 100.dp,
        animationSpec = tween(durationMillis = 500)
    ) {
        Log.e("ZHUJIANG", "AnimateAsStateTest: $it")
    }

    when (dynamicState) {
        0 -> {
            isSmall = false
            Log.e("ZHUJIANG", "哈哈哈")
        }
        1 -> {
            Log.e("ZHUJIANG", "哈哈哈111")
        }
        2 -> {
            isSmall = true
            Log.e("ZHUJIANG", "哈哈哈222")
        }
    }

    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {

        Column(
            modifier = Modifier
                .width(size)
                .height(25.dp)
                .shadow(1.dp, RoundedCornerShape(10.dp))
                .background(Color.Red),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Text(text = "正在充电")
        }
    }

}