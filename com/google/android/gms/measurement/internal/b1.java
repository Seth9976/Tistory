package com.google.android.gms.measurement.internal;

public final class b1 implements Runnable {
    public final int a;
    public final zzdx b;
    public final zzjl c;

    public b1(zzjl zzjl0, zzdx zzdx0, int v) {
        this.a = v;
        this.c = zzjl0;
        this.b = zzdx0;
        super();
    }

    @Override
    public final void run() {
        if(this.a != 0) {
            zzjl zzjl0 = this.c;
            synchronized(zzjl0) {
                this.c.a = false;
                if(!this.c.c.zzL()) {
                    this.c.c.zzt.zzay().zzc().zza("Connected to remote service");
                    this.c.c.zzJ(this.b);
                }
            }
            return;
        }
        synchronized(this.c) {
            this.c.a = false;
            if(!this.c.c.zzL()) {
                this.c.c.zzt.zzay().zzj().zza("Connected to service");
                this.c.c.zzJ(this.b);
            }
        }
    }
}

