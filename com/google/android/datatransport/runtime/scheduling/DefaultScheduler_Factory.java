package com.google.android.datatransport.runtime.scheduling;

import com.google.android.datatransport.runtime.backends.BackendRegistry;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import java.util.concurrent.Executor;
import javax.inject.Provider;

public final class DefaultScheduler_Factory implements Factory {
    public final Provider a;
    public final Provider b;
    public final Provider c;
    public final Provider d;
    public final Provider e;

    public DefaultScheduler_Factory(Provider provider0, Provider provider1, Provider provider2, Provider provider3, Provider provider4) {
        this.a = provider0;
        this.b = provider1;
        this.c = provider2;
        this.d = provider3;
        this.e = provider4;
    }

    public static DefaultScheduler_Factory create(Provider provider0, Provider provider1, Provider provider2, Provider provider3, Provider provider4) {
        return new DefaultScheduler_Factory(provider0, provider1, provider2, provider3, provider4);
    }

    public DefaultScheduler get() {
        return DefaultScheduler_Factory.newInstance(((Executor)this.a.get()), ((BackendRegistry)this.b.get()), ((WorkScheduler)this.c.get()), ((EventStore)this.d.get()), ((SynchronizationGuard)this.e.get()));
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static DefaultScheduler newInstance(Executor executor0, BackendRegistry backendRegistry0, WorkScheduler workScheduler0, EventStore eventStore0, SynchronizationGuard synchronizationGuard0) {
        return new DefaultScheduler(executor0, backendRegistry0, workScheduler0, eventStore0, synchronizationGuard0);
    }
}

