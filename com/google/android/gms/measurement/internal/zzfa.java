package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.MainThread;
import com.google.android.gms.common.internal.Preconditions;

public final class zzfa {
    public final zzfa.zza a;

    public zzfa(zzfa.zza zzfa$zza0) {
        Preconditions.checkNotNull(zzfa$zza0);
        this.a = zzfa$zza0;
    }

    @MainThread
    public final void zza(Context context0, Intent intent0) {
        zzeh zzeh0 = zzfr.zzp(context0, null, null).zzay();
        if(intent0 == null) {
            zzeh0.zzk().zza("Receiver called with null intent");
            return;
        }
        String s = intent0.getAction();
        zzeh0.zzj().zzb("Local receiver got", s);
        if("com.google.android.gms.measurement.UPLOAD".equals(s)) {
            Intent intent1 = new Intent().setClassName(context0, "com.google.android.gms.measurement.AppMeasurementService");
            intent1.setAction("com.google.android.gms.measurement.UPLOAD");
            zzeh0.zzj().zza("Starting wakeful intent.");
            this.a.doStartService(context0, intent1);
            return;
        }
        if("com.android.vending.INSTALL_REFERRER".equals(s)) {
            zzeh0.zzk().zza("Install Referrer Broadcasts are deprecated");
        }
    }
}

