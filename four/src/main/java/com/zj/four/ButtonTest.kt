package com.zj.four

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.interaction.Interaction
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ButtonTest() {
    val context = LocalContext.current
//    Button(
//        onClick = {
//            showToast(context, "点击按钮")
//        },
//        elevation = ButtonDefaults.elevation(3.dp, 7.dp, 0.dp),
//        border = BorderStroke(5.dp, Color.Yellow)
//    ) {
//        Text("按钮")
//    }

//    Button(
//        onClick = {
//            showToast(context, "点击按钮")
//        },
//        shape = RoundedCornerShape(10.dp)
//    ) {
//        Text("按钮")
//    }

//    Button(
//        onClick = {
//            showToast(context, "点击按钮")
//        },
//        colors = ButtonDefaults.buttonColors(
//            backgroundColor = Color.Red,
//            contentColor = Color.Green,
//            disabledBackgroundColor = Color.Yellow,
//            disabledContentColor = Color.Magenta
//        )
//    ) {
//        Text("按钮")
//    }


    Button(
        onClick = {
            showToast(context, "点击按钮")
        },
        contentPadding = PaddingValues(5.dp)
    ) {
        Text("按钮")
    }

//    OutlinedButton(onClick = {
//        showToast(context, "点击按钮")
//    }){
//        Text("按钮")
//    }


//    the MutableInteractionSource representing the stream of
//    * Interactions for this Button. You can create and pass in your own remembered
//    * MutableInteractionSource if you want to observe Interactions and customize the
//    * appearance / behavior of this Button in different Interactions.
}


@Preview(showBackground = true, widthDp = 100, heightDp = 35)
@Composable
fun ButtonTestPreview() {
    ButtonTest()
}