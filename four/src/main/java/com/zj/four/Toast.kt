package com.zj.four

import android.content.Context
import android.widget.Toast

// 普通Toast
fun showToast(context: Context, content: String) {
    Toast.makeText(context, content, Toast.LENGTH_SHORT).show()
}

// 长Toast
fun showLongToast(context: Context, content: String) {
    Toast.makeText(context, content, Toast.LENGTH_LONG).show()
}