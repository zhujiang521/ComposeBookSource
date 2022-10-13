package com.zj.seven

import android.content.Intent
import android.content.IntentFilter
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.zj.seven.dynamic.BatteryReceiver
import com.zj.seven.dynamic.DynamicIsLand
import com.zj.seven.dynamic.DynamicScreen
import com.zj.seven.spec.SpecTest
import com.zj.seven.ui.theme.SevenTheme

class MainActivity : ComponentActivity() {

    private val batteryReceiver = BatteryReceiver()

    @ExperimentalMaterialApi
    @ExperimentalAnimationApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val intentFilter = IntentFilter()
        intentFilter.addAction(Intent.ACTION_BATTERY_CHANGED)
        registerReceiver(batteryReceiver, intentFilter)
        setContent {
            SevenTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
//                    Greeting("Android")
//                    EasyAnimation()
//                    BottomNavigationTest()
//                    AnimateAsStateTest()
//                    AnimatableTest()
//                    TransitionTest()
//                    InfiniteTransitionTest()
//                    ScrollTest()
//                    ScrollTest2()
//                    SwipeableSample()

//                    DynamicIsLand()

//                    SpecTest()
                    DynamicScreen()
                }
            }
        }
    }


    override fun onDestroy() {
        super.onDestroy()
        unregisterReceiver(batteryReceiver)
    }

}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    SevenTheme {
        Greeting("Android")
    }
}