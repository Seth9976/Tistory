package com.google.firebase.analytics.connector.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.connector.AnalyticsConnector.AnalyticsConnectorListener;
import java.util.HashSet;
import java.util.Set;
import n8.a;

public final class zze implements zza {
    public final HashSet a;
    public final AnalyticsConnectorListener b;

    public zze(AppMeasurementSdk appMeasurementSdk0, AnalyticsConnectorListener analyticsConnector$AnalyticsConnectorListener0) {
        this.b = analyticsConnector$AnalyticsConnectorListener0;
        appMeasurementSdk0.registerOnMeasurementEventListener(new a(this));
        this.a = new HashSet();
    }

    @Override  // com.google.firebase.analytics.connector.internal.zza
    public final AnalyticsConnectorListener zza() {
        return this.b;
    }

    @Override  // com.google.firebase.analytics.connector.internal.zza
    public final void zzb(Set set0) {
        HashSet hashSet0 = this.a;
        hashSet0.clear();
        HashSet hashSet1 = new HashSet();
        for(Object object0: set0) {
            String s = (String)object0;
            if(hashSet1.size() >= 50) {
                break;
            }
            if(zzc.zzf(s) && zzc.zzg(s)) {
                String s1 = zzc.zzd(s);
                Preconditions.checkNotNull(s1);
                hashSet1.add(s1);
            }
        }
        hashSet0.addAll(hashSet1);
    }

    @Override  // com.google.firebase.analytics.connector.internal.zza
    public final void zzc() {
        this.a.clear();
    }
}

