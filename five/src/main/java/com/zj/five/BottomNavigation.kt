/*
 * Copyright 2020 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.zj.five

import android.util.Log
import androidx.annotation.DrawableRes
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun BottomNavigationTest() {
    val tabs = ZhuTabs.values()
    var position by remember { mutableStateOf(ZhuTabs.ONE) }
    Scaffold(
        backgroundColor = Color.Yellow,
        bottomBar = {
            BottomNavigation(backgroundColor = Color.Green, contentColor = Color.Blue) {
                tabs.forEach { tab ->
                    BottomNavigationItem(
                        modifier = Modifier
                            .background(MaterialTheme.colors.primary),
                        icon = { Icon(painterResource(tab.icon), contentDescription = null) },
                        label = { Text(tab.title) },
                        selected = tab == position,
                        onClick = {
                            position = tab
                            Log.e("ZHUJIANG", "BottomNavigationTest: ${tab.title}")
                        },
                        alwaysShowLabel = true,
                        selectedContentColor = Color.Yellow,
                        unselectedContentColor = Color.Red
                    )
                }
            }
        }
    ) {
        when (position) {
            ZhuTabs.ONE -> One()
            ZhuTabs.TWO -> Two()
            ZhuTabs.THREE -> Three()
            ZhuTabs.FOUR -> Four()
        }
    }
}


enum class ZhuTabs(
    val title: String,
    @DrawableRes val icon: Int
) {
    ONE("One", R.drawable.ic_nav_news_normal),
    TWO("Two", R.drawable.ic_nav_tweet_normal),
    THREE("Three", R.drawable.ic_nav_discover_normal),
    FOUR("Fore", R.drawable.ic_nav_my_normal)
}


@Composable
fun One() {
    BaseDefault("One")
}

@Composable
fun Two() {
    BaseDefault("Two")
}

@Composable
fun Three() {
    BaseDefault("Three")
}

@Composable
fun Four() {
    BaseDefault("Four")
}

@Composable
fun BaseDefault(content: String) {
    Row(
        modifier = Modifier.fillMaxSize(),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Text(content, fontSize = 50.sp)
    }
}

@Preview(showBackground = true)
@Composable
fun BottomNavigationTestPreview() {
    BottomNavigationTest()
}