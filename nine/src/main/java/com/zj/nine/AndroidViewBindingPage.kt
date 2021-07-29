package com.zj.nine

import android.util.Log
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.viewinterop.AndroidViewBinding
import com.zj.nine.databinding.ComposeLoginBinding

private const val TAG = "AndroidViewBindingPage"

@Composable
fun AndroidViewBindingPage() {
    AndroidViewBinding(
        factory = { inflate, parent, attachToParent ->
            ComposeLoginBinding.inflate(inflate, parent, attachToParent)
        },
        modifier = Modifier.fillMaxSize(),
        update = {
            btnLogin.setOnClickListener {
                val name = editName.text.toString().trim()
                val password = editPassword.text.toString().trim()
                toLogin(name, password)
            }
        }
    )
}

fun toLogin(name: String, password: String) {
    if (name.isEmpty() || password.isEmpty()) {
        Log.e(TAG, "toLogin: 请输入完整信息")
        return
    }
    Log.e(TAG, "toLogin: 登录信息为：name:${name},password:${password}")
}

@Preview
@Composable
fun AndroidViewBindingPagePreview() {
    AndroidViewBindingPage()
}