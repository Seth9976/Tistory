package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzci;
import com.google.android.gms.internal.measurement.zzo;
import java.util.Map;

public final class s implements zzo, zzgr {
    public final Object a;
    public final Object b;

    public s(Object object0, Object object1) {
        this.b = object0;
        this.a = object1;
        super();
    }

    @Override  // com.google.android.gms.measurement.internal.zzgr
    public void interceptEvent(String s, String s1, Bundle bundle0, long v) {
        try {
            ((zzci)this.a).zze(s, s1, bundle0, v);
        }
        catch(RemoteException remoteException0) {
            zzfr zzfr0 = ((AppMeasurementDynamiteService)this.b).a;
            if(zzfr0 != null) {
                zzfr0.zzay().zzk().zzb("Event interceptor threw exception", remoteException0);
            }
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zzo
    public String zza(String s) {
        Map map0 = (Map)((zzfi)this.b).b.get(((String)this.a));
        return map0 == null || !map0.containsKey(s) ? null : ((String)map0.get(s));
    }
}

