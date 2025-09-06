package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.TreeMap;

public final class zzz {
    public final TreeMap a;
    public final TreeMap b;

    public zzz() {
        this.a = new TreeMap();
        this.b = new TreeMap();
    }

    public final void zza(String s, int v, zzao zzao0, String s1) {
        TreeMap treeMap0;
        if("create".equals(s1)) {
            treeMap0 = this.b;
        }
        else if("edit".equals(s1)) {
            treeMap0 = this.a;
        }
        else {
            throw new IllegalStateException("Unknown callback type: " + s1);
        }
        if(treeMap0.containsKey(v)) {
            v = ((int)(((Integer)treeMap0.lastKey()))) + 1;
        }
        treeMap0.put(v, zzao0);
    }

    public final void zzb(zzg zzg0, zzab zzab0) {
        zzl zzl0 = new zzl(zzab0);
        TreeMap treeMap0 = this.a;
        for(Object object0: treeMap0.keySet()) {
            zzaa zzaa0 = zzab0.zzb().zzb();
            zzap zzap0 = ((zzao)treeMap0.get(((Integer)object0))).zza(zzg0, Collections.singletonList(zzl0));
            int v = zzap0 instanceof zzah ? zzh.zzb(((double)zzap0.zzh())) : -1;
            if(v == -1 || v == 2) {
                zzab0.zzf(zzaa0);
            }
        }
        TreeMap treeMap1 = this.b;
        for(Object object1: treeMap1.keySet()) {
            zzap zzap1 = ((zzao)treeMap1.get(((Integer)object1))).zza(zzg0, Collections.singletonList(zzl0));
            if(zzap1 instanceof zzah) {
                zzap1.zzh().doubleValue();
            }
        }
    }
}

