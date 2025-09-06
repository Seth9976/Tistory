package com.google.android.gms.measurement.internal;

import java.util.HashMap;
import java.util.concurrent.Callable;

public final class zzfb implements Callable {
    public final zzfi zza;
    public final String zzb;

    public zzfb(zzfi zzfi0, String s) {
        this.zza = zzfi0;
        this.zzb = s;
    }

    @Override
    public final Object call() {
        c0 c00 = this.zza.zzf.zzi().p(this.zzb);
        HashMap hashMap0 = new HashMap();
        hashMap0.put("platform", "android");
        hashMap0.put("package_name", this.zzb);
        this.zza.zzt.zzf().zzh();
        hashMap0.put("gmp_version", 74029L);
        if(c00 != null) {
            String s = c00.y();
            if(s != null) {
                hashMap0.put("app_version", s);
            }
            hashMap0.put("app_version_int", c00.t());
            c00.a.zzaz().zzg();
            hashMap0.put("dynamite_version", c00.s);
        }
        return hashMap0;
    }
}

