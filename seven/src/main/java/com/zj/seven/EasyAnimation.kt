package com.zj.seven

import androidx.compose.animation.*
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.zj.seven.visible.VisibleAnimation

@ExperimentalAnimationApi
@Composable
fun EasyAnimation() {

    VisibleAnimation()
//
//    val visible = remember { mutableStateOf(true) }
//    Column(modifier = Modifier.size(360.dp).padding(10.dp)) {
//        Button(onClick = { visible.value = !visible.value }) {
//            Text("可见行动画")
//        }
//        AnimatedVisibility(
//            visible = visible.value,
//            enter = slideIn({ IntOffset(400, 400) }) + expandIn()+ fadeIn(),
//            exit = slideOut({ IntOffset(400, 400) }) + shrinkOut()
//        ) {
//            Text(
//                text = "天青色等烟雨，而我在等你，炊烟袅袅升起，隔江千万里", modifier = Modifier.size(150.dp)
//            )
//        }
//    }


//    val expend = remember { mutableStateOf(false) }
//    Column(modifier = Modifier.size(360.dp).padding(10.dp)) {
//        Text(
//            text = "朋友圈一般指的是腾讯微信上的一个社交功能，于微信4.0版本2012年4月19日更新时上线 [1]  ，" +
//                    "用户可以通过朋友圈发表文字和图片，同时可通过其他软件将文章或者音乐分享到朋友圈。" +
//                    "用户可以对好友新发的照片进行“评论”或“赞”，其他用户只能看相同好友的评论或赞。",
//            fontSize = 16.sp,
//            textAlign = TextAlign.Justify,
//            overflow = TextOverflow.Ellipsis,
//            modifier = Modifier
//                .animateContentSize(),
//            maxLines = if (expend.value) Int.MAX_VALUE else 2
//        )
//        Text(if (expend.value) "收起" else "全文", color = Color.Blue, modifier = Modifier.clickable {
//            expend.value = !expend.value
//        })
//
//    }
}

@ExperimentalAnimationApi
@Preview(showBackground = true)
@Composable
fun EasyAnimationPreview() {
    EasyAnimation()
}