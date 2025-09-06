package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobInfo.Builder;
import androidx.annotation.RequiresApi;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.auto.value.AutoValue.Builder;
import com.google.auto.value.AutoValue;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@AutoValue
public abstract class SchedulerConfig {
    public static class Builder {
        public Clock a;
        public HashMap b;

        public Builder() {
            this.b = new HashMap();
        }

        public Builder addConfig(Priority priority0, ConfigValue schedulerConfig$ConfigValue0) {
            this.b.put(priority0, schedulerConfig$ConfigValue0);
            return this;
        }

        public SchedulerConfig build() {
            if(this.a == null) {
                throw new NullPointerException("missing required property: clock");
            }
            if(this.b.keySet().size() < Priority.values().length) {
                throw new IllegalStateException("Not all priorities have been configured");
            }
            HashMap hashMap0 = this.b;
            this.b = new HashMap();
            return new a(this.a, hashMap0);
        }

        public Builder setClock(Clock clock0) {
            this.a = clock0;
            return this;
        }
    }

    @AutoValue
    public static abstract class ConfigValue {
        @AutoValue.Builder
        public static abstract class com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue.Builder {
            public abstract ConfigValue build();

            public abstract com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue.Builder setDelta(long arg1);

            public abstract com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue.Builder setFlags(Set arg1);

            public abstract com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue.Builder setMaxAllowedDelay(long arg1);
        }

        public abstract long a();

        public abstract Set b();

        public static com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue.Builder builder() {
            com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue.Builder schedulerConfig$ConfigValue$Builder0 = new b();  // 初始化器: Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/SchedulerConfig$ConfigValue$Builder;-><init>()V
            ((b)schedulerConfig$ConfigValue$Builder0).setFlags(Collections.emptySet());
            return schedulerConfig$ConfigValue$Builder0;
        }

        public abstract long c();
    }

    public static enum Flag {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING;

    }

    public abstract Clock a();

    public abstract Map b();

    public static Builder builder() {
        return new Builder();
    }

    @RequiresApi(api = 21)
    public JobInfo.Builder configureJob(JobInfo.Builder jobInfo$Builder0, Priority priority0, long v, int v1) {
        jobInfo$Builder0.setMinimumLatency(this.getScheduleDelay(priority0, v, v1));
        Set set0 = ((ConfigValue)this.b().get(priority0)).b();
        if(set0.contains(Flag.NETWORK_UNMETERED)) {
            jobInfo$Builder0.setRequiredNetworkType(2);
        }
        else {
            jobInfo$Builder0.setRequiredNetworkType(1);
        }
        if(set0.contains(Flag.DEVICE_CHARGING)) {
            jobInfo$Builder0.setRequiresCharging(true);
        }
        if(set0.contains(Flag.DEVICE_IDLE)) {
            jobInfo$Builder0.setRequiresDeviceIdle(true);
        }
        return jobInfo$Builder0;
    }

    public static SchedulerConfig getDefault(Clock clock0) {
        Builder schedulerConfig$Builder0 = SchedulerConfig.builder();
        ConfigValue schedulerConfig$ConfigValue0 = ConfigValue.builder().setDelta(30000L).setMaxAllowedDelay(86400000L).build();
        Builder schedulerConfig$Builder1 = schedulerConfig$Builder0.addConfig(Priority.DEFAULT, schedulerConfig$ConfigValue0);
        ConfigValue schedulerConfig$ConfigValue1 = ConfigValue.builder().setDelta(1000L).setMaxAllowedDelay(86400000L).build();
        Builder schedulerConfig$Builder2 = schedulerConfig$Builder1.addConfig(Priority.HIGHEST, schedulerConfig$ConfigValue1);
        ConfigValue schedulerConfig$ConfigValue2 = ConfigValue.builder().setDelta(86400000L).setMaxAllowedDelay(86400000L).setFlags(Collections.unmodifiableSet(new HashSet(Arrays.asList(new Flag[]{Flag.DEVICE_IDLE})))).build();
        return schedulerConfig$Builder2.addConfig(Priority.VERY_LOW, schedulerConfig$ConfigValue2).setClock(clock0).build();
    }

    public Set getFlags(Priority priority0) {
        return ((ConfigValue)this.b().get(priority0)).b();
    }

    public long getScheduleDelay(Priority priority0, long v, int v1) {
        long v2 = this.a().getTime();
        ConfigValue schedulerConfig$ConfigValue0 = (ConfigValue)this.b().get(priority0);
        long v3 = schedulerConfig$ConfigValue0.a();
        return v3 <= 1L ? Math.min(Math.max(((long)(Math.pow(3.0, v1 - 1) * ((double)v3) * Math.max(1.0, 9.21034 / Math.log(2L * ((long)(v1 - 1)))))), v - v2), schedulerConfig$ConfigValue0.c()) : Math.min(Math.max(((long)(Math.pow(3.0, v1 - 1) * ((double)v3) * Math.max(1.0, 9.21034 / Math.log(v3 * ((long)(v1 - 1)))))), v - v2), schedulerConfig$ConfigValue0.c());
    }
}

