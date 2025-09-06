package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import java.util.concurrent.Executor;
import m5.a;

public class WorkInitializer {
    public final Executor a;
    public final EventStore b;
    public final WorkScheduler c;
    public final SynchronizationGuard d;

    public WorkInitializer(Executor executor0, EventStore eventStore0, WorkScheduler workScheduler0, SynchronizationGuard synchronizationGuard0) {
        this.a = executor0;
        this.b = eventStore0;
        this.c = workScheduler0;
        this.d = synchronizationGuard0;
    }

    public void ensureContextsScheduled() {
        a a0 = new a(this, 4);
        this.a.execute(a0);
    }
}

