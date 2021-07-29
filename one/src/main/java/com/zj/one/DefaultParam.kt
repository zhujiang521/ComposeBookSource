package com.zj.one

import android.util.Log

class DefaultParam {
    companion object {
        private const val TAG = "DefaultParam"
    }

    fun test() {
        test1(0)
        Test(b = "")
    }

    fun test1(a: Int, b: String = "") {
        Log.e(TAG, "test1: a:$a   b:$b")
    }

    fun testData(){
        val test = Test(a = 10, b = "Zhujiang")
        val (a, b) = test
        Log.e(TAG, "testData: a=$a")
        Log.e(TAG, "testData: b=$b")
    }

}

data class Test(val a: Int = 0, val b: String)