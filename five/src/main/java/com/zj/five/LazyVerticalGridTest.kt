package com.zj.five

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@ExperimentalFoundationApi
@Composable
fun LazyVerticalGridTest() {
    val photos = arrayListOf<Int>()
    for (index in 0..20) {
        photos.add(R.drawable.ic_launcher_background)
    }
//    LazyVerticalGrid(
//        cells = GridCells.Adaptive(minSize = 60.dp)
//    ) {
//        items(photos) { photo ->
//            Image(painter = painterResource(photo), "", modifier = Modifier.padding(2.dp))
//        }
//    }

//    LazyVerticalGrid(
//        cells = GridCells.Fixed(count = 5)
//    ) {
//        items(photos) { photo ->
//            Image(painter = painterResource(photo), "", modifier = Modifier.padding(2.dp))
//        }
//    }

    LazyVerticalGrid(
        cells = GridCells.Fixed(count = 3)
    ) {
        items(photos.toArray()) { photo ->
            Image(painter = painterResource(photo as Int), "", modifier = Modifier.padding(2.dp))
        }
    }

}

@ExperimentalFoundationApi
@Preview(showBackground = true, widthDp = 200, heightDp = 400)
@Composable
fun LazyVerticalGridTestPreview() {
    LazyVerticalGridTest()
}