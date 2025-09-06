package com.google.android.gms.cloudmessaging;

import android.os.Bundle;
import android.os.Handler.Callback;
import android.os.Message;
import android.util.Log;

public final class zzf implements Handler.Callback {
    public final b zza;

    public zzf(b b0) {
        this.zza = b0;
    }

    @Override  // android.os.Handler$Callback
    public final boolean handleMessage(Message message0) {
        d d0;
        b b0 = this.zza;
        int v = message0.arg1;
        if(Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Received response to request: " + v);
        }
        synchronized(b0) {
            d0 = (d)b0.e.get(v);
            if(d0 == null) {
                Log.w("MessengerIpcClient", "Received response for unknown request: " + v);
                return true;
            }
            b0.e.remove(v);
            b0.c();
        }
        Bundle bundle0 = message0.getData();
        if(bundle0.getBoolean("unsupported", false)) {
            d0.c(new zzq("Not supported by GmsCore", null));  // 初始化器: Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
            return true;
        }
        d0.a(bundle0);
        return true;
    }
}

