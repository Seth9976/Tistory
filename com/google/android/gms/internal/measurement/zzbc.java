package com.google.android.gms.internal.measurement;

import androidx.room.a;
import java.util.List;

public final class zzbc extends zzaw {
    public zzbc() {
        this.a.add(zzbl.zzb);
        this.a.add(zzbl.zzV);
        this.a.add(zzbl.zzY);
    }

    @Override  // com.google.android.gms.internal.measurement.zzaw
    public final zzap zza(String s, zzg zzg0, List list0) {
        switch(zzh.zze(s).ordinal()) {
            case 1: {
                zzap zzap0 = zzg0.zzb(((zzap)a.f(zzbl.zzb, 2, list0, 0)));
                return zzap0.zzg().booleanValue() ? zzg0.zzb(((zzap)list0.get(1))) : zzap0;
            }
            case 0x2F: {
                return new zzaf(Boolean.valueOf(!zzg0.zzb(((zzap)a.f(zzbl.zzV, 1, list0, 0))).zzg().booleanValue()));
            }
            case 50: {
                zzap zzap1 = zzg0.zzb(((zzap)a.f(zzbl.zzY, 2, list0, 0)));
                return zzap1.zzg().booleanValue() ? zzap1 : zzg0.zzb(((zzap)list0.get(1)));
            }
            default: {
                this.a(s);
                throw null;
            }
        }
    }
}

