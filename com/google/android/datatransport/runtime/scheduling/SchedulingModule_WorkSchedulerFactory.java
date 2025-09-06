package com.google.android.datatransport.runtime.scheduling;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoScheduler;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.time.Clock;
import javax.inject.Provider;

public final class SchedulingModule_WorkSchedulerFactory implements Factory {
    public final Provider a;
    public final Provider b;
    public final Provider c;
    public final Provider d;

    public SchedulingModule_WorkSchedulerFactory(Provider provider0, Provider provider1, Provider provider2, Provider provider3) {
        this.a = provider0;
        this.b = provider1;
        this.c = provider2;
        this.d = provider3;
    }

    public static SchedulingModule_WorkSchedulerFactory create(Provider provider0, Provider provider1, Provider provider2, Provider provider3) {
        return new SchedulingModule_WorkSchedulerFactory(provider0, provider1, provider2, provider3);
    }

    public WorkScheduler get() {
        return SchedulingModule_WorkSchedulerFactory.workScheduler(((Context)this.a.get()), ((EventStore)this.b.get()), ((SchedulerConfig)this.c.get()), ((Clock)this.d.get()));
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static WorkScheduler workScheduler(Context context0, EventStore eventStore0, SchedulerConfig schedulerConfig0, Clock clock0) {
        return (WorkScheduler)Preconditions.checkNotNull(new JobInfoScheduler(context0, eventStore0, schedulerConfig0), "Cannot return null from a non-@Nullable @Provides method");
    }
}

