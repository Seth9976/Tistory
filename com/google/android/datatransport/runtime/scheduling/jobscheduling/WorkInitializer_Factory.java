package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import java.util.concurrent.Executor;
import javax.inject.Provider;

public final class WorkInitializer_Factory implements Factory {
    public final Provider a;
    public final Provider b;
    public final Provider c;
    public final Provider d;

    public WorkInitializer_Factory(Provider provider0, Provider provider1, Provider provider2, Provider provider3) {
        this.a = provider0;
        this.b = provider1;
        this.c = provider2;
        this.d = provider3;
    }

    public static WorkInitializer_Factory create(Provider provider0, Provider provider1, Provider provider2, Provider provider3) {
        return new WorkInitializer_Factory(provider0, provider1, provider2, provider3);
    }

    public WorkInitializer get() {
        return WorkInitializer_Factory.newInstance(((Executor)this.a.get()), ((EventStore)this.b.get()), ((WorkScheduler)this.c.get()), ((SynchronizationGuard)this.d.get()));
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static WorkInitializer newInstance(Executor executor0, EventStore eventStore0, WorkScheduler workScheduler0, SynchronizationGuard synchronizationGuard0) {
        return new WorkInitializer(executor0, eventStore0, workScheduler0, synchronizationGuard0);
    }
}

