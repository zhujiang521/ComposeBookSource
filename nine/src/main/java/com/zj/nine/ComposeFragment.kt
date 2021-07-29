package com.zj.nine

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import androidx.compose.material.Text
import androidx.compose.ui.platform.ComposeView
import com.zj.nine.ui.theme.NineTheme

class ComposeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
//        return ComposeView(requireContext()).apply {
//            setContent {
//                NineTheme {
//                    AndroidViewBindingPage()
//                }
//            }
//        }

        return LinearLayout(requireContext()).apply {
            orientation = LinearLayout.VERTICAL
            addView(ComposeView(requireContext()).apply {
                id = R.id.compose_one
                setContent {
                    AndroidViewBindingPage()
                }
            })
            addView(Button(requireContext()).apply {
                id = R.id.compose_btn
                text = "Compose"
            })
            addView(ComposeView(requireContext()).apply {
                id = R.id.compose_two
                setContent {
                    Text("测试Compose")
                }
            })
        }
    }

}