package com.google.firebase.messaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import java.util.concurrent.TimeUnit;

public final class w extends BroadcastReceiver {
    public x a;
    public final x b;

    public w(x x0, x x1) {
        this.b = x0;
        super();
        this.a = x1;
    }

    public final void a() {
        if(Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Connectivity change received registered");
        }
        IntentFilter intentFilter0 = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        this.b.a.registerReceiver(this, intentFilter0);
    }

    @Override  // android.content.BroadcastReceiver
    public final void onReceive(Context context0, Intent intent0) {
        synchronized(this) {
            x x0 = this.a;
            if(x0 == null) {
                return;
            }
            if(!x0.d()) {
                return;
            }
            if(Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
            }
            this.a.d.f.schedule(this.a, 0L, TimeUnit.SECONDS);
            context0.unregisterReceiver(this);
            this.a = null;
        }
    }
}

