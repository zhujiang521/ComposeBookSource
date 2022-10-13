package com.zj.seven.dynamic

import android.content.Context
import android.content.Intent
import android.graphics.PixelFormat
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.WindowManager
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.zj.seven.R


class DynamicActivity : AppCompatActivity() {

    private var batteryValue = 0
    private var batteryState = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        batteryValue = intent.getIntExtra(BATTERY_VALUE, -1)
        batteryState = intent.getBooleanExtra(BATTERY_STATE, false)
        setContentView(R.layout.activity_dynamic)
        val textView = findViewById<TextView>(R.id.almanacTvDate)
        textView.text = "当前电量：$batteryValue, 正在充电？:$batteryState"
    }

//    /**
//     * 显示弹出框
//     *
//     * @param context
//     */
//    fun showPopupWindow(context: Context, callback: DialogCallback) {
//        // 获取WindowManager
//        val mWindowManager = context.getSystemService(Context.WINDOW_SERVICE) as WindowManager
//        val params = WindowManager.LayoutParams()
//        // 类型
//        params.type = WindowManager.LayoutParams.TYPE_SYSTEM_ALERT
//        // 设置flag
//        params.flags =
//            WindowManager.LayoutParams.FLAG_ALT_FOCUSABLE_IM or WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE
//        // 如果设置了WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE，弹出的View收不到Back键的事件
//        // 不设置这个弹出框的透明遮罩显示为黑色
//        params.format = PixelFormat.TRANSLUCENT
//        // FLAG_NOT_TOUCH_MODAL不阻塞事件传递到后面的窗口
//        // 设置 FLAG_NOT_FOCUSABLE 悬浮窗口较小时，后面的应用图标由不可长按变为可长按
//        // 不设置这个flag的话，home页的划屏会有问题
//        params.width = WindowManager.LayoutParams.WRAP_CONTENT
//        params.height = WindowManager.LayoutParams.WRAP_CONTENT
//        params.gravity = Gravity.CENTER
//        val textView = TextView(context)
//        textView.text = "sfgsfdsfbsadfbasdfg"
//        textView.textSize = 100f
//        val mView: View = LayoutInflater.from(context).inflate(R.layout.item_dialog_exit, null)
//        val tv_itemdialog_title = mView.findViewById(R.id.tv_itemdialog_title) as TextView
//        val tv_itemdialog_ok = mView.findViewById(R.id.tv_itemdialog_ok) as TextView
//        val tv_itemdialog_close = mView.findViewById(R.id.tv_itemdialog_close) as TextView
//        tv_itemdialog_ok.text = "重新登录"
//        tv_itemdialog_close.text = "退出登录"
//        tv_itemdialog_title.text = "该账户在其他设备登录,若不是您在操作,请及时修改密码以防泄露信息"
//        tv_itemdialog_ok.setOnClickListener(object : OnClickListener() {
//            fun onClick(v: View?) {
//                // 隐藏弹窗
//                mWindowManager.removeView(mView)
//                callback.onPositive()
//            }
//        })
//        tv_itemdialog_close.setOnClickListener(object : OnClickListener() {
//            fun onClick(v: View?) {
//                mWindowManager.removeView(mView)
//                callback.onNegative()
//            }
//        })
//        mWindowManager.addView(textView, params)
//    }

    companion object {

        const val BATTERY_VALUE = "BATTERY_VALUE"
        const val BATTERY_STATE = "BATTERY_STATE"

        fun actionStart(
            context: Context,
            batteryValue: Int,
            batteryState: Boolean,
        ) {
            val intent = Intent(context, DynamicActivity::class.java).apply {
                putExtra(BATTERY_VALUE, batteryValue)
                putExtra(BATTERY_STATE, batteryState)
            }
            context.startActivity(intent)
        }
    }


}