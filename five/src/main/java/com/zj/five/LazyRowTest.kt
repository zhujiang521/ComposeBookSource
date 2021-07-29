package com.zj.five

import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun LazyRowTest() {
//    val dataList = arrayListOf<Int>()
//    for (index in 0..10) {
//        dataList.add(index)
//    }
//    LazyRow {
//        items(dataList) { data ->
//            Text("$data", modifier = Modifier.width(20.dp))
//        }
//    }


    val dataList = arrayListOf<Int>()
    for (index in 0..100) {
        dataList.add(index)
    }
    LazyRow {
        items(
            items = dataList,
            key = { index ->
                index
            }
        ) { data ->
            Text("Zhujiang:$data")
        }
    }

}

@Preview(showBackground = true, widthDp = 200, heightDp = 50)
@Composable
fun LazyRowTestPreview() {
    LazyRowTest()
}