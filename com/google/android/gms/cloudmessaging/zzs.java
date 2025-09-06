package com.google.android.gms.cloudmessaging;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public final class zzs {
    public final Context a;
    public final ScheduledExecutorService b;
    public b c;
    public int d;
    public static zzs e;

    public zzs(Context context0, ScheduledExecutorService scheduledExecutorService0) {
        this.c = new b(this);
        this.d = 1;
        this.b = scheduledExecutorService0;
        this.a = context0.getApplicationContext();
    }

    public final Task a(d d0) {
        synchronized(this) {
            if(Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Queueing " + d0);
            }
            if(!this.c.d(d0)) {
                b b0 = new b(this);
                this.c = b0;
                b0.d(d0);
            }
        }
        return d0.b.getTask();
    }

    public static zzs zzb(Context context0) {
        synchronized(zzs.class) {
            if(zzs.e == null) {
                zzs.e = new zzs(context0, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new NamedThreadFactory("MessengerIpcClient"))));
            }
            return zzs.e;
        }
    }

    public final Task zzc(int v, Bundle bundle0) {
        int v1;
        synchronized(this) {
            v1 = this.d;
            this.d = v1 + 1;
        }
        return this.a(new c(v1, 2, bundle0, 0));
    }

    public final Task zzd(int v, Bundle bundle0) {
        int v1;
        synchronized(this) {
            v1 = this.d;
            this.d = v1 + 1;
        }
        return this.a(new c(v1, 1, bundle0, 1));
    }
}

