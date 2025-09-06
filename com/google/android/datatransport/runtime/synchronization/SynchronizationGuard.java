package com.google.android.datatransport.runtime.synchronization;

import androidx.annotation.WorkerThread;

@WorkerThread
public interface SynchronizationGuard {
    public interface CriticalSection {
        Object execute();
    }

    Object runCriticalSection(CriticalSection arg1);
}

