package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.Map;

public final class zzl extends zzam {
    public final zzab b;

    public zzl(zzab zzab0) {
        this.b = zzab0;
    }

    @Override  // com.google.android.gms.internal.measurement.zzam
    public final zzap zzbR(String s, zzg zzg0, List list0) {
        int v;
        switch(s) {
            case "getEventName": {
                v = 0;
                break;
            }
            case "getParamValue": {
                v = 1;
                break;
            }
            case "getParams": {
                v = 2;
                break;
            }
            case "getTimestamp": {
                v = 3;
                break;
            }
            case "setEventName": {
                v = 4;
                break;
            }
            case "setParamValue": {
                v = 5;
                break;
            }
            default: {
                v = -1;
            }
        }
        zzab zzab0 = this.b;
        switch(v) {
            case 0: {
                zzh.zzh("getEventName", 0, list0);
                return new zzat(zzab0.zzb().zzd());
            }
            case 1: {
                zzh.zzh("getParamValue", 1, list0);
                return zzi.zzb(zzab0.zzb().zzc(zzg0.zzb(((zzap)list0.get(0))).zzi()));
            }
            case 2: {
                zzh.zzh("getParams", 0, list0);
                Map map0 = zzab0.zzb().zze();
                zzap zzap2 = new zzam();
                for(Object object0: map0.keySet()) {
                    ((zzam)zzap2).zzr(((String)object0), zzi.zzb(map0.get(((String)object0))));
                }
                return zzap2;
            }
            case 3: {
                zzh.zzh("getTimestamp", 0, list0);
                return new zzah(((double)zzab0.zzb().zza()));
            }
            case 4: {
                zzh.zzh("setEventName", 1, list0);
                zzap zzap1 = zzg0.zzb(((zzap)list0.get(0)));
                if(zzap.zzf.equals(zzap1) || zzap.zzg.equals(zzap1)) {
                    throw new IllegalArgumentException("Illegal event name");
                }
                zzab0.zzb().zzf(zzap1.zzi());
                return new zzat(zzap1.zzi());
            }
            default: {
                if(v != 5) {
                    return super.zzbR(s, zzg0, list0);
                }
                zzh.zzh("setParamValue", 2, list0);
                String s1 = zzg0.zzb(((zzap)list0.get(0))).zzi();
                zzap zzap0 = zzg0.zzb(((zzap)list0.get(1)));
                zzab0.zzb().zzg(s1, zzh.zzf(zzap0));
                return zzap0;
            }
        }
    }
}

