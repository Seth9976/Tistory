package com.google.android.datatransport.runtime.scheduling;

import androidx.work.impl.c;
import com.google.android.datatransport.TransportScheduleCallback;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.backends.BackendRegistry;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
import javax.inject.Inject;

public class DefaultScheduler implements Scheduler {
    public final WorkScheduler a;
    public final Executor b;
    public final BackendRegistry c;
    public final EventStore d;
    public final SynchronizationGuard e;
    public static final Logger f;

    static {
        DefaultScheduler.f = Logger.getLogger("com.google.android.datatransport.runtime.TransportRuntime");
    }

    @Inject
    public DefaultScheduler(Executor executor0, BackendRegistry backendRegistry0, WorkScheduler workScheduler0, EventStore eventStore0, SynchronizationGuard synchronizationGuard0) {
        this.b = executor0;
        this.c = backendRegistry0;
        this.a = workScheduler0;
        this.d = eventStore0;
        this.e = synchronizationGuard0;
    }

    @Override  // com.google.android.datatransport.runtime.scheduling.Scheduler
    public void schedule(TransportContext transportContext0, EventInternal eventInternal0, TransportScheduleCallback transportScheduleCallback0) {
        c c0 = new c(1, this, transportContext0, transportScheduleCallback0, eventInternal0);
        this.b.execute(c0);
    }
}

