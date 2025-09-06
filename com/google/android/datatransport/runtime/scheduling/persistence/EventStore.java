package com.google.android.datatransport.runtime.scheduling.persistence;

import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;
import java.io.Closeable;

@WorkerThread
public interface EventStore extends Closeable {
    int cleanUp();

    long getNextCallTime(TransportContext arg1);

    boolean hasPendingEventsFor(TransportContext arg1);

    Iterable loadActiveContexts();

    Iterable loadBatch(TransportContext arg1);

    @Nullable
    PersistedEvent persist(TransportContext arg1, EventInternal arg2);

    void recordFailure(Iterable arg1);

    void recordNextCallTime(TransportContext arg1, long arg2);

    void recordSuccess(Iterable arg1);
}

