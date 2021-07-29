package com.zj.two

import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import com.zj.two.ui.theme.TwoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TwoTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
//                    Greeting("World", true)
//                    TestState2()
//                    TestState4()
                    TestState5()
                }
            }
        }
    }

    override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
        super.onSaveInstanceState(outState, outPersistentState)
    }
}


@Composable
fun Greeting(name: String, isShowName: Boolean) {
    val showName = if (isShowName) "显示名字" else "不显示"
    Text(text = "Hello $name!  $showName")
}

@Preview(name = "测试", widthDp = 100, heightDp = 200, showBackground = true)
@Composable
fun DefaultPreview() {
    Greeting("Zhujiang", false)
}

//@Composable
//fun Bottom() {
//    Navigations {
//        OneScreen()
//        TwoScreen()
//        ThreeScreen()
//    }
//}


@Composable
fun TestState() {
    Column(modifier = Modifier.fillMaxSize()) {
        var index = 0
        Button(onClick = {
            index++
            Log.e("ZHUJIANG123", "TestState: $index")
        }) {
            Text("Add")
        }
        Text("$index", fontSize = 30.sp)
    }
}

@Composable
fun TestState2() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        val index = remember { mutableStateOf(0) }
        Button(onClick = {
            index.value++
            Log.e("ZHUJIANG123", "TestState: ${index.value}")
        }) {
            Text("Add")
        }
        Text("${index.value}", fontSize = 30.sp)
    }
}

@Composable
fun TestState3() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        val index = rememberSaveable { mutableStateOf(0) }
        Button(onClick = {
            index.value++
            Log.e("ZHUJIANG123", "TestState: ${index.value}")
        }) {
            Text("Add")
        }
        Text("${index.value}", fontSize = 30.sp)
    }
}

@Composable
fun TestState4() {
    val index = rememberSaveable { mutableStateOf(0) }
    TestState4(index.value) { index.value = it }
}

class TestViewModel : ViewModel() {

    private val _index = MutableLiveData(0)
    val index: LiveData<Int> = _index

    fun onIndexChange(newName: Int) {
        _index.value = newName
    }
}

@Composable
fun TestState5(testViewModel: TestViewModel = viewModel()) {
    val index by testViewModel.index.observeAsState(0)
    TestState4(index) { testViewModel.onIndexChange(it) }
}

@Composable
fun TestState4(index: Int, onIndexChange: (Int) -> Unit) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Button(onClick = {
            onIndexChange(index + 1)
        }) {
            Text("Add")
        }
        Text("$index", fontSize = 30.sp)
    }
}

@Preview(name = "你好", group = "two", widthDp = 100, heightDp = 200, showBackground = true)
@Composable
fun StatePreview() {
    TestState4()
}


@Composable
fun MyComposable() {
    Column {
        Text("Hello")
        Text("World")
    }
}

/**
 * Flow和RxJava2转State
 */
@Composable
fun TestState6() {
//    val value: Int by flow.collectAsState(0) // flow
//    val completed by completable.subscribeAsState() // RxJava2
//    val value: String by flowable.subscribeAsState("initial")
//    val value: String by maybe.subscribeAsState("initial")
//    val value: String by observable.subscribeAsState("initial")
//    val value: String by single.subscribeAsState("initial")
}


