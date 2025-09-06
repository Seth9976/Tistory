package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzci;

public final class s1 implements zzgs {
    public final zzci a;
    public final AppMeasurementDynamiteService b;

    public s1(AppMeasurementDynamiteService appMeasurementDynamiteService0, zzci zzci0) {
        this.b = appMeasurementDynamiteService0;
        this.a = zzci0;
    }

    @Override  // com.google.android.gms.measurement.internal.zzgs
    public final void onEvent(String s, String s1, Bundle bundle0, long v) {
        try {
            this.a.zze(s, s1, bundle0, v);
        }
        catch(RemoteException remoteException0) {
            zzfr zzfr0 = this.b.a;
            if(zzfr0 != null) {
                zzfr0.zzay().zzk().zzb("Event listener threw exception", remoteException0);
            }
        }
    }
}

