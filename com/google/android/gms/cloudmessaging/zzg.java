package com.google.android.gms.cloudmessaging;

public final class zzg implements Runnable {
    public final b zza;

    public zzg(b b0) {
        this.zza = b0;
    }

    @Override
    public final void run() {
        this.zza.a(2, "Service disconnected");
    }
}

