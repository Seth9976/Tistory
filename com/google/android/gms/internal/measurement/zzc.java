package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.Callable;

public final class zzc {
    public final zzf a;
    public zzg b;
    public final zzab c;
    public final zzz d;

    public zzc() {
        zzf zzf0 = new zzf();
        super();
        this.a = zzf0;
        this.b = zzf0.b.zza();
        this.c = new zzab();
        this.d = new zzz();
        zza zza0 = new zza(this);
        zzf0.d.zza("internal.registerCallback", zza0);
        zzb zzb0 = new zzb(this);
        zzf0.d.zza("internal.eventLogger", zzb0);
    }

    public final zzab zza() {
        return this.c;
    }

    public final void zzc(zzgt zzgt0) throws zzd {
        zzai zzai0;
        try {
            zzf zzf0 = this.a;
            this.b = zzf0.b.zza();
            if(zzf0.zza(this.b, ((zzgy[])zzgt0.zzc().toArray(new zzgy[0]))) instanceof zzag) {
                throw new IllegalStateException("Program loading failed");
            }
            Iterator iterator0 = zzgt0.zza().zzd().iterator();
            while(true) {
                if(!iterator0.hasNext()) {
                    return;
                }
                Object object0 = iterator0.next();
                for(Object object1: ((zzgr)object0).zzc()) {
                    zzap zzap0 = zzf0.zza(this.b, new zzgy[]{((zzgy)object1)});
                    if(!(zzap0 instanceof zzam)) {
                        throw new IllegalArgumentException("Invalid rule definition");
                    }
                    zzg zzg0 = this.b;
                    if(zzg0.zzh("")) {
                        zzap zzap1 = zzg0.zzd("");
                        if(!(zzap1 instanceof zzai)) {
                            throw new IllegalStateException("Invalid function name: ");
                        }
                        zzai0 = (zzai)zzap1;
                    }
                    else {
                        zzai0 = null;
                    }
                    if(zzai0 == null) {
                        throw new IllegalStateException("Rule function is undefined: ");
                    }
                    zzai0.zza(this.b, Collections.singletonList(zzap0));
                }
            }
        }
        catch(Throwable throwable0) {
        }
        throw new zzd(throwable0);
    }

    public final void zzd(String s, Callable callable0) {
        this.a.d.zza(s, callable0);
    }

    public final boolean zze(zzaa zzaa0) throws zzd {
        try {
            this.c.zzd(zzaa0);
            zzah zzah0 = new zzah(0.0);
            this.a.c.zzg("runtime.counter", zzah0);
            zzg zzg0 = this.b.zza();
            this.d.zzb(zzg0, this.c);
            return !this.zzg() && !this.zzf() ? false : true;
        }
        catch(Throwable throwable0) {
            throw new zzd(throwable0);
        }
    }

    public final boolean zzf() {
        return !this.c.zzc().isEmpty();
    }

    public final boolean zzg() {
        return !this.c.zzb().equals(this.c.zza());
    }
}

