package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Message;
import android.os.StrictMode.VmPolicy.Builder;
import android.os.StrictMode.VmPolicy;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.concurrent.Executor;

public final class k implements ServiceConnection, zzs {
    public final HashMap a;
    public int b;
    public boolean c;
    public IBinder d;
    public final zzn e;
    public ComponentName f;
    public final l g;

    public k(l l0, zzn zzn0) {
        this.g = l0;
        this.e = zzn0;
        this.a = new HashMap();
        this.b = 2;
    }

    public final void a(Executor executor0, String s) {
        this.b = 3;
        StrictMode.VmPolicy strictMode$VmPolicy0 = StrictMode.getVmPolicy();
        StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder(strictMode$VmPolicy0).permitUnsafeIntentLaunch().build());
        try {
            Intent intent0 = this.e.zzc(this.g.f);
            boolean z = this.g.i.zza(this.g.f, s, intent0, this, this.e.zza(), executor0);
            this.c = z;
            if(z) {
                Message message0 = this.g.g.obtainMessage(1, this.e);
                this.g.g.sendMessageDelayed(message0, this.g.k);
            }
            else {
                try {
                    this.b = 2;
                    this.g.i.unbindService(this.g.f, this);
                }
                catch(IllegalArgumentException unused_ex) {
                }
            }
        }
        finally {
            StrictMode.setVmPolicy(strictMode$VmPolicy0);
        }
    }

    @Override  // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName0, IBinder iBinder0) {
        synchronized(this.g.e) {
            this.g.g.removeMessages(1, this.e);
            this.d = iBinder0;
            this.f = componentName0;
            for(Object object0: this.a.values()) {
                ((ServiceConnection)object0).onServiceConnected(componentName0, iBinder0);
            }
            this.b = 1;
        }
    }

    @Override  // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName0) {
        synchronized(this.g.e) {
            this.g.g.removeMessages(1, this.e);
            this.d = null;
            this.f = componentName0;
            for(Object object0: this.a.values()) {
                ((ServiceConnection)object0).onServiceDisconnected(componentName0);
            }
            this.b = 2;
        }
    }
}

