package com.zj.three

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.zj.three.one.*
import com.zj.three.ui.theme.ThreeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        setContent {
//            ThreeTheme {
//                // A surface container using the 'background' color from the theme
//                Surface(color = MaterialTheme.colors.background) {
//                    //Greeting("Android")
//                    ColumnTest()
//                    Arrangement.SpaceAround
//                }
//            }
//            ColumnTest()
//            RowTest()
//            BoxTest()
            ModifierText()
//            ScaffoldTest()
//            ConstraintLayoutTest()
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ThreeTheme {
        Greeting("Android")
    }
}