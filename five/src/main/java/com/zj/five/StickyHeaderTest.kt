package com.zj.five

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@ExperimentalFoundationApi
@Composable
fun StickyHeaderTest() {

    val charList = arrayListOf<Chat>()
    charList.apply {
        add(Chat("你好啊小江"))
        add(Chat("你在干啥呢"))
        add(Chat("想问你个事"))
        add(Chat("没干啥，还在写代码啊！", false))
        add(Chat("啥事啊大哥？", false))
        add(Chat("没事。。。"))
        add(Chat("好吧。。。", false))
    }

    LazyColumn {
        items(charList) { item ->
            Text(
                item.content,
                modifier = Modifier.padding(10.dp).background(Color.Red).height(150.dp)
                    .fillMaxWidth(), textAlign = TextAlign.Center,
                fontSize = 35.sp
            )
        }

        stickyHeader {
            Text(
                "我是粘性标题啊",
                modifier = Modifier.padding(10.dp).background(Color.Green).height(150.dp)
                    .fillMaxWidth(), textAlign = TextAlign.Center,
                fontSize = 35.sp
            )
        }

        items(charList) { item ->
            Text(
                item.content,
                modifier = Modifier.padding(10.dp).background(Color.Red).height(150.dp)
                    .fillMaxWidth(), textAlign = TextAlign.Center,
                fontSize = 35.sp
            )
        }

        stickyHeader {
            Text(
                "我是第二个粘性标题啊",
                modifier = Modifier.padding(10.dp).background(Color.Green).height(150.dp)
                    .fillMaxWidth(), textAlign = TextAlign.Center,
                fontSize = 35.sp
            )
        }

        items(charList) { item ->
            Text(
                item.content,
                modifier = Modifier.padding(10.dp).background(Color.Red).height(150.dp)
                    .fillMaxWidth(), textAlign = TextAlign.Center,
                fontSize = 35.sp
            )
        }

    }
}


@ExperimentalFoundationApi
@Preview(showBackground = true, widthDp = 200, heightDp = 400)
@Composable
fun StickyHeaderTestPreview() {
    StickyHeaderTest()
}