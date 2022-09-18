@file:OptIn(ExperimentalAnimationApi::class)

package com.zj.seven.visible

import androidx.compose.animation.*
import androidx.compose.animation.core.MutableTransitionState
import androidx.compose.animation.core.VisibilityThreshold
import androidx.compose.animation.core.spring
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import com.zj.seven.R
import com.zj.seven.ui.theme.BackgroundColor

@Composable
fun VisibleAnimation() {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(color = BackgroundColor)
            .padding(20.dp),
    ) {
        item {
            VisibleItem()

            VisibleItem(fadeIn(tween(durationMillis = 1500)), fadeOut(tween(durationMillis = 1500)))

            VisibleItem(
                scaleIn(animationSpec = tween(durationMillis = 1500)),
                scaleOut(animationSpec = tween(durationMillis = 1500))
            )

            VisibleItem(
                expandIn(animationSpec = tween(durationMillis = 1500)),
                shrinkOut(animationSpec = tween(durationMillis = 1500))
            )

            VisibleItem(
                expandHorizontally(tween(durationMillis = 1500)),
                shrinkHorizontally(tween(durationMillis = 1500))
            )

            VisibleItem(
                expandVertically(tween(durationMillis = 1500)),
                shrinkVertically(tween(durationMillis = 1500))
            )

            VisibleItem(
                slideInHorizontally(tween(durationMillis = 1500)),
                slideOutHorizontally(tween(durationMillis = 1500))
            )

            VisibleItem(
                slideInVertically(tween(durationMillis = 1500)),
                slideOutVertically(tween(durationMillis = 1500))
            )
        }
    }

}

@Composable
private fun VisibleItem(
    enter: EnterTransition = fadeIn(animationSpec = tween(durationMillis = 1500)) + expandHorizontally(
        tween(durationMillis = 1500)
    ),
    exit: ExitTransition = fadeOut(tween(durationMillis = 1500)) + shrinkHorizontally(
        tween(
            durationMillis = 1500
        )
    ),
) {
    val visible = remember { mutableStateOf(true) }
    val state = remember {
        MutableTransitionState(false).apply {
            // Start the animation immediately.
            targetState = true
        }
    }
    Card(modifier = Modifier.padding(10.dp)) {
        Row(
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically
        ) {

            Image(
                painter = painterResource(id = R.drawable.ic_head),
                contentDescription = "head",
                modifier = Modifier
                    .padding(10.dp)
                    .shadow(1.dp, RoundedCornerShape(10.dp))
                    .size(80.dp)
                    .clickable {
                        visible.value = !visible.value
                    }

            )
            AnimatedVisibility(
                visibleState = state,
                enter = enter,
                exit = exit
            ) {
                Text(
                    text = "天青色等烟雨，而我在等你，炊烟袅袅升起，隔江千万里",
                    modifier = Modifier
                        .padding(end = 10.dp, top = 10.dp, bottom = 10.dp)
                )
            }
        }
    }
}