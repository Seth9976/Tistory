package com.google.android.play.core.appupdate.internal;

import android.os.IBinder;
import android.os.RemoteException;

public final class b extends zzn {
    public final IBinder b;
    public final c c;

    public b(c c0, IBinder iBinder0) {
        this.c = c0;
        this.b = iBinder0;
        super();
    }

    @Override  // com.google.android.play.core.appupdate.internal.zzn
    public final void zza() {
        this.c.a.m = zze.zzb(this.b);
        zzx zzx0 = this.c.a;
        zzx0.b.zzd("linkToDeath", new Object[0]);
        try {
            zzx0.m.asBinder().linkToDeath(zzx0.j, 0);
        }
        catch(RemoteException remoteException0) {
            zzx0.b.zzc(remoteException0, "linkToDeath failed", new Object[0]);
        }
        zzx0.g = false;
        for(Object object0: zzx0.d) {
            ((Runnable)object0).run();
        }
        zzx0.d.clear();
    }
}

