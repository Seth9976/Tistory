package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;

public final class zzw extends zzai {
    public final zzj a;
    public final HashMap b;

    public zzw(zzj zzj0) {
        super("require");
        this.b = new HashMap();
        this.a = zzj0;
    }

    @Override  // com.google.android.gms.internal.measurement.zzai
    public final zzap zza(zzg zzg0, List list0) {
        zzap zzap0;
        zzh.zzh("require", 1, list0);
        String s = zzg0.zzb(((zzap)list0.get(0))).zzi();
        HashMap hashMap0 = this.b;
        if(hashMap0.containsKey(s)) {
            return (zzap)hashMap0.get(s);
        }
        zzj zzj0 = this.a;
        if(zzj0.a.containsKey(s)) {
            Callable callable0 = (Callable)zzj0.a.get(s);
            try {
                zzap0 = (zzap)callable0.call();
            }
            catch(Exception unused_ex) {
                throw new IllegalStateException("Failed to create API implementation: " + s);
            }
        }
        else {
            zzap0 = zzap.zzf;
        }
        if(zzap0 instanceof zzai) {
            hashMap0.put(s, ((zzai)zzap0));
        }
        return zzap0;
    }
}

