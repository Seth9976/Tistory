package com.google.android.gms.internal.measurement;

public abstract class v implements Runnable {
    public final long a;
    public final long b;
    public final boolean c;
    public final zzef d;

    public v(zzef zzef0, boolean z) {
        this.d = zzef0;
        this.a = zzef0.zza.currentTimeMillis();
        this.b = zzef0.zza.elapsedRealtime();
        this.c = z;
    }

    public abstract void a();

    public void b() {
    }

    @Override
    public final void run() {
        zzef zzef0 = this.d;
        if(zzef0.e) {
            this.b();
            return;
        }
        try {
            this.a();
        }
        catch(Exception exception0) {
            zzef0.a(exception0, false, this.c);
            this.b();
        }
    }
}

