package com.google.firebase.analytics.connector;

import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.DataCollectionDefaultChange;
import com.google.firebase.events.Event;
import com.google.firebase.events.EventHandler;

public final class zzb implements EventHandler {
    public static final zzb zza;

    static {
        zzb.zza = new zzb();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override  // com.google.firebase.events.EventHandler
    public final void handle(Event event0) {
        synchronized(AnalyticsConnectorImpl.class) {
            ((AnalyticsConnectorImpl)Preconditions.checkNotNull(AnalyticsConnectorImpl.c)).a.zza(((DataCollectionDefaultChange)event0.getPayload()).enabled);
        }
    }
}

