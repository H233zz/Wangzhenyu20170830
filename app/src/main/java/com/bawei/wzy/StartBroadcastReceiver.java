package com.bawei.wzy;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by WANG123456 on 2017/8/30.
 */

public class StartBroadcastReceiver extends BroadcastReceiver {
    static final String ACTION = "android.intent.action.BOOT_COMPLETED";

    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals(ACTION)) {
           // context.startService(new Intent(context, StartBootService.class), null);//启动倒计时服务
            context.startService(new Intent(context,StartBootService.class));
            Toast.makeText(context, "OlympicsReminder service has started!", Toast.LENGTH_LONG).show();
        }

    }
}
