package com.zj.seven.dynamic

import android.annotation.SuppressLint
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.graphics.PixelFormat
import android.os.BatteryManager
import android.util.AttributeSet
import android.view.Gravity
import android.view.WindowManager
import androidx.compose.animation.core.*
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.AbstractComposeView
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun SystemBroadcastReceiver(
    systemAction: String,
    onSystemEvent: (intent: Intent?) -> Unit
) {
    // Grab the current context in this part of the UI tree
    val context = LocalContext.current

    // Safely use the latest onSystemEvent lambda passed to the function
    val currentOnSystemEvent by rememberUpdatedState(onSystemEvent)

    // If either context or systemAction changes, unregister and register again
    DisposableEffect(context, systemAction) {
        val intentFilter = IntentFilter(systemAction)
        val broadcast = object : BroadcastReceiver() {
            override fun onReceive(context: Context?, intent: Intent?) {
                currentOnSystemEvent(intent)
            }
        }

        context.registerReceiver(broadcast, intentFilter)

        // When the effect leaves the Composition, remove the callback
        onDispose {
            context.unregisterReceiver(broadcast)
        }
    }
}

@SuppressLint("UnusedTransitionTargetStateParameter")
@Composable
fun DynamicScreen() {
    var boxState: BoxState by remember { mutableStateOf(BoxState.Small) }
    SystemBroadcastReceiver(Intent.ACTION_BATTERY_CHANGED) { batteryStatus ->
        if (batteryStatus == null) return@SystemBroadcastReceiver
        val status =
            batteryStatus.getIntExtra("status", BatteryManager.BATTERY_STATUS_UNKNOWN)  /// 充电状态
        val isCharge =
            status == BatteryManager.BATTERY_STATUS_CHARGING || status == BatteryManager.BATTERY_STATUS_FULL ///获取电池状态
        boxState = if (isCharge) BoxState.Large else BoxState.Small
    }

    val transition = updateTransition(targetState = boxState, label = "transition ")

    val boxHeight by transition.animateDp(label = "height", transitionSpec = BoxSizeSpec()) {
        boxState.height
    }
    val boxWidth by transition.animateDp(label = "width", transitionSpec = BoxSizeSpec()) {
        boxState.width
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Box(
            modifier = Modifier
                .width(boxWidth)
                .height(boxHeight)
                .shadow(elevation = 3.dp, shape = RoundedCornerShape(15.dp))
                .background(color = Color.Black),
            contentAlignment = Alignment.Center,
        ) {
            Text(text = if (boxState is BoxState.Large) "正在充电" else "没充", color = Color.White)
        }
    }
}

@Composable
private fun BoxSizeSpec(): @Composable() (Transition.Segment<BoxState>.() -> FiniteAnimationSpec<Dp>) =
    {
        when {
            BoxState.Small isTransitioningTo BoxState.Large ->
                spring(
                    dampingRatio = Spring.DampingRatioLowBouncy,
                    stiffness = Spring.StiffnessLow
                )
            else ->
                spring(
                    dampingRatio = Spring.DampingRatioLowBouncy,
                    stiffness = Spring.StiffnessLow
                )
        }
    }

private sealed class BoxState(val height: Dp, val width: Dp) {
    operator fun not() = if (this is Small) Large else Small

    object Small : BoxState(35.dp, 100.dp)
    object Large : BoxState(70.dp, 300.dp)
}