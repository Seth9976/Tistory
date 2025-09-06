package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzft;
import com.google.android.gms.internal.measurement.zzgd;
import java.util.ArrayList;

public final class p1 {
    public zzgd a;
    public ArrayList b;
    public ArrayList c;
    public long d;
    public final zzkt e;

    public p1(zzkt zzkt0) {
        this.e = zzkt0;
    }

    public final boolean a(long v, zzft zzft0) {
        Preconditions.checkNotNull(zzft0);
        if(this.c == null) {
            this.c = new ArrayList();
        }
        if(this.b == null) {
            this.b = new ArrayList();
        }
        if(!this.c.isEmpty() && ((zzft)this.c.get(0)).zzd() / 1000L / 60L / 60L != zzft0.zzd() / 1000L / 60L / 60L) {
            return false;
        }
        long v1 = this.d + ((long)zzft0.zzbw());
        zzkt zzkt0 = this.e;
        zzkt0.zzg();
        if(v1 >= ((long)Math.max(0, ((int)(((Integer)zzdu.zzh.zza(null))))))) {
            return false;
        }
        this.d = v1;
        this.c.add(zzft0);
        this.b.add(v);
        int v2 = this.c.size();
        zzkt0.zzg();
        return v2 < Math.max(1, ((int)(((Integer)zzdu.zzi.zza(null)))));
    }
}

