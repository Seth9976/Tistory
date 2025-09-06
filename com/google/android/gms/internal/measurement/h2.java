package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class h2 extends zzai {
    public final boolean a;
    public final boolean b;
    public final zzt c;

    public h2(zzt zzt0, boolean z, boolean z1) {
        this.c = zzt0;
        super("log");
        this.a = z;
        this.b = z1;
    }

    @Override  // com.google.android.gms.internal.measurement.zzai
    public final zzap zza(zzg zzg0, List list0) {
        int v2;
        zzh.zzi("log", 1, list0);
        zzt zzt0 = this.c;
        if(list0.size() == 1) {
            String s = zzg0.zzb(((zzap)list0.get(0))).zzi();
            List list1 = Collections.emptyList();
            zzt0.a.zza(3, s, list1, this.a, this.b);
            return zzap.zzf;
        }
        int v = zzh.zzb(((double)zzg0.zzb(((zzap)list0.get(0))).zzh()));
        if(v == 2) {
            v2 = 4;
        }
        else {
            switch(v) {
                case 3: {
                    v2 = 1;
                    break;
                }
                case 5: {
                    v2 = 5;
                    break;
                }
                default: {
                    v2 = v == 6 ? 2 : 3;
                }
            }
        }
        String s1 = zzg0.zzb(((zzap)list0.get(1))).zzi();
        if(list0.size() == 2) {
            List list2 = Collections.emptyList();
            zzt0.a.zza(v2, s1, list2, this.a, this.b);
            return zzap.zzf;
        }
        ArrayList arrayList0 = new ArrayList();
        for(int v1 = 2; v1 < Math.min(list0.size(), 5); ++v1) {
            arrayList0.add(zzg0.zzb(((zzap)list0.get(v1))).zzi());
        }
        zzt0.a.zza(v2, s1, arrayList0, this.a, this.b);
        return zzap.zzf;
    }
}

