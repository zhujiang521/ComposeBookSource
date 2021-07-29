package com.zj.eight

import android.util.Log
import android.widget.Toast
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.hilt.lifecycle.HiltViewModelFactory
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.*
import com.google.gson.Gson


@Composable
fun NavigationTest(
    startDestination: String = "one_page"
) {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = startDestination
    ) {
        composable("one_page") {
            OnePage(navController)
        }
//        composable("one_page") {backStackEntry ->
//            // Creates a ViewModel from the current BackStackEntry
//            val exampleViewModel: OneViewModel =
//                viewModel(
//                    HiltViewModelFactory(LocalContext.current, backStackEntry)
//                )
//            OnePage(navController)
//        }
        composable(
            "two_page/{name}/{age}?hobby={hobby}/{people}",
            arguments = listOf(
                navArgument("name") { type = NavType.StringType },
                navArgument("age") { type = NavType.IntType },
                navArgument("hobby") {
                    type = NavType.StringType
                    defaultValue = "踢足球"
                },
                navArgument("people") { type = NavType.StringType },
            ),
        ) {
            Log.e("ZHUJIANG123", "NavigationTest: ${it.arguments?.getString("age")}")
            val defaultPeople = it.arguments?.getString("people", "") ?: ""
            val people = Gson().fromJson(defaultPeople, People::class.java)
            TwoPage(
                it.arguments?.getString("name", "") ?: "",
                it.arguments?.getInt("age") ?: 20,
                it.arguments?.getString("hobby", "") ?: "",
                people
            )
        }
    }
}

@Composable
fun OnePage(navController: NavHostController) {
    val people = People("两只手", "两只脚")
    val gson = Gson().toJson(people)
    BasePage("One") {
        navController.navigate("two_page/Zhujiang/24?hobby=打乒乓球/$gson")
    }
}

@Composable
fun TwoPage(content: String, age: Int, hobby: String, people: People) {
    val context = LocalContext.current
    BasePage("Two") {
        Toast.makeText(context, "${content}今年${age}岁,爱好$hobby, $people", Toast.LENGTH_LONG).show()
    }
}

@Composable
fun BasePage(content: String, onClick: () -> Unit) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(content, fontSize = 35.sp, modifier = Modifier.clickable { onClick() })
    }
}

data class People(val hand: String, val foot: String)

@Preview(showBackground = true)
@Composable
fun NavigationTestPreview() {
    NavigationTest()
}