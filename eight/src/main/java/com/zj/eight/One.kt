package com.zj.eight

import android.content.Context
import android.content.SharedPreferences
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.content.edit
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun One() {
    val context = LocalContext.current
    val sp = context.getSharedPreferences("count_file", Context.MODE_PRIVATE)
    val defaultCount = sp.getInt("DEFAULT_COUNT", 0)
    val viewModel: OneViewModel = viewModel(factory = OneViewModelFactory(defaultCount))
    val count by viewModel.count.observeAsState(defaultCount)
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(count.toString(), modifier = Modifier.padding(10.dp))
        Button(onClick = {
            val counts = count + 2
            viewModel.onCountChanged(counts)
            sp.edit {
                putInt("DEFAULT_COUNT", counts)
            }
        }) {
            Text("Add Count")
        }
        Button(onClick = {
            sp.edit().clear().apply()
            viewModel.onCountChanged(0)
        }, modifier = Modifier.padding(10.dp)) {
            Text("Clear Count")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun OnePreview() {
    One()
}
