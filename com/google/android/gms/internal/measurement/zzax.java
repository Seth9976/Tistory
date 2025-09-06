package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;

public final class zzax {
    public final HashMap a;
    public final zzbj b;

    public zzax() {
        this.a = new HashMap();
        this.b = new zzbj();
        this.a(new zzav());
        this.a(new zzay());
        this.a(new zzaz());
        this.a(new zzbc());
        this.a(new zzbh());
        this.a(new zzbi());
        this.a(new zzbk());
    }

    public final void a(zzaw zzaw0) {
        for(Object object0: zzaw0.a) {
            String s = ((zzbl)object0).zzb().toString();
            this.a.put(s, zzaw0);
        }
    }

    public final zzap zza(zzg zzg0, zzap zzap0) {
        zzh.zzc(zzg0);
        if(zzap0 instanceof zzaq) {
            ArrayList arrayList0 = ((zzaq)zzap0).zzc();
            String s = ((zzaq)zzap0).zzb();
            return this.a.containsKey(s) ? ((zzaw)this.a.get(s)).zza(s, zzg0, arrayList0) : this.b.zza(s, zzg0, arrayList0);
        }
        return zzap0;
    }
}

