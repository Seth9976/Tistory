package com.google.android.gms.common.providers;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public final class a implements PooledExecutorFactory {
    @Override  // com.google.android.gms.common.providers.PooledExecutorsProvider$PooledExecutorFactory
    public final ScheduledExecutorService newSingleThreadScheduledExecutor() {
        return Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
    }
}

