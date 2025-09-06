package com.google.android.datatransport.runtime.time;

import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;
import x6.b;

public final class TimeModule_UptimeClockFactory implements Factory {
    public static TimeModule_UptimeClockFactory create() {
        return b.a;
    }

    public Clock get() {
        return TimeModule_UptimeClockFactory.uptimeClock();
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static Clock uptimeClock() {
        return (Clock)Preconditions.checkNotNull(new UptimeClock(), "Cannot return null from a non-@Nullable @Provides method");
    }
}

