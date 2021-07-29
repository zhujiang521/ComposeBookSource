package com.zj.nine

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.zj.nine.databinding.ActivityMainBinding
import com.zj.nine.ui.theme.NineTheme

class MainActivity : ComponentActivity() {

    private lateinit var activityMainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NineTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
//                    Greeting("Android")
//                    AndroidViewPage()
//                    WebViewPage()
//                    AndroidViewBindingPage()
                    Text(
                        "第9章",
                        modifier = Modifier.fillMaxWidth(),
                        fontSize = 50.sp,
                        textAlign = TextAlign.Center
                    )
                    //ScreenAdapter1()
                }
            }
        }
//        activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
//        setContentView(activityMainBinding.root)
//        initView()
    }

    private fun initView() {
        activityMainBinding.apply {
            composeView.setContent {
                Button(onClick = {
                    Toast.makeText(this@MainActivity,mainEditName.text.toString(),Toast.LENGTH_LONG).show()
                }){
                    Text("ComposeView")
                }
            }
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
    NineTheme {
        Greeting("Android")
    }
}