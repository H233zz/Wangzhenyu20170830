package com.bawei.wzy;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by WANG123456 on 2017/8/30.
 */

public class StartBootService extends Service {
    private static final String TAG = "MyService";
    private MediaPlayer player;

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    /**
     * 创建服务
     */
    public void onCreate() {
        super.onCreate();

        Log.i(TAG, "开机服务已经创建！");
        //初始化播放器
        player = MediaPlayer.create(this, R.raw.caiyunzhunyue);
        player.setLooping(true);
    }

    /**
     * 开始服务
     */
    public void onStart(Intent intent, int startId) {
        // TODO Auto-generated method stub
        super.onStart(intent, startId);
        Toast.makeText(this, "开机播放服务~", Toast.LENGTH_LONG).show();
        player.start();
    }

    /**
     * 暂停服务
     */
    public void onDestroy() {
        // TODO Auto-generated method stub
        super.onDestroy();
        Toast.makeText(this, "停止播放服务~", Toast.LENGTH_LONG).show();
        player.stop();
    }
}
