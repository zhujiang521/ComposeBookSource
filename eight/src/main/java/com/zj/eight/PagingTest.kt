package com.zj.eight

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.paging.LoadState
import androidx.paging.PagingData
import androidx.paging.compose.collectAsLazyPagingItems
import androidx.paging.compose.items
import kotlinx.coroutines.flow.Flow

@Composable
fun PagingTest(flow: Flow<PagingData<String>>) {
    val lazyPagingItems = flow.collectAsLazyPagingItems()
    LazyColumn {
        items(lazyPagingItems) {
            Text(it.toString())
        }
    }
}

private const val TAG = "PagingTest"

@Composable
fun Paging3Test(flow: Flow<PagingData<String>>) {
    val lazyPagingItems = flow.collectAsLazyPagingItems()
    LazyColumn {
        items(lazyPagingItems) {
            Text(it.toString())
        }

        val mediator = lazyPagingItems.loadState
        when {
            mediator.refresh is LoadState.Loading -> {
                item {
                    // 加载页面
                }
            }
            mediator.append is LoadState.Loading -> {
                item {
                    // 加载页面
                }
            }
            mediator.refresh is LoadState.Error -> {
                val e = lazyPagingItems.loadState.refresh as LoadState.Error
                Log.e(TAG, "Paging3Test: ${e.error.localizedMessage}")
                item {
                    // 错误页面
                }
            }
            mediator.append is LoadState.Error -> {
                val e = lazyPagingItems.loadState.append as LoadState.Error
                Log.e(TAG, "Paging3Test: ${e.error.localizedMessage}")
                item {
                    // 重试按钮
                    Row(
                        modifier = Modifier.fillMaxWidth().padding(8.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center,
                    ) {
                        Button(
                            onClick = { lazyPagingItems.retry() }) {
                            Text("Retry")
                        }
                    }
                }
            }
        }
    }
}