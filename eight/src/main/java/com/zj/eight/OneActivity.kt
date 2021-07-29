package com.zj.eight

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.zj.eight.databinding.ActivityOneBinding

class OneActivity : AppCompatActivity() {

    private lateinit var binding: ActivityOneBinding
    private val viewModel by viewModels<OneViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOneBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initView()
    }

    private fun initView() {
        viewModel.count.observe(this) {
            binding.oneTvCount.text = it.toString()
        }
        binding.oneBtnAdd.setOnClickListener {
            val count = viewModel.count.value ?: 0
            viewModel.onCountChanged(count + 2)
        }
    }
}