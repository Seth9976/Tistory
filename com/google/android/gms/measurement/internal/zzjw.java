package com.google.android.gms.measurement.internal;

import android.os.Bundle;

public final class zzjw implements Runnable {
    public final f1 zza;

    public zzjw(f1 f10) {
        this.zza = f10;
    }

    @Override
    public final void run() {
        f1 f10 = this.zza;
        f10.c.b.zzg();
        zzkc zzkc0 = f10.c.b;
        zzkc0.zzt.zzay().zzc().zza("Application going to the background");
        zzkc0.zzt.zzm().p.zza(true);
        Bundle bundle0 = new Bundle();
        if(!zzkc0.zzt.zzf().zzu()) {
            zzkc0.zzb.c.a();
            zzkc0.zzb.a(f10.b, false, false);
        }
        zzkc0.zzt.zzq().b("auto", "_ab", bundle0, f10.a);
    }
}

