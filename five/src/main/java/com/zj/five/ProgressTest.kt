package com.zj.five

import androidx.compose.foundation.layout.size
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.LinearProgressIndicator
import androidx.compose.material.ProgressIndicatorDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ProgressTest(){
    //LinearProgressIndicator()
    CircularProgressIndicator(modifier = Modifier.size(50.dp))
}

@Preview(showBackground = true, widthDp = 200, heightDp = 200)
@Composable
fun ProgressTestPreview() {
    ProgressTest()
}