package com.google.android.gms.internal.measurement;

import androidx.room.a;
import java.util.List;

public final class zzbi extends zzaw {
    public zzbi() {
        this.a.add(zzbl.zza);
        this.a.add(zzbl.zzv);
        this.a.add(zzbl.zzS);
        this.a.add(zzbl.zzT);
        this.a.add(zzbl.zzU);
        this.a.add(zzbl.zzaa);
        this.a.add(zzbl.zzab);
        this.a.add(zzbl.zzad);
        this.a.add(zzbl.zzae);
        this.a.add(zzbl.zzah);
    }

    @Override  // com.google.android.gms.internal.measurement.zzaw
    public final zzap zza(String s, zzg zzg0, List list0) {
        switch(zzh.zze(s).ordinal()) {
            case 0: {
                zzap zzap0 = zzg0.zzb(((zzap)a.f(zzbl.zza, 2, list0, 0)));
                zzap zzap1 = zzg0.zzb(((zzap)list0.get(1)));
                if(!(zzap0 instanceof zzal) && !(zzap0 instanceof zzat) && !(zzap1 instanceof zzal) && !(zzap1 instanceof zzat)) {
                    double f = (double)zzap0.zzh();
                    return new zzah(((double)(((double)zzap1.zzh()) + f)));
                }
                return new zzat(zzap0.zzi() + zzap1.zzi());
            }
            case 21: {
                return new zzah(((double)(((double)zzg0.zzb(((zzap)a.f(zzbl.zzv, 2, list0, 0))).zzh()) / ((double)zzg0.zzb(((zzap)list0.get(1))).zzh()))));
            }
            case 44: {
                return new zzah(((double)(((double)zzg0.zzb(((zzap)a.f(zzbl.zzS, 2, list0, 0))).zzh()) % ((double)zzg0.zzb(((zzap)list0.get(1))).zzh()))));
            }
            case 45: {
                return new zzah(((double)(((double)zzg0.zzb(((zzap)a.f(zzbl.zzT, 2, list0, 0))).zzh()) * ((double)zzg0.zzb(((zzap)list0.get(1))).zzh()))));
            }
            case 46: {
                return new zzah(((double)(-((double)zzg0.zzb(((zzap)a.f(zzbl.zzU, 1, list0, 0))).zzh()))));
            }
            case 52: 
            case 53: {
                zzh.zzh(s, 2, list0);
                zzap zzap2 = zzg0.zzb(((zzap)list0.get(0)));
                zzg0.zzb(((zzap)list0.get(1)));
                return zzap2;
            }
            case 55: 
            case 56: {
                zzh.zzh(s, 1, list0);
                return zzg0.zzb(((zzap)list0.get(0)));
            }
            case 59: {
                zzap zzap3 = zzg0.zzb(((zzap)a.f(zzbl.zzah, 2, list0, 0)));
                zzah zzah0 = new zzah(((double)(-((double)zzg0.zzb(((zzap)list0.get(1))).zzh()))));
                double f1 = (double)zzap3.zzh();
                return new zzah(((double)(((double)zzah0.zzh()) + f1)));
            }
            default: {
                this.a(s);
                throw null;
            }
        }
    }
}

