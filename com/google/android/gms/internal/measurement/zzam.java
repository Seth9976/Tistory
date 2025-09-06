package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

public class zzam implements zzal, zzap {
    public final HashMap a;

    public zzam() {
        this.a = new HashMap();
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof zzam ? this.a.equals(((zzam)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() [...] // 潜在的解密器

    public final List zzb() {
        return new ArrayList(this.a.keySet());
    }

    @Override  // com.google.android.gms.internal.measurement.zzap
    public zzap zzbR(String s, zzg zzg0, List list0) {
        return "toString".equals(s) ? new zzat("{}") : zzaj.zza(this, new zzat(s), zzg0, list0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzap
    public final zzap zzd() {
        zzap zzap0 = new zzam();
        for(Object object0: this.a.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            Object object1 = map$Entry0.getValue();
            HashMap hashMap0 = zzap0.a;
            if(object1 instanceof zzal) {
                hashMap0.put(((String)map$Entry0.getKey()), ((zzap)map$Entry0.getValue()));
            }
            else {
                hashMap0.put(((String)map$Entry0.getKey()), ((zzap)map$Entry0.getValue()).zzd());
            }
        }
        return zzap0;
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.internal.measurement.zzal
    public final zzap zzf(String s) {
        return this.a.containsKey(s) ? ((zzap)this.a.get(s)) : zzap.zzf;
    }

    @Override  // com.google.android.gms.internal.measurement.zzap
    public final Boolean zzg() {
        return true;
    }

    @Override  // com.google.android.gms.internal.measurement.zzap
    public final Double zzh() {
        return NaN;
    }

    @Override  // com.google.android.gms.internal.measurement.zzap
    public final String zzi() {
        return "[object Object]";
    }

    @Override  // com.google.android.gms.internal.measurement.zzap
    public final Iterator zzl() {
        return zzaj.zzb(this.a);
    }

    @Override  // com.google.android.gms.internal.measurement.zzal
    public final void zzr(String s, zzap zzap0) {
        HashMap hashMap0 = this.a;
        if(zzap0 == null) {
            hashMap0.remove(s);
            return;
        }
        hashMap0.put(s, zzap0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzal
    public final boolean zzt(String s) {
        return this.a.containsKey(s);
    }
}

