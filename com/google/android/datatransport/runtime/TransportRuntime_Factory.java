package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.scheduling.Scheduler;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer;
import com.google.android.datatransport.runtime.time.Clock;
import javax.inject.Provider;

public final class TransportRuntime_Factory implements Factory {
    public final Provider a;
    public final Provider b;
    public final Provider c;
    public final Provider d;
    public final Provider e;

    public TransportRuntime_Factory(Provider provider0, Provider provider1, Provider provider2, Provider provider3, Provider provider4) {
        this.a = provider0;
        this.b = provider1;
        this.c = provider2;
        this.d = provider3;
        this.e = provider4;
    }

    public static TransportRuntime_Factory create(Provider provider0, Provider provider1, Provider provider2, Provider provider3, Provider provider4) {
        return new TransportRuntime_Factory(provider0, provider1, provider2, provider3, provider4);
    }

    public TransportRuntime get() {
        return TransportRuntime_Factory.newInstance(((Clock)this.a.get()), ((Clock)this.b.get()), ((Scheduler)this.c.get()), ((Uploader)this.d.get()), ((WorkInitializer)this.e.get()));
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static TransportRuntime newInstance(Clock clock0, Clock clock1, Scheduler scheduler0, Uploader uploader0, WorkInitializer workInitializer0) {
        return new TransportRuntime(clock0, clock1, scheduler0, uploader0, workInitializer0);
    }
}

