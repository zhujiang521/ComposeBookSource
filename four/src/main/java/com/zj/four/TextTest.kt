package com.zj.four

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.text.selection.DisableSelection
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.*
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

private const val TAG = "TextTest"

@Composable
fun TextTest() {
//    Text("Zhujiang")

//    Text(stringResource(R.string.zhu_jiang))

//    Text(
//        stringResource(R.string.zhu_jiang),
//        color = Color.Red
//    )

//    Text(stringResource(R.string.zhu_jiang), fontSize = 25.sp)

//    Text(stringResource(R.string.zhu_jiang), fontStyle = FontStyle.Italic)

//    Text(stringResource(R.string.zhu_jiang), fontWeight = FontWeight.Bold)

//    Text(stringResource(R.string.zhu_jiang), fontWeight = FontWeight(1))

//    Column {
//        Text("Hello World", fontFamily = FontFamily.Default)
//        Text("Hello World", fontFamily = FontFamily.SansSerif)
//        Text("Hello World", fontFamily = FontFamily.Serif)
//        Text("Hello World", fontFamily = FontFamily.Monospace)
//        Text("Hello World", fontFamily = FontFamily.Cursive)
//    }

//    Text(stringResource(R.string.zhu_jiang), letterSpacing = 5.sp)

//    Text("朱江", letterSpacing = 5.sp)


//    Column {
//        Text("Hello World", textDecoration = TextDecoration.None)
//        Text("Hello World", textDecoration = TextDecoration.Underline)
//        Text("Hello World", textDecoration = TextDecoration.LineThrough)
//    }

//    Text(stringResource(R.string.zhu_jiang), textAlign = TextAlign.Center,
//        modifier = Modifier.width(150.dp))

//    Text("素胚勾勒出青花笔锋浓转淡",lineHeight = 35.sp)


//    Column {
//        Text("素胚勾勒出青花笔锋浓转淡", maxLines = 1, overflow = TextOverflow.Clip)
//        Text("素胚勾勒出青花笔锋浓转淡", maxLines = 1, overflow = TextOverflow.Ellipsis)
//    }

//    Column {
//        Text("出青花\n笔锋浓转淡", softWrap = false)
//        Text("出青花\n笔锋浓转淡", softWrap = true)
//    }

    Text(buildAnnotatedString {
        withStyle(style = SpanStyle(color = Color.Blue)) {
            append("Z")
        }
        append("hu ")

        withStyle(style = SpanStyle(fontWeight = FontWeight.Bold, color = Color.Red)) {
            append("J")
        }
        append("iang")
    })

//    Text(buildAnnotatedString {
//        withStyle(style = ParagraphStyle(lineHeight = 30.sp)) {
//            withStyle(style = SpanStyle(color = Color.Blue)) {
//                append("Hello\n")
//            }
//            withStyle(style = SpanStyle(fontWeight = FontWeight.Bold,
//                color = Color.Red)) {
//                append("World\n")
//            }
//            append("Compose")
//        }
//    })


//    SelectionContainer(modifier = Modifier.fillMaxSize()) {
//        Text("This text is selectable", fontSize = 35.sp)
//    }

//    SelectionContainer {
//        Column {
//            Text("天青色等烟雨")
//            Text("而我在等你")
//            Text("月色被打捞起")
//            DisableSelection {
//                Text("晕开了结局")
//                Text("如传世的青花瓷")
//            }
//            Text("自顾自美丽")
//            Text("你眼带笑意")
//        }
//    }

//    ClickableText(
//        text = AnnotatedString("点击"),
//        onClick = { offset ->
//            Log.d(TAG, "$offset")
//        }
//    )

//    val annotatedText = buildAnnotatedString {
//        append("点击 ")
//
//        pushStringAnnotation(tag = "URL",
//            annotation = "https://developer.android.com")
//        withStyle(style = SpanStyle(color = Color.Blue,
//            fontWeight = FontWeight.Bold)) {
//            append("Url")
//        }
//        pop()
//    }
//
//    ClickableText(
//        text = annotatedText,
//        onClick = { offset ->
//            annotatedText.getStringAnnotations(tag = "URL", start = offset,
//                end = offset)
//                .firstOrNull()?.let { annotation ->
//                    // If yes, we log its value
//                    Log.d("Clicked URL", annotation.item)
//                }
//        }
//    )

}


@Preview(showBackground = true, widthDp = 100, heightDp = 100)
@Composable
fun TextTestPreview() {
    TextTest()
}