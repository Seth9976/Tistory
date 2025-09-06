package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Iterator;

public final class zzg {
    public final zzax a;
    public final HashMap b;
    public final HashMap c;
    public final zzg zza;

    public zzg(zzg zzg0, zzax zzax0) {
        this.b = new HashMap();
        this.c = new HashMap();
        this.zza = zzg0;
        this.a = zzax0;
    }

    public final zzg zza() {
        return new zzg(this, this.a);
    }

    public final zzap zzb(zzap zzap0) {
        return this.a.zza(this, zzap0);
    }

    public final zzap zzc(zzae zzae0) {
        zzap zzap0 = zzap.zzf;
        Iterator iterator0 = zzae0.zzk();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            zzap zzap1 = zzae0.zze(((int)(((Integer)object0))));
            zzap0 = this.a.zza(this, zzap1);
            if(zzap0 instanceof zzag) {
                break;
            }
        }
        return zzap0;
    }

    public final zzap zzd(String s) {
        HashMap hashMap0 = this.b;
        if(hashMap0.containsKey(s)) {
            return (zzap)hashMap0.get(s);
        }
        zzg zzg0 = this.zza;
        if(zzg0 == null) {
            throw new IllegalArgumentException(s + " is not defined");
        }
        return zzg0.zzd(s);
    }

    public final void zze(String s, zzap zzap0) {
        if(this.c.containsKey(s)) {
            return;
        }
        HashMap hashMap0 = this.b;
        if(zzap0 == null) {
            hashMap0.remove(s);
            return;
        }
        hashMap0.put(s, zzap0);
    }

    public final void zzf(String s, zzap zzap0) {
        this.zze(s, zzap0);
        this.c.put(s, Boolean.TRUE);
    }

    public final void zzg(String s, zzap zzap0) {
        HashMap hashMap0 = this.b;
        if(!hashMap0.containsKey(s) && (this.zza != null && this.zza.zzh(s))) {
            this.zza.zzg(s, zzap0);
            return;
        }
        if(this.c.containsKey(s)) {
            return;
        }
        if(zzap0 == null) {
            hashMap0.remove(s);
            return;
        }
        hashMap0.put(s, zzap0);
    }

    public final boolean zzh(String s) {
        if(this.b.containsKey(s)) {
            return true;
        }
        return this.zza == null ? false : this.zza.zzh(s);
    }
}

