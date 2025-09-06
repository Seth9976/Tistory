package com.google.android.datatransport.runtime.scheduling;

import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import com.google.android.datatransport.runtime.time.Clock;
import javax.inject.Provider;

public final class SchedulingConfigModule_ConfigFactory implements Factory {
    public final Provider a;

    public SchedulingConfigModule_ConfigFactory(Provider provider0) {
        this.a = provider0;
    }

    public static SchedulerConfig config(Clock clock0) {
        return (SchedulerConfig)Preconditions.checkNotNull(SchedulerConfig.getDefault(clock0), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static SchedulingConfigModule_ConfigFactory create(Provider provider0) {
        return new SchedulingConfigModule_ConfigFactory(provider0);
    }

    public SchedulerConfig get() {
        return SchedulingConfigModule_ConfigFactory.config(((Clock)this.a.get()));
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }
}

