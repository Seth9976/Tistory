package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import java.util.Set;

public final class b extends Builder {
    public Long a;
    public Long b;
    public Set c;

    @Override  // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig$ConfigValue$Builder
    public final ConfigValue build() {
        String s = this.a == null ? " delta" : "";
        if(this.b == null) {
            s = s + " maxAllowedDelay";
        }
        if(this.c == null) {
            s = s + " flags";
        }
        if(!s.isEmpty()) {
            throw new IllegalStateException("Missing required properties:" + s);
        }
        return new c(((long)this.a), ((long)this.b), this.c);
    }

    @Override  // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig$ConfigValue$Builder
    public final Builder setDelta(long v) {
        this.a = v;
        return this;
    }

    @Override  // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig$ConfigValue$Builder
    public final Builder setFlags(Set set0) {
        if(set0 == null) {
            throw new NullPointerException("Null flags");
        }
        this.c = set0;
        return this;
    }

    @Override  // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig$ConfigValue$Builder
    public final Builder setMaxAllowedDelay(long v) {
        this.b = v;
        return this;
    }
}

