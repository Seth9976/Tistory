package com.google.android.datatransport.runtime.time;

import java.util.concurrent.atomic.AtomicLong;

public class TestClock implements Clock {
    public final AtomicLong a;

    public TestClock(long v) {
        this.a = new AtomicLong(v);
    }

    public void advance(long v) {
        if(v < 0L) {
            throw new IllegalArgumentException("cannot advance time backwards.");
        }
        this.a.addAndGet(v);
    }

    @Override  // com.google.android.datatransport.runtime.time.Clock
    public long getTime() {
        return this.a.get();
    }

    public void tick() {
        this.advance(1L);
    }
}

