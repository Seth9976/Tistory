package com.google.android.gms.cloudmessaging;

public final class zzi implements Runnable {
    public final b zza;

    public zzi(b b0) {
        this.zza = b0;
    }

    @Override
    public final void run() {
        b b0 = this.zza;
        synchronized(b0) {
            if(b0.a == 1) {
                b0.a(1, "Timed out while binding");
            }
        }
    }
}

