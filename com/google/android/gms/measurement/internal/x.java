package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

public final class x implements Runnable {
    public final int a;
    public final zzq b;
    public final zzgj c;

    public x(zzgj zzgj0, zzq zzq0, int v) {
        this.a = v;
        this.c = zzgj0;
        this.b = zzq0;
        super();
    }

    @Override
    public final void run() {
        switch(this.a) {
            case 0: {
                this.c.a.a();
                this.c.a.l(this.b);
                return;
            }
            case 1: {
                this.c.a.a();
                this.c.a.zzaz().zzg();
                this.c.a.b();
                Preconditions.checkNotEmpty(this.b.zza);
                this.c.a.E(this.b);
                return;
            }
            case 2: {
                this.c.a.a();
                zzkt zzkt0 = this.c.a;
                zzkt0.zzaz().zzg();
                zzkt0.b();
                zzq zzq0 = this.b;
                Preconditions.checkNotEmpty(zzq0.zza);
                zzai zzai0 = zzai.zzb(zzq0.zzv);
                zzai zzai1 = zzkt0.F(zzq0.zza);
                zzkt0.zzay().zzj().zzc("Setting consent, package, consent", zzq0.zza, zzai0);
                zzkt0.n(zzq0.zza, zzai0);
                if(zzai0.zzk(zzai1)) {
                    zzkt0.l(zzq0);
                }
                return;
            }
            default: {
                this.c.a.a();
                this.c.a.i(this.b);
            }
        }
    }
}

