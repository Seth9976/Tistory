package com.google.android.gms.measurement.internal;

public final class m0 implements Runnable {
    public final boolean a;
    public final zzhx b;

    public m0(zzhx zzhx0, boolean z) {
        this.b = zzhx0;
        this.a = z;
    }

    @Override
    public final void run() {
        boolean z = this.b.zzt.zzJ();
        boolean z1 = this.b.zzt.zzI();
        this.b.zzt.A = Boolean.valueOf(this.a);
        if(z1 == this.a) {
            this.b.zzt.zzay().zzj().zzb("Default data collection state already set to", Boolean.valueOf(this.a));
        }
        if(this.b.zzt.zzJ() == z || this.b.zzt.zzJ() != this.b.zzt.zzI()) {
            this.b.zzt.zzay().zzl().zzc("Default data collection is different than actual status", Boolean.valueOf(this.a), Boolean.valueOf(z));
        }
        this.b.g();
    }
}

