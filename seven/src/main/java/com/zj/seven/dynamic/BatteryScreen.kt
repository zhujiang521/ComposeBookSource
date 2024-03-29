package com.zj.seven.dynamic

import android.annotation.SuppressLint
import androidx.compose.animation.core.*
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp


@SuppressLint("UnusedTransitionTargetStateParameter")
@Composable
fun DynamicScreen() {
    var boxState: BoxState by remember { mutableStateOf(BoxState.NormalState) }

//    val transition = updateTransition(targetState = boxState, label = "transition ")
//
//    val boxHeight by transition.animateDp(label = "height", transitionSpec = boxSizeSpec()) {
//        boxState.height
//    }
//    val boxWidth by transition.animateDp(label = "width", transitionSpec = boxSizeSpec()) {
//        boxState.width
//    }

//    val animateDpAsState by animateDpAsState(
//        targetValue = if (boxState is BoxState.MoreState) 105.dp else 50.dp,
//        animationSpec = spring(
//            dampingRatio = Spring.DampingRatioLowBouncy,
//            stiffness = Spring.StiffnessMediumLow
//        )
//    )

    val animateFloatAsState by
    animateFloatAsState(targetValue = if (boxState is BoxState.MoreState) 35f else 0f)

    val animateSizeAsState by animateSizeAsState(
        targetValue = Size(boxState.width.value, boxState.height.value), animationSpec = spring(
            dampingRatio = Spring.DampingRatioLowBouncy,
            stiffness = Spring.StiffnessMediumLow
        )
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 3.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Box {
            Box(
                modifier = Modifier
                    .width(animateSizeAsState.width.dp)
                    .height(animateSizeAsState.height.dp)
                    .shadow(elevation = 3.dp, shape = RoundedCornerShape(15.dp))
                    .background(color = Color.Black),
            )
//            Box(
//                modifier = Modifier
//                    .width(boxWidth)
//                    .height(boxHeight)
//                    .shadow(elevation = 3.dp, shape = RoundedCornerShape(15.dp))
//                    .background(color = Color.Black),
//            )

            // 博客中的方案
//            Box(
//                modifier = Modifier
//                    .padding(start = animateDpAsState)
//                    .size(30.dp)
//                    .shadow(elevation = 3.dp, shape = RoundedCornerShape(15.dp))
//                    .background(color = Color.Black)
//            )

            // 绘制水滴
            CanvasDropWater(animateFloatAsState)
        }

        Button(
            modifier = Modifier.padding(top = 30.dp, bottom = 5.dp),
            onClick = { boxState = BoxState.NormalState }) {
            Text(text = "默认状态")
        }

        Button(
            modifier = Modifier.padding(vertical = 5.dp),
            onClick = { boxState = BoxState.ChargeState }) {
            Text(text = "充电状态")
        }

        Button(
            modifier = Modifier.padding(vertical = 5.dp),
            onClick = { boxState = BoxState.PayState }) {
            Text(text = "支付状态")
        }

        Button(
            modifier = Modifier.padding(vertical = 5.dp),
            onClick = { boxState = BoxState.MusicState }) {
            Text(text = "音乐状态")
        }

        Button(
            modifier = Modifier.padding(vertical = 5.dp),
            onClick = { boxState = BoxState.MoreState }) {
            Text(text = "多个状态")
        }

    }
}

/**
 * 动画规格设置
 */
@Composable
private fun boxSizeSpec(): @Composable() (Transition.Segment<BoxState>.() -> FiniteAnimationSpec<Dp>) =
    {
        spring(
            dampingRatio = Spring.DampingRatioLowBouncy,
            stiffness = Spring.StiffnessMediumLow
        )
    }

private sealed class BoxState(val height: Dp, val width: Dp) {
    // 默认状态
    object NormalState : BoxState(30.dp, 100.dp)

    // 充电状态
    object ChargeState : BoxState(30.dp, 170.dp)

    // 支付状态
    object PayState : BoxState(100.dp, 100.dp)

    // 音乐状态
    object MusicState : BoxState(170.dp, 340.dp)

    // 多个状态
    object MoreState : BoxState(30.dp, 100.dp)
}