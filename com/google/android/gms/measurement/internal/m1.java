package com.google.android.gms.measurement.internal;

public abstract class m1 extends l1 {
    public boolean a;

    public m1(zzkt zzkt0) {
        super(zzkt0);
        ++this.zzf.q;
    }

    public final void zzW() {
        if(!this.a) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void zzX() {
        if(this.a) {
            throw new IllegalStateException("Can\'t initialize twice");
        }
        this.zzb();
        ++this.zzf.r;
        this.a = true;
    }

    public abstract boolean zzb();
}

