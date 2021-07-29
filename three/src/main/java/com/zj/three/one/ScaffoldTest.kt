package com.zj.three.one

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp

@Composable
fun ScaffoldTest() {
    Scaffold(
        drawerContent = { /*.侧滑抽屉页面..*/
            Column(
                modifier = Modifier.fillMaxSize().background(Color.Green),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Text("侧边栏", fontSize = 40.sp)
            }
        },
        topBar = { /*.标题栏..*/
            TopAppBar(title = { Text("标题") }, navigationIcon = {
                IconButton(onClick = {  /*.点击事件..*/ }) {
                    Icon(Icons.Filled.ArrowBack, "")
                }})
//            }, actions = {
//                IconButton(onClick = { /*.点击事件..*/ }) {
//                    Icon(Icons.Filled.Share, "")
//                }
//                IconButton(onClick = { /*.点击事件..*/ }) {
//                    Icon(Icons.Filled.Settings, "")
//                }
//            })
        },
        floatingActionButton = { /*.悬浮按钮..*/
            FloatingActionButton(onClick = {
                // Floating点击事件
            }) {
                Text("OK")
            }
        },
        content = { /*.主内容..*/
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Text("主屏幕", fontSize = 40.sp)
            }
        }
    )
}