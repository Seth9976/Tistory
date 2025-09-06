package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.compose.material3.e9;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledThreadPoolExecutor;

public final class u implements Callable {
    public final Context a;
    public final ScheduledThreadPoolExecutor b;
    public final FirebaseMessaging c;
    public final o d;
    public final n e;

    public u(Context context0, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor0, FirebaseMessaging firebaseMessaging0, o o0, n n0) {
        this.a = context0;
        this.b = scheduledThreadPoolExecutor0;
        this.c = firebaseMessaging0;
        this.d = o0;
        this.e = n0;
    }

    @Override
    public final Object call() {
        t t0;
        Context context0 = this.a;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor0 = this.b;
        FirebaseMessaging firebaseMessaging0 = this.c;
        o o0 = this.d;
        n n0 = this.e;
        synchronized(t.class) {
            t0 = t.b == null ? null : ((t)t.b.get());
            if(t0 == null) {
                SharedPreferences sharedPreferences0 = context0.getSharedPreferences("com.google.android.gms.appid", 0);
                t t1 = new t();  // 初始化器: Ljava/lang/Object;-><init>()V
                synchronized(t1) {
                    t1.a = e9.a(sharedPreferences0, scheduledThreadPoolExecutor0);
                }
                t.b = new WeakReference(t1);
                t0 = t1;
            }
        }
        return new v(firebaseMessaging0, o0, t0, n0, context0, scheduledThreadPoolExecutor0);
    }
}

