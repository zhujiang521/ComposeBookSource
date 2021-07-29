package com.zj.five

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@ExperimentalFoundationApi
@Composable
fun ComplexStickyHeaderTest() {
    val letters = arrayListOf("A", "B", "C", "D", "E")
    val contactList = arrayListOf<Contact>()
    val nameList = arrayListOf<String>()
    for (index in 0..5) {
        nameList.add("路人$index")
    }
    for (index in letters.iterator()) {
        contactList.add(Contact(letters = index, nameList))
    }

    LazyColumn {
        contactList.forEach { (letter, nameList) ->
            stickyHeader {
                Text(
                    letter,
                    modifier = Modifier.padding(10.dp).background(Color.Green)
                        .fillMaxWidth(), textAlign = TextAlign.Center,
                    fontSize = 35.sp
                )
            }

            items(nameList) { contact ->
                Text(
                    contact,
                    modifier = Modifier.padding(10.dp).background(Color.Red).height(50.dp)
                        .fillMaxWidth(), textAlign = TextAlign.Center,
                    fontSize = 35.sp
                )
            }
        }
    }

}

data class Contact(val letters: String, val nameList: List<String>)

@ExperimentalFoundationApi
@Preview(showBackground = true, widthDp = 200, heightDp = 400)
@Composable
fun ComplexStickyHeaderTestPreview() {
    ComplexStickyHeaderTest()
}