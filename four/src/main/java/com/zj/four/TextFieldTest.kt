package com.zj.four

import android.widget.Toast
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun TextFieldTest() {
    val text = remember { mutableStateOf("你好") }

//    TextField(
//        modifier = Modifier.fillMaxWidth().padding(10.dp),
//        value = text.value,
//        onValueChange = { text.value = it },
//        label = { Text("标签") }
//    )


//    OutlinedTextField(
//        value = text.value,
//        onValueChange = { text.value = it },
//        label = { Text("标签") }
//    )


//    BasicTextField(
//        value = text.value,
//        onValueChange = { text.value = it },
//    )

//    TextField(
//        value = text.value,
//        onValueChange = { text.value = it },
//        label = { Text("Enter text") },
//        maxLines = 2,
//        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email,imeAction = ImeAction.Send),
//        textStyle = TextStyle(color = Color.Blue, fontWeight = FontWeight.Bold),
//        modifier = Modifier.padding(20.dp)
//    )

//    TextField(
//        value = text.value,
//        onValueChange = { text.value = it },
//        label = { Text("Enter text") },
//        keyboardOptions = KeyboardOptions(
//            capitalization = KeyboardCapitalization.Characters,
//            keyboardType = KeyboardType.Email,
//            autoCorrect = true,
//            imeAction = ImeAction.Search
//        ),
//        textStyle = TextStyle(color = Color.Blue, fontWeight = FontWeight.Bold),
//        modifier = Modifier.padding(20.dp)
//    )


    val context = LocalContext.current
    TextField(
        value = text.value,
        onValueChange = { text.value = it },
        label = { Text("Enter text") },
        keyboardOptions = KeyboardOptions(
            capitalization = KeyboardCapitalization.Characters,
            keyboardType = KeyboardType.Email,
            autoCorrect = true,
            imeAction = ImeAction.Search
        ),
        keyboardActions = KeyboardActions(onSearch = {
            Toast.makeText(context, "朱江：${text.value}", Toast.LENGTH_SHORT).show()
        }),
        textStyle = TextStyle(color = Color.Blue, fontWeight = FontWeight.Bold),
        modifier = Modifier.padding(20.dp)
    )

}

@Preview(showBackground = true, widthDp = 100, heightDp = 100)
@Composable
fun TextFieldTestPreview() {
    TextFieldTest()
}