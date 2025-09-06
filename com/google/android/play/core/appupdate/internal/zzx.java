package com.google.android.play.core.appupdate.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.appupdate.zzl;
import i8.d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;

public final class zzx {
    public final Context a;
    public final zzm b;
    public final String c;
    public final ArrayList d;
    public final HashSet e;
    public final Object f;
    public boolean g;
    public final Intent h;
    public final WeakReference i;
    public final zzp j;
    public final AtomicInteger k;
    public c l;
    public zzf m;
    public static final HashMap n;

    static {
        zzx.n = new HashMap();
    }

    public zzx(Context context0, zzm zzm0, String s, Intent intent0, zzl zzl0, @Nullable zzs zzs0) {
        this.d = new ArrayList();
        this.e = new HashSet();
        this.f = new Object();
        this.j = () -> {
            this.b.zzd("reportBinderDeath", new Object[0]);
            zzs zzs0 = (zzs)this.i.get();
            if(zzs0 == null) {
                this.b.zzd("%s : Binder has died.", new Object[]{this.c});
                for(Object object0: this.d) {
                    ((zzn)object0).zzc(new RemoteException(this.c + " : Binder has died."));
                }
                this.d.clear();
            }
            else {
                this.b.zzd("calling onBinderDied", new Object[0]);
                zzs0.zza();
            }
            synchronized(this.f) {
                this.b();
            }
        };
        this.k = new AtomicInteger(0);
        this.a = context0;
        this.b = zzm0;
        this.c = "AppUpdateService";
        this.h = intent0;
        this.i = new WeakReference(null);
    }

    public static void a(zzx zzx0, zzn zzn0) {
        ArrayList arrayList0 = zzx0.d;
        zzm zzm0 = zzx0.b;
        if(zzx0.m == null && !zzx0.g) {
            zzm0.zzd("Initiate binding to the service.", new Object[0]);
            arrayList0.add(zzn0);
            c c0 = new c(zzx0);
            zzx0.l = c0;
            zzx0.g = true;
            if(!zzx0.a.bindService(zzx0.h, c0, 1)) {
                zzm0.zzd("Failed to bind to the service.", new Object[0]);
                zzx0.g = false;
                for(Object object0: arrayList0) {
                    ((zzn)object0).zzc(new zzy());
                }
                arrayList0.clear();
            }
            return;
        }
        if(zzx0.g) {
            zzm0.zzd("Waiting to bind to the service.", new Object[0]);
            arrayList0.add(zzn0);
            return;
        }
        zzn0.run();
    }

    public final void b() {
        HashSet hashSet0 = this.e;
        for(Object object0: hashSet0) {
            ((TaskCompletionSource)object0).trySetException(new RemoteException(this.c + " : Binder has died."));
        }
        hashSet0.clear();
    }

    public final Handler zzc() {
        HashMap hashMap0 = zzx.n;
        synchronized(hashMap0) {
            if(!hashMap0.containsKey(this.c)) {
                HandlerThread handlerThread0 = new HandlerThread(this.c, 10);
                handlerThread0.start();
                Handler handler0 = new Handler(handlerThread0.getLooper());
                hashMap0.put(this.c, handler0);
            }
        }
        return (Handler)hashMap0.get(this.c);
    }

    @Nullable
    public final IInterface zze() {
        return this.m;
    }

    // 检测为 Lambda 实现
    public static void zzj(zzx zzx0) [...]

    public final void zzs(zzn zzn0, @Nullable TaskCompletionSource taskCompletionSource0) {
        d d0 = new d(this, zzn0.a, taskCompletionSource0, zzn0, 2);
        this.zzc().post(d0);
    }

    public final void zzu(TaskCompletionSource taskCompletionSource0) {
        synchronized(this.f) {
            this.e.remove(taskCompletionSource0);
        }
        a a0 = new a(this, 0);
        this.zzc().post(a0);
    }
}

