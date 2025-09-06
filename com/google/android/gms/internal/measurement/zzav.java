package com.google.android.gms.internal.measurement;

import androidx.room.a;
import java.util.List;

public final class zzav extends zzaw {
    public zzav() {
        this.a.add(zzbl.zze);
        this.a.add(zzbl.zzf);
        this.a.add(zzbl.zzg);
        this.a.add(zzbl.zzh);
        this.a.add(zzbl.zzi);
        this.a.add(zzbl.zzj);
        this.a.add(zzbl.zzk);
    }

    @Override  // com.google.android.gms.internal.measurement.zzaw
    public final zzap zza(String s, zzg zzg0, List list0) {
        switch(zzh.zze(s).ordinal()) {
            case 4: {
                return new zzah(((double)(zzh.zzb(((double)zzg0.zzb(((zzap)a.f(zzbl.zze, 2, list0, 0))).zzh())) & zzh.zzb(((double)zzg0.zzb(((zzap)list0.get(1))).zzh())))));
            }
            case 5: {
                return new zzah(((double)(zzh.zzb(((double)zzg0.zzb(((zzap)a.f(zzbl.zzf, 2, list0, 0))).zzh())) << ((int)(zzh.zzd(((double)zzg0.zzb(((zzap)list0.get(1))).zzh())) & 0x1FL)))));
            }
            case 6: {
                return new zzah(((double)(~zzh.zzb(((double)zzg0.zzb(((zzap)a.f(zzbl.zzg, 1, list0, 0))).zzh())))));
            }
            case 7: {
                return new zzah(((double)(zzh.zzb(((double)zzg0.zzb(((zzap)a.f(zzbl.zzh, 2, list0, 0))).zzh())) | zzh.zzb(((double)zzg0.zzb(((zzap)list0.get(1))).zzh())))));
            }
            case 8: {
                return new zzah(((double)(zzh.zzb(((double)zzg0.zzb(((zzap)a.f(zzbl.zzi, 2, list0, 0))).zzh())) >> ((int)(zzh.zzd(((double)zzg0.zzb(((zzap)list0.get(1))).zzh())) & 0x1FL)))));
            }
            case 9: {
                return new zzah(((double)(zzh.zzd(((double)zzg0.zzb(((zzap)a.f(zzbl.zzj, 2, list0, 0))).zzh())) >>> ((int)(zzh.zzd(((double)zzg0.zzb(((zzap)list0.get(1))).zzh())) & 0x1FL)))));
            }
            case 10: {
                return new zzah(((double)(zzh.zzb(((double)zzg0.zzb(((zzap)a.f(zzbl.zzk, 2, list0, 0))).zzh())) ^ zzh.zzb(((double)zzg0.zzb(((zzap)list0.get(1))).zzh())))));
            }
            default: {
                this.a(s);
                throw null;
            }
        }
    }
}

