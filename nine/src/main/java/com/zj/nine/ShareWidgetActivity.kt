package com.zj.nine

import android.os.Bundle
import androidx.activity.ComponentActivity
import com.zj.nine.databinding.ActivityShareWidgetBinding

class ShareWidgetActivity : ComponentActivity() {

    private lateinit var shareWidgetBinding: ActivityShareWidgetBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        shareWidgetBinding = ActivityShareWidgetBinding.inflate(layoutInflater)
        setContentView(shareWidgetBinding.root)
        initView()
    }

    private fun initView() {
        shareWidgetBinding.apply {
            shareComposeView.setContent {
                WebViewPage()
            }
        }
    }
}