package com.google.firebase.analytics.connector.internal;

import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;

public final class zzb implements ComponentFactory {
    public static final zzb zza;

    static {
        zzb.zza = new zzb();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override  // com.google.firebase.components.ComponentFactory
    public final Object create(ComponentContainer componentContainer0) {
        return AnalyticsConnectorRegistrar.lambda$getComponents$0(componentContainer0);
    }
}

