package com.google.android.gms.measurement.internal;

import androidx.annotation.WorkerThread;

public abstract class p extends j {
    public boolean a;

    public p(zzfr zzfr0) {
        super(zzfr0);
        ++this.zzt.C;
    }

    public final void zza() {
        if(!this.a) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void zzb() {
        if(this.a) {
            throw new IllegalStateException("Can\'t initialize twice");
        }
        if(!this.zzf()) {
            this.zzt.D.incrementAndGet();
            this.a = true;
        }
    }

    public final void zzc() {
        if(this.a) {
            throw new IllegalStateException("Can\'t initialize twice");
        }
        this.zzd();
        this.zzt.D.incrementAndGet();
        this.a = true;
    }

    @WorkerThread
    public void zzd() {
    }

    public abstract boolean zzf();
}

