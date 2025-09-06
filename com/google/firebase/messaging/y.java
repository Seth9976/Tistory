package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.stats.WakeLock;
import java.util.concurrent.TimeUnit;

public abstract class y {
    public static final long a;
    public static final Object b;
    public static WakeLock c;

    static {
        y.a = TimeUnit.MINUTES.toMillis(1L);
        y.b = new Object();
    }

    public static void a(Intent intent0) {
        synchronized(y.b) {
            if(y.c != null && intent0.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false)) {
                intent0.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                y.c.release();
            }
        }
    }

    public static ComponentName b(Context context0, Intent intent0) {
        synchronized(y.b) {
            if(y.c == null) {
                WakeLock wakeLock0 = new WakeLock(context0, 1, "wake:com.google.firebase.iid.WakeLockHolder");
                y.c = wakeLock0;
                wakeLock0.setReferenceCounted(true);
            }
            boolean z = intent0.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
            intent0.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
            ComponentName componentName0 = context0.startService(intent0);
            if(componentName0 == null) {
                return null;
            }
            if(!z) {
                y.c.acquire(y.a);
            }
            return componentName0;
        }
    }
}

