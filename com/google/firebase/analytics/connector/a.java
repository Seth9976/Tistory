package com.google.firebase.analytics.connector;

import com.google.firebase.analytics.connector.internal.zza;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public final class a implements AnalyticsConnectorHandle {
    public final String a;
    public final AnalyticsConnectorImpl b;

    public a(AnalyticsConnectorImpl analyticsConnectorImpl0, String s) {
        this.b = analyticsConnectorImpl0;
        this.a = s;
    }

    @Override  // com.google.firebase.analytics.connector.AnalyticsConnector$AnalyticsConnectorHandle
    public final void registerEventNames(Set set0) {
        AnalyticsConnectorImpl analyticsConnectorImpl0 = this.b;
        String s = this.a;
        if(analyticsConnectorImpl0.a(s) && s.equals("fiam") && set0 != null && !set0.isEmpty()) {
            ((zza)analyticsConnectorImpl0.b.get(s)).zzb(set0);
        }
    }

    @Override  // com.google.firebase.analytics.connector.AnalyticsConnector$AnalyticsConnectorHandle
    public final void unregister() {
        AnalyticsConnectorImpl analyticsConnectorImpl0 = this.b;
        String s = this.a;
        if(!analyticsConnectorImpl0.a(s)) {
            return;
        }
        ConcurrentHashMap concurrentHashMap0 = analyticsConnectorImpl0.b;
        AnalyticsConnectorListener analyticsConnector$AnalyticsConnectorListener0 = ((zza)concurrentHashMap0.get(s)).zza();
        if(analyticsConnector$AnalyticsConnectorListener0 != null) {
            analyticsConnector$AnalyticsConnectorListener0.onMessageTriggered(0, null);
        }
        concurrentHashMap0.remove(s);
    }

    @Override  // com.google.firebase.analytics.connector.AnalyticsConnector$AnalyticsConnectorHandle
    public final void unregisterEventNames() {
        AnalyticsConnectorImpl analyticsConnectorImpl0 = this.b;
        String s = this.a;
        if(analyticsConnectorImpl0.a(s) && s.equals("fiam")) {
            ((zza)analyticsConnectorImpl0.b.get(s)).zzc();
        }
    }
}

