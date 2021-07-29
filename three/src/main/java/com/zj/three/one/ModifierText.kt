package com.zj.three.one


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.zj.three.R
import com.zj.three.ui.theme.ThreeTheme

@Composable
fun ModifierText() {
//    Text("Zhujiang", modifier = Modifier.padding(55.dp))
//    Text("Zhujiang", modifier = Modifier.fillMaxSize())// 宽高都充满父布局
//    Text("Zhujiang", modifier = Modifier.fillMaxWidth())// 只充满宽
//    Text("Zhujiang", modifier = Modifier.fillMaxHeight())// 只充满高
//    Text("Zhujiang", modifier = Modifier.size(100.dp))// 宽高都为100dp
//    Text("Zhujiang", modifier = Modifier.size(width = 100.dp, height = 110.dp))// 宽为100dp,高为110dp

    Box(modifier = Modifier.fillMaxSize()) {
        Spacer(Modifier.matchParentSize().background(Red))
        Text("Zhujiang",fontSize = 30.sp)
    }

//    Row(Modifier.fillMaxSize().padding(top = 10.dp)) {
//        Box(Modifier.weight(2f).height(50.dp).background(Color.Blue))
//        Box(Modifier.weight(1f).height(50.dp).background(Color.Red))
//    }

//    Box(modifier = Modifier.size(50.dp).background(Color.Green).clickable {
//
//    }) {
//
//    }

//    ThreeTheme {
//        Image(
//            painter = painterResource(R.drawable.ic_launcher_background),
//            modifier = Modifier
//                .size(50.dp)
//                .shadow(elevation = 0.dp, shape = MaterialTheme.shapes.medium, true),
//            contentDescription = ""
//        )
//    }

}


@Preview(showBackground = true)
@Composable
fun ModifierTextPreview() {
    ModifierText()
}