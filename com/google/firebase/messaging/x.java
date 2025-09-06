package com.google.firebase.messaging;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager.WakeLock;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;

public final class x implements Runnable {
    public final Context a;
    public final o b;
    public final PowerManager.WakeLock c;
    public final v d;
    public final long e;
    public static final Object f;
    public static Boolean g;
    public static Boolean h;

    static {
        x.f = new Object();
    }

    public x(v v0, Context context0, o o0, long v1) {
        this.d = v0;
        this.a = context0;
        this.e = v1;
        this.b = o0;
        this.c = ((PowerManager)context0.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    public static boolean a(Context context0) {
        Boolean boolean0;
        synchronized(x.f) {
            boolean0 = Boolean.valueOf((x.h == null ? x.b(context0, "android.permission.ACCESS_NETWORK_STATE", null) : x.h.booleanValue()));
            x.h = boolean0;
        }
        return boolean0.booleanValue();
    }

    public static boolean b(Context context0, String s, Boolean boolean0) {
        if(boolean0 != null) {
            return boolean0.booleanValue();
        }
        boolean z = context0.checkCallingOrSelfPermission(s) == 0;
        if(!z && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: " + s + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return z;
    }

    public static boolean c(Context context0) {
        Boolean boolean0;
        synchronized(x.f) {
            boolean0 = Boolean.valueOf((x.g == null ? x.b(context0, "android.permission.WAKE_LOCK", null) : x.g.booleanValue()));
            x.g = boolean0;
        }
        return boolean0.booleanValue();
    }

    public final boolean d() {
        synchronized(this) {
            ConnectivityManager connectivityManager0 = (ConnectivityManager)this.a.getSystemService("connectivity");
            NetworkInfo networkInfo0 = connectivityManager0 == null ? null : connectivityManager0.getActiveNetworkInfo();
            return networkInfo0 != null && networkInfo0.isConnected();
        }
    }

    @Override
    public final void run() {
        v v0 = this.d;
        Context context0 = this.a;
        boolean z = x.c(context0);
        PowerManager.WakeLock powerManager$WakeLock0 = this.c;
        if(z) {
            powerManager$WakeLock0.acquire(Constants.WAKE_LOCK_ACQUIRE_TIMEOUT_MILLIS);
        }
        try {
            v0.e(true);
            if(this.b.d()) {
                if(!x.a(context0) || this.d()) {
                    if(v0.g()) {
                        v0.e(false);
                    }
                    else {
                        v0.h(this.e);
                    }
                    goto label_13;
                }
                goto label_15;
            }
            goto label_21;
        }
        catch(IOException iOException0) {
            goto label_24;
        }
        catch(Throwable throwable0) {
            goto label_33;
        }
    label_13:
        if(!x.c(context0)) {
            return;
        }
        goto label_28;
        try {
        label_15:
            new w(this, this).a();
        }
        catch(IOException iOException0) {
            goto label_24;
        }
        catch(Throwable throwable0) {
            goto label_33;
        }
        if(x.c(context0)) {
            try {
                powerManager$WakeLock0.release();
                return;
            }
            catch(RuntimeException unused_ex) {
                Log.i("FirebaseMessaging", "TopicsSyncTask\'s wakelock was already released due to timeout.");
            }
        }
        return;
        try {
            try {
            label_21:
                v0.e(false);
                goto label_38;
            }
            catch(IOException iOException0) {
            }
        label_24:
            Log.e("FirebaseMessaging", "Failed to sync topics. Won\'t retry sync. " + iOException0.getMessage());
            v0.e(false);
        }
        catch(Throwable throwable0) {
            goto label_33;
        }
        if(!x.c(context0)) {
            return;
        }
        try {
        label_28:
            powerManager$WakeLock0.release();
        }
        catch(RuntimeException unused_ex) {
            Log.i("FirebaseMessaging", "TopicsSyncTask\'s wakelock was already released due to timeout.");
        }
        return;
    label_33:
        if(x.c(context0)) {
            try {
                powerManager$WakeLock0.release();
            }
            catch(RuntimeException unused_ex) {
                Log.i("FirebaseMessaging", "TopicsSyncTask\'s wakelock was already released due to timeout.");
            }
        }
        throw throwable0;
    label_38:
        if(x.c(context0)) {
            try {
                powerManager$WakeLock0.release();
            }
            catch(RuntimeException unused_ex) {
                Log.i("FirebaseMessaging", "TopicsSyncTask\'s wakelock was already released due to timeout.");
            }
        }
    }
}

