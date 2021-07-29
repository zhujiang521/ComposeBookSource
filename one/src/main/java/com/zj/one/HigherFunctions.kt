package com.zj.one

import android.util.Log

class HigherFunctions {

    companion object {
        private const val TAG = "HigherFunctions"
    }

    fun test() {
        high({
            Log.e(TAG, "test: string: $it")
        }, "test")
    }

    fun high(one: (String) -> Unit, string: String) {
        // 或者使用one.invoke()进行调用
        one(string)
    }

    fun test2() {
        high2 {
            Log.e(TAG, "test")
        }
    }

    fun high2(two: () -> Unit) {
        two()
    }

}