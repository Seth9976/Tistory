package com.google.android.gms.cloudmessaging;

import android.util.Log;

public final class zzk implements Runnable {
    public final b zza;
    public final d zzb;

    public zzk(b b0, d d0) {
        this.zza = b0;
        this.zzb = d0;
    }

    @Override
    public final void run() {
        b b0 = this.zza;
        int v = this.zzb.a;
        synchronized(b0) {
            d d0 = (d)b0.e.get(v);
            if(d0 != null) {
                Log.w("MessengerIpcClient", "Timing out request: " + v);
                b0.e.remove(v);
                d0.c(new zzq("Timed out waiting for response", null));  // 初始化器: Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
                b0.c();
            }
        }
    }
}

