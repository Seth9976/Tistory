package com.google.android.gms.cloudmessaging;

import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.TimeUnit;

public final class zzh implements Runnable {
    public final b zza;

    public zzh(b b0) {
        this.zza = b0;
    }

    @Override
    public final void run() {
        d d0;
        b b0 = this.zza;
        while(true) {
            synchronized(b0) {
                if(b0.a != 2) {
                    return;
                }
                if(b0.d.isEmpty()) {
                    b0.c();
                    return;
                }
                d0 = (d)b0.d.poll();
                b0.e.put(d0.a, d0);
                zzk zzk0 = new zzk(b0, d0);
                b0.f.b.schedule(zzk0, 30L, TimeUnit.SECONDS);
            }
            if(Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Sending " + d0);
            }
            Message message0 = Message.obtain();
            message0.what = d0.c;
            message0.arg1 = d0.a;
            message0.replyTo = b0.b;
            Bundle bundle0 = new Bundle();
            bundle0.putBoolean("oneWay", d0.b());
            bundle0.putString("pkg", "net.daum.android.tistoryapp");
            bundle0.putBundle("data", d0.d);
            message0.setData(bundle0);
            try {
                a7.b b1 = b0.c;
                Messenger messenger0 = (Messenger)b1.b;
                if(messenger0 == null) {
                    zzd zzd0 = (zzd)b1.c;
                    if(zzd0 == null) {
                        throw new IllegalStateException("Both messengers are null");
                    }
                    zzd0.zzb(message0);
                    continue;
                }
                messenger0.send(message0);
            }
            catch(RemoteException remoteException0) {
                b0.a(2, remoteException0.getMessage());
            }
        }
    }
}

