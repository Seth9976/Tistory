package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.time.Clock;
import java.util.HashMap;
import java.util.Map;

public final class a extends SchedulerConfig {
    public final Clock a;
    public final HashMap b;

    public a(Clock clock0, HashMap hashMap0) {
        if(clock0 == null) {
            throw new NullPointerException("Null clock");
        }
        this.a = clock0;
        if(hashMap0 == null) {
            throw new NullPointerException("Null values");
        }
        this.b = hashMap0;
    }

    @Override  // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig
    public final Clock a() {
        return this.a;
    }

    @Override  // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig
    public final Map b() {
        return this.b;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof SchedulerConfig) {
            Clock clock0 = ((SchedulerConfig)object0).a();
            if(this.a.equals(clock0)) {
                Map map0 = ((SchedulerConfig)object0).b();
                return this.b.equals(map0);
            }
            return false;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return (this.a.hashCode() ^ 1000003) * 1000003 ^ this.b.hashCode();
    }

    @Override
    public final String toString() {
        return "SchedulerConfig{clock=" + this.a + ", values=" + this.b + "}";
    }
}

