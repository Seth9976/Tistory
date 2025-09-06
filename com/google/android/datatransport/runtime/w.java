package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import java.io.Closeable;

public abstract class w implements Closeable {
    @Override
    public final void close() {
        ((EventStore)((o)this).f.get()).close();
    }
}

