package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import androidx.core.app.h;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.Task;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class b0 implements ServiceConnection {
    public final Context a;
    public final Intent b;
    public final ScheduledThreadPoolExecutor c;
    public final ArrayDeque d;
    public z e;
    public boolean f;

    public b0(Context context0) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor0 = new ScheduledThreadPoolExecutor(0, new NamedThreadFactory("Firebase-FirebaseInstanceIdServiceConnection"));
        super();
        this.d = new ArrayDeque();
        this.f = false;
        this.a = context0.getApplicationContext();
        this.b = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage("net.daum.android.tistoryapp");
        this.c = scheduledThreadPoolExecutor0;
    }

    public final void a() {
        synchronized(this) {
            if(Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "flush queue called");
            }
            while(!this.d.isEmpty()) {
                if(Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "found intent to be delivered");
                }
                if(this.e != null && this.e.isBinderAlive()) {
                    if(Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
                    }
                    a0 a00 = (a0)this.d.poll();
                    this.e.a(a00);
                    continue;
                }
                this.c();
                return;
            }
        }
    }

    public final Task b(Intent intent0) {
        a0 a00;
        synchronized(this) {
            if(Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
            }
            a00 = new a0(intent0);
            boolean z = (a00.a.getFlags() & 0x10000000) != 0;
            h h0 = new h(this.c.schedule(new androidx.activity.h(a00, 16), (z ? y.a : 9000L), TimeUnit.MILLISECONDS), 11);
            a00.b.getTask().addOnCompleteListener(this.c, h0);
            this.d.add(a00);
            this.a();
        }
        return a00.b.getTask();
    }

    public final void c() {
        if(Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "binder is dead. start connection? " + !this.f);
        }
        if(this.f) {
            return;
        }
        try {
            this.f = true;
            if(ConnectionTracker.getInstance().bindService(this.a, this.b, this, 65)) {
                return;
            }
            Log.e("FirebaseMessaging", "binding to the service failed");
        }
        catch(SecurityException securityException0) {
            Log.e("FirebaseMessaging", "Exception while binding the service", securityException0);
        }
        this.f = false;
        while(true) {
            ArrayDeque arrayDeque0 = this.d;
            if(arrayDeque0.isEmpty()) {
                break;
            }
            ((a0)arrayDeque0.poll()).b.trySetResult(null);
        }
    }

    @Override  // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName0, IBinder iBinder0) {
        synchronized(this) {
            if(Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "onServiceConnected: " + componentName0);
            }
            this.f = false;
            if(!(iBinder0 instanceof z)) {
                Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder0);
                while(true) {
                    ArrayDeque arrayDeque0 = this.d;
                    if(arrayDeque0.isEmpty()) {
                        break;
                    }
                    ((a0)arrayDeque0.poll()).b.trySetResult(null);
                }
                return;
            }
            this.e = (z)iBinder0;
            this.a();
        }
    }

    @Override  // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName0) {
        if(Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceDisconnected: " + componentName0);
        }
        this.a();
    }
}

