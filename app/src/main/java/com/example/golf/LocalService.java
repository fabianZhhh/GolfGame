package com.example.golf;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class LocalService extends Service {
    public LocalService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}