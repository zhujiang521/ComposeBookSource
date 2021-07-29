package com.zj.three.one

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout

@Composable
fun ConstraintLayoutTest() {
    ConstraintLayout(modifier = Modifier.fillMaxSize()) {
        val (one, two) = createRefs()
        val three = createRef()
        DefaultText(
            "One",
            modifier = Modifier.constrainAs(one) {
                start.linkTo(parent.start)
                end.linkTo(parent.end)
                top.linkTo(parent.top, margin = 16.dp)
            }
        )

        DefaultText("Two", Modifier.constrainAs(two) {
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            top.linkTo(one.bottom, margin = 16.dp)
        })


        DefaultText("Three", Modifier.constrainAs(three) {
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            bottom.linkTo(parent.bottom, margin = 16.dp)
        })
    }
}

@Composable
fun DefaultText(text: String, modifier: Modifier) {
    Text(
        text,
        modifier = modifier.size(100.dp)
            .background(Color.Red),
        fontSize = 30.sp,
        textAlign = TextAlign.Center
    )
}


@Preview(showBackground = true)
@Composable
fun ConstraintLayoutTestPreview() {
    ConstraintLayoutTest()
}