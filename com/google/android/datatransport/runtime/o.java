package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.scheduling.DefaultScheduler_Factory;
import com.google.android.datatransport.runtime.scheduling.SchedulingModule_WorkSchedulerFactory;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader_Factory;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer_Factory;
import com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager_Factory;
import javax.inject.Provider;

public final class o extends w {
    public Provider a;
    public Factory b;
    public Provider c;
    public SchemaManager_Factory d;
    public Provider e;
    public Provider f;
    public SchedulingModule_WorkSchedulerFactory g;
    public DefaultScheduler_Factory h;
    public Uploader_Factory i;
    public WorkInitializer_Factory j;
    public Provider k;

}

