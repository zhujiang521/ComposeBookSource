package com.zj.nine

import android.widget.CalendarView
import android.widget.Toast
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.viewinterop.AndroidView

@Composable
fun AndroidViewPage() {
    AndroidView(
        factory = {
            CalendarView(it)
        },
        modifier = Modifier.fillMaxWidth(),
        update = {
            it.setOnDateChangeListener { view, year, month, day ->
                Toast.makeText(view.context, "${year}年${month}月${day}日", Toast.LENGTH_LONG).show()
            }
        }
    )
}

@Preview
@Composable
fun AndroidViewPagePreview() {
    AndroidViewPage()
}