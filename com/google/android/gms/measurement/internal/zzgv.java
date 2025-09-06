package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

public final class zzgv implements Runnable {
    public final zzhx zza;
    public final Bundle zzb;
    public final long zzc;

    public zzgv(zzhx zzhx0, Bundle bundle0, long v) {
        this.zza = zzhx0;
        this.zzb = bundle0;
        this.zzc = v;
    }

    @Override
    public final void run() {
        zzhx zzhx0 = this.zza;
        Bundle bundle0 = this.zzb;
        long v = this.zzc;
        if(TextUtils.isEmpty(zzhx0.zzt.zzh().zzm())) {
            zzhx0.zzR(bundle0, 0, v);
            return;
        }
        zzhx0.zzt.zzay().zzl().zza("Using developer consent only; google app id found");
    }
}

