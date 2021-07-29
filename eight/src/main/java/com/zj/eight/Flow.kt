package com.zj.eight

import androidx.compose.foundation.layout.width
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

@Composable
fun FlowTest() {

    fun flowTest(): Flow<Int> = flow {
        for (i in 1..10) {
            delay(1000)
            emit(i)
        }
    }
//            val ss =    Completable()
//.subscribeAsState()

    val flowCount = flowTest().collectAsState(0)
    Text(
        flowCount.value.toString(),
        modifier = Modifier.width(100.dp),
        fontSize = 30.sp,
        textAlign = TextAlign.Center
    )
}


@Preview(showBackground = true)
@Composable
fun FlowTestPreview() {
    FlowTest()
}