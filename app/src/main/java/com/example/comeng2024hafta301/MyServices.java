package com.example.comeng2024hafta301;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class MyServices extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onDestroy() {

        Toast.makeText(this,
                "SERVICE Destroyed",
                Toast.LENGTH_LONG).show();

        super.onDestroy();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        Toast.makeText(this,
                "SERVICE Started",
                Toast.LENGTH_LONG).show();


     onDestroy();
        return super.onStartCommand(intent, flags, startId);
    }
}
