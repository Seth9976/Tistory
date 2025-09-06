package com.google.android.datatransport.runtime;

import android.content.Context;
import com.google.android.datatransport.runtime.backends.CreationContextFactory_Factory;
import com.google.android.datatransport.runtime.backends.MetadataBackendRegistry_Factory;
import com.google.android.datatransport.runtime.dagger.internal.DoubleCheck;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.InstanceFactory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;
import com.google.android.datatransport.runtime.scheduling.DefaultScheduler_Factory;
import com.google.android.datatransport.runtime.scheduling.SchedulingConfigModule_ConfigFactory;
import com.google.android.datatransport.runtime.scheduling.SchedulingModule_WorkSchedulerFactory;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader_Factory;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer_Factory;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_DbNameFactory;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_PackageNameFactory;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_SchemaVersionFactory;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_StoreConfigFactory;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore_Factory;
import com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager_Factory;
import com.google.android.datatransport.runtime.time.TimeModule_EventClockFactory;
import com.google.android.datatransport.runtime.time.TimeModule_UptimeClockFactory;

public final class n implements TransportRuntimeComponent.Builder {
    public Context a;

    @Override  // com.google.android.datatransport.runtime.TransportRuntimeComponent$Builder
    public final w build() {
        Preconditions.checkBuilderRequirement(this.a, Context.class);
        Context context0 = this.a;
        w w0 = new o();  // 初始化器: Ljava/lang/Object;-><init>()V
        w0.a = DoubleCheck.provider(ExecutionModule_ExecutorFactory.create());
        Factory factory0 = InstanceFactory.create(context0);
        w0.b = factory0;
        CreationContextFactory_Factory creationContextFactory_Factory0 = CreationContextFactory_Factory.create(factory0, TimeModule_EventClockFactory.create(), TimeModule_UptimeClockFactory.create());
        w0.c = DoubleCheck.provider(MetadataBackendRegistry_Factory.create(w0.b, creationContextFactory_Factory0));
        w0.d = SchemaManager_Factory.create(w0.b, EventStoreModule_DbNameFactory.create(), EventStoreModule_SchemaVersionFactory.create());
        w0.e = DoubleCheck.provider(EventStoreModule_PackageNameFactory.create(w0.b));
        w0.f = DoubleCheck.provider(SQLiteEventStore_Factory.create(TimeModule_EventClockFactory.create(), TimeModule_UptimeClockFactory.create(), EventStoreModule_StoreConfigFactory.create(), w0.d, w0.e));
        SchedulingConfigModule_ConfigFactory schedulingConfigModule_ConfigFactory0 = SchedulingConfigModule_ConfigFactory.create(TimeModule_EventClockFactory.create());
        SchedulingModule_WorkSchedulerFactory schedulingModule_WorkSchedulerFactory0 = SchedulingModule_WorkSchedulerFactory.create(w0.b, w0.f, schedulingConfigModule_ConfigFactory0, TimeModule_UptimeClockFactory.create());
        w0.g = schedulingModule_WorkSchedulerFactory0;
        w0.h = DefaultScheduler_Factory.create(w0.a, w0.c, schedulingModule_WorkSchedulerFactory0, w0.f, w0.f);
        w0.i = Uploader_Factory.create(w0.b, w0.c, w0.f, w0.g, w0.a, w0.f, TimeModule_EventClockFactory.create(), TimeModule_UptimeClockFactory.create(), w0.f);
        w0.j = WorkInitializer_Factory.create(w0.a, w0.f, w0.g, w0.f);
        w0.k = DoubleCheck.provider(TransportRuntime_Factory.create(TimeModule_EventClockFactory.create(), TimeModule_UptimeClockFactory.create(), w0.h, w0.i, w0.j));
        return w0;
    }

    @Override  // com.google.android.datatransport.runtime.TransportRuntimeComponent$Builder
    public final TransportRuntimeComponent.Builder setApplicationContext(Context context0) {
        this.a = (Context)Preconditions.checkNotNull(context0);
        return this;
    }
}

