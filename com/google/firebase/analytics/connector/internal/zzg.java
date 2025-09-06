package com.google.firebase.analytics.connector.internal;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.connector.AnalyticsConnector.AnalyticsConnectorListener;
import java.util.Set;
import n8.b;

public final class zzg implements zza {
    public final AnalyticsConnectorListener a;

    public zzg(AppMeasurementSdk appMeasurementSdk0, AnalyticsConnectorListener analyticsConnector$AnalyticsConnectorListener0) {
        this.a = analyticsConnector$AnalyticsConnectorListener0;
        appMeasurementSdk0.registerOnMeasurementEventListener(new b(this));
    }

    @Override  // com.google.firebase.analytics.connector.internal.zza
    public final AnalyticsConnectorListener zza() {
        return this.a;
    }

    @Override  // com.google.firebase.analytics.connector.internal.zza
    public final void zzb(Set set0) {
    }

    @Override  // com.google.firebase.analytics.connector.internal.zza
    public final void zzc() {
    }
}

