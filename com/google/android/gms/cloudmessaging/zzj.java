package com.google.android.gms.cloudmessaging;

import android.os.IBinder;
import android.os.RemoteException;

public final class zzj implements Runnable {
    public final b zza;
    public final IBinder zzb;

    public zzj(b b0, IBinder iBinder0) {
        this.zza = b0;
        this.zzb = iBinder0;
    }

    @Override
    public final void run() {
        b b0 = this.zza;
        IBinder iBinder0 = this.zzb;
        synchronized(b0) {
            if(iBinder0 == null) {
                b0.a(0, "Null service connection");
                return;
            }
            try {
                b0.c = new a7.b(iBinder0);
            }
            catch(RemoteException remoteException0) {
                b0.a(0, remoteException0.getMessage());
                return;
            }
            b0.a = 2;
            zzh zzh0 = new zzh(b0);
            b0.f.b.execute(zzh0);
        }
    }
}

