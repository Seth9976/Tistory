package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class zzab {
    public zzaa a;
    public zzaa b;
    public final ArrayList c;

    public zzab() {
        this.a = new zzaa("", 0L, null);
        this.b = new zzaa("", 0L, null);
        this.c = new ArrayList();
    }

    public zzab(zzaa zzaa0) {
        this.a = zzaa0;
        this.b = zzaa0.zzb();
        this.c = new ArrayList();
    }

    @Override
    public final Object clone() throws CloneNotSupportedException {
        zzab zzab0 = new zzab(this.a.zzb());
        for(Object object0: this.c) {
            zzaa zzaa0 = ((zzaa)object0).zzb();
            zzab0.c.add(zzaa0);
        }
        return zzab0;
    }

    public final zzaa zza() {
        return this.a;
    }

    public final zzaa zzb() {
        return this.b;
    }

    public final List zzc() {
        return this.c;
    }

    public final void zzd(zzaa zzaa0) {
        this.a = zzaa0;
        this.b = zzaa0.zzb();
        this.c.clear();
    }

    public final void zze(String s, long v, Map map0) {
        zzaa zzaa0 = new zzaa(s, v, map0);
        this.c.add(zzaa0);
    }

    public final void zzf(zzaa zzaa0) {
        this.b = zzaa0;
    }
}

