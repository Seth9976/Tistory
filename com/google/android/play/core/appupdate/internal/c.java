package com.google.android.play.core.appupdate.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

public final class c implements ServiceConnection {
    public final zzx a;

    public c(zzx zzx0) {
        this.a = zzx0;
    }

    @Override  // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName0, IBinder iBinder0) {
        this.a.b.zzd("ServiceConnectionImpl.onServiceConnected(%s)", new Object[]{componentName0});
        b b0 = new b(this, iBinder0);
        this.a.zzc().post(b0);
    }

    @Override  // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName0) {
        this.a.b.zzd("ServiceConnectionImpl.onServiceDisconnected(%s)", new Object[]{componentName0});
        a a0 = new a(this, 1);
        this.a.zzc().post(a0);
    }
}

