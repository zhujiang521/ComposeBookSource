package com.zj.seven.dynamic

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.os.BatteryManager
import android.util.Log

class BatteryReceiver : BroadcastReceiver() {

    companion object {
        private const val TAG = "BatteryReceiver"
    }

    override fun onReceive(context: Context?, intent: Intent?) {
        if (intent == null) {
            Log.w(TAG, "intent is null")
            return
        }
        val battery = intent.getIntExtra("level", 0)    ///电池剩余电量
        val status = intent.getIntExtra("status", BatteryManager.BATTERY_STATUS_UNKNOWN)  /// 充电状态
        val isCharge =
            status == BatteryManager.BATTERY_STATUS_CHARGING || status == BatteryManager.BATTERY_STATUS_FULL ///获取电池状态

        Log.w(TAG, "battery:battery isCharge:$isCharge")
//        intent.getIntExtra("scale", 0);  ///获取电池满电量数值
//        intent.getStringExtra("technology");  ///获取电池技术支持
//        intent.getIntExtra("plugged", 0);  ///获取电源信息
//        intent.getIntExtra("health",BatteryManager.BATTERY_HEALTH_UNKNOWN);  ///获取电池健康度
//        intent.getIntExtra("voltage", 0);  ///获取电池电压
//        intent.getIntExtra("temperature", 0);  ///获取电池温度

//        context?.startActivity(Intent(context, DynamicActivity::class.java).apply {
//            addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
//        })

    }

}