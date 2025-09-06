package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import java.util.Set;

public final class c extends ConfigValue {
    public final long a;
    public final long b;
    public final Set c;

    public c(long v, long v1, Set set0) {
        this.a = v;
        this.b = v1;
        this.c = set0;
    }

    @Override  // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig$ConfigValue
    public final long a() {
        return this.a;
    }

    @Override  // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig$ConfigValue
    public final Set b() {
        return this.c;
    }

    @Override  // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig$ConfigValue
    public final long c() {
        return this.b;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof ConfigValue) {
            long v = ((ConfigValue)object0).a();
            if(this.a == v) {
                long v1 = ((ConfigValue)object0).c();
                if(this.b == v1) {
                    Set set0 = ((ConfigValue)object0).b();
                    return this.c.equals(set0);
                }
            }
            return false;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return ((((int)(this.a ^ this.a >>> 0x20)) ^ 1000003) * 1000003 ^ ((int)(this.b >>> 0x20 ^ this.b))) * 1000003 ^ this.c.hashCode();
    }

    @Override
    public final String toString() {
        return "ConfigValue{delta=" + this.a + ", maxAllowedDelay=" + this.b + ", flags=" + this.c + "}";
    }
}

