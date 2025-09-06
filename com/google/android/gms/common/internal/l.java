package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Looper;
import android.os.Message;
import com.bumptech.glide.load.resource.gif.d;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.internal.common.zzi;
import java.util.HashMap;
import java.util.concurrent.Executor;

public final class l extends GmsClientSupervisor {
    public final HashMap e;
    public final Context f;
    public volatile zzi g;
    public final d h;
    public final ConnectionTracker i;
    public final long j;
    public final long k;

    public l(Context context0, Looper looper0) {
        this.e = new HashMap();
        d d0 = new d(this, 1);
        this.h = d0;
        this.f = context0.getApplicationContext();
        this.g = new zzi(looper0, d0);
        this.i = ConnectionTracker.getInstance();
        this.j = 5000L;
        this.k = 300000L;
    }

    @Override  // com.google.android.gms.common.internal.GmsClientSupervisor
    public final void zza(zzn zzn0, ServiceConnection serviceConnection0, String s) {
        Preconditions.checkNotNull(serviceConnection0, "ServiceConnection must not be null");
        synchronized(this.e) {
            k k0 = (k)this.e.get(zzn0);
            if(k0 != null) {
                if(!k0.a.containsKey(serviceConnection0)) {
                    throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=" + zzn0.toString());
                }
                k0.a.remove(serviceConnection0);
                if(k0.a.isEmpty()) {
                    Message message0 = this.g.obtainMessage(0, zzn0);
                    this.g.sendMessageDelayed(message0, this.j);
                }
                return;
            }
        }
        throw new IllegalStateException("Nonexistent connection status for service config: " + zzn0.toString());
    }

    @Override  // com.google.android.gms.common.internal.GmsClientSupervisor
    public final boolean zzc(zzn zzn0, ServiceConnection serviceConnection0, String s, Executor executor0) {
        Preconditions.checkNotNull(serviceConnection0, "ServiceConnection must not be null");
        synchronized(this.e) {
            k k0 = (k)this.e.get(zzn0);
            if(k0 == null) {
                k0 = new k(this, zzn0);
                k0.a.put(serviceConnection0, serviceConnection0);
                k0.a(executor0, s);
                this.e.put(zzn0, k0);
                return k0.c;
            }
            this.g.removeMessages(0, zzn0);
            if(!k0.a.containsKey(serviceConnection0)) {
                k0.a.put(serviceConnection0, serviceConnection0);
                switch(k0.b) {
                    case 1: {
                        serviceConnection0.onServiceConnected(k0.f, k0.d);
                        break;
                    }
                    case 2: {
                        k0.a(executor0, s);
                    }
                }
                return k0.c;
            }
        }
        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=" + zzn0.toString());
    }
}

