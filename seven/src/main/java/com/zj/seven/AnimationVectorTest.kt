package com.zj.seven

import androidx.compose.animation.core.AnimationVector1D
import androidx.compose.animation.core.AnimationVector2D
import androidx.compose.animation.core.TwoWayConverter
import androidx.compose.animation.core.animateValueAsState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun AnimationVectorTest() {
    val IntToVector: TwoWayConverter<Int, AnimationVector1D> =
        TwoWayConverter({ AnimationVector1D(it.toFloat()) }, { it.value.toInt() })
}

data class TestSize(val width: Dp, val height: Dp)

@Composable
fun TestAnimation(targetSize: TestSize) {
    val animSize: TestSize by animateValueAsState<TestSize, AnimationVector2D>(
        targetSize,
        TwoWayConverter(
            convertToVector = { size: TestSize ->
                AnimationVector2D(size.width.value, size.height.value)
            },
            convertFromVector = { vector: AnimationVector2D ->
                TestSize(vector.v1.dp, vector.v2.dp)
            }
        )
    )
}

@Preview(showBackground = true)
@Composable
fun AnimationVectorTestPreview() {
    AnimationVectorTest()
}