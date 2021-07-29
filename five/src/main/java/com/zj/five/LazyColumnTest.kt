package com.zj.five

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch

@Composable
fun LazyColumnTest() {

//    val dataList = arrayListOf<Int>()
//    for (index in 0..10) {
//        dataList.add(index)
//    }


//    LazyColumn {
//        items(dataList) { data ->
//            Text("Zhujiang:$data")
//        }
//    }

//    val stringList = arrayListOf<String>()
//    for (index in 0..10) {
//        stringList.add("ind".repeat(index))
//    }
//    LazyColumn {
//        itemsIndexed(stringList) { index, data ->
//            Text("Zhujiang:第${index}个数据为$data")
//        }
//    }

//    val stringList = arrayListOf<String>()
//    for (index in 0..10) {
//        stringList.add("ind".repeat(index))
//    }
//    LazyColumn {
//        itemsIndexed(stringList.toArray()) {index,data ->
//            Text("第${index}个数据为$data")
//        }
//    }


//    val charList = arrayListOf<Chat>()
//    charList.apply {
//        add(Chat("你好啊小江"))
//        add(Chat("你在干啥呢"))
//        add(Chat("想问你个事"))
//        add(Chat("没干啥，还在写代码啊！", false))
//        add(Chat("啥事啊大哥？", false))
//        add(Chat("没事。。。"))
//        add(Chat("好吧。。。", false))
//    }
//    LazyColumn {
//        items(charList) { data ->
//            if (data.isLeft) {
//                Column(modifier = Modifier.padding(end = 15.dp)) {
//                    Spacer(modifier = Modifier.height(5.dp))
//                    Text(
//                        data.content, modifier = Modifier.fillMaxWidth().height(25.dp)
//                            .background(Color.Yellow)
//                    )
//                }
//            } else {
//                Column(modifier = Modifier.padding(start = 15.dp)) {
//                    Spacer(modifier = Modifier.height(5.dp))
//                    Text(
//                        data.content, modifier = Modifier.fillMaxWidth()
//                            .background(Color.Green).height(25.dp)
//                    )
//                }
//            }
//        }
//    }
    val dataList = arrayListOf<Int>()
    for (index in 0..100) {
        dataList.add(index)
    }

    val listState = rememberLazyListState()
    LazyColumn(state = listState) {
        items(dataList) { data ->
            Text("Zhujiang:$data")
        }
    }

    val coroutineScope = rememberCoroutineScope()

    Button(modifier = Modifier.size(60.dp),
        onClick = {
            coroutineScope.launch {
                // Animate scroll to the first item
                listState.animateScrollToItem(index = 0)
            }
        }
    ){
        Text("Top")
    }


}

data class Chat(val content: String, val isLeft: Boolean = true)

@Preview(showBackground = true, widthDp = 200, heightDp = 400)
@Composable
fun LazyColumnTestPreview() {
    LazyColumnTest()
}