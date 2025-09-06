package com.google.android.datatransport.runtime.time;

import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;
import x6.a;

public final class TimeModule_EventClockFactory implements Factory {
    public static TimeModule_EventClockFactory create() {
        return a.a;
    }

    public static Clock eventClock() {
        return (Clock)Preconditions.checkNotNull(new WallTimeClock(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public Clock get() {
        return TimeModule_EventClockFactory.eventClock();
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }
}

