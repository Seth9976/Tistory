package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.Context;
import com.google.android.datatransport.runtime.backends.BackendRegistry;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.scheduling.persistence.ClientHealthMetricsStore;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.datatransport.runtime.time.Clock;
import java.util.concurrent.Executor;
import javax.inject.Provider;

public final class Uploader_Factory implements Factory {
    public final Provider a;
    public final Provider b;
    public final Provider c;
    public final Provider d;
    public final Provider e;
    public final Provider f;
    public final Provider g;
    public final Provider h;
    public final Provider i;

    public Uploader_Factory(Provider provider0, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8) {
        this.a = provider0;
        this.b = provider1;
        this.c = provider2;
        this.d = provider3;
        this.e = provider4;
        this.f = provider5;
        this.g = provider6;
        this.h = provider7;
        this.i = provider8;
    }

    public static Uploader_Factory create(Provider provider0, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8) {
        return new Uploader_Factory(provider0, provider1, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    public Uploader get() {
        return Uploader_Factory.newInstance(((Context)this.a.get()), ((BackendRegistry)this.b.get()), ((EventStore)this.c.get()), ((WorkScheduler)this.d.get()), ((Executor)this.e.get()), ((SynchronizationGuard)this.f.get()), ((Clock)this.g.get()), ((Clock)this.h.get()), ((ClientHealthMetricsStore)this.i.get()));
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static Uploader newInstance(Context context0, BackendRegistry backendRegistry0, EventStore eventStore0, WorkScheduler workScheduler0, Executor executor0, SynchronizationGuard synchronizationGuard0, Clock clock0, Clock clock1, ClientHealthMetricsStore clientHealthMetricsStore0) {
        return new Uploader(context0, backendRegistry0, eventStore0, workScheduler0, executor0, synchronizationGuard0, clock0, clock1, clientHealthMetricsStore0);
    }
}

