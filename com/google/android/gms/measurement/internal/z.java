package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Callable;

public final class z implements Callable {
    public final int a;
    public final Object b;
    public final Object c;

    public z(int v, Object object0, Object object1) {
        this.a = v;
        this.c = object0;
        this.b = object1;
        super();
    }

    @Override
    public final Object call() {
        if(this.a != 0) {
            zzq zzq0 = (zzq)this.b;
            String s = (String)Preconditions.checkNotNull(zzq0.zza);
            zzkt zzkt0 = (zzkt)this.c;
            if(zzkt0.F(s).zzi(zzah.zzb) && zzai.zzb(zzq0.zzv).zzi(zzah.zzb)) {
                return zzkt0.E(zzq0).x();
            }
            zzkt0.zzay().zzj().zza("Analytics storage consent denied. Returning null app instance id");
            return null;
        }
        ((zzgj)this.c).a.a();
        return ((zzgj)this.c).a.zzi().x(((String)this.b));
    }
}

