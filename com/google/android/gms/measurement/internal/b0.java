package com.google.android.gms.measurement.internal;

public abstract class b0 extends a0 {
    public boolean a;

    public b0(zzfr zzfr0) {
        super(zzfr0);
        ++this.zzt.C;
    }

    public void zzaA() {
    }

    public abstract boolean zzf();

    public final void zzu() {
        if(!this.a) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void zzv() {
        if(this.a) {
            throw new IllegalStateException("Can\'t initialize twice");
        }
        if(!this.zzf()) {
            this.zzt.D.incrementAndGet();
            this.a = true;
        }
    }

    public final void zzw() {
        if(this.a) {
            throw new IllegalStateException("Can\'t initialize twice");
        }
        this.zzaA();
        this.zzt.D.incrementAndGet();
        this.a = true;
    }
}

