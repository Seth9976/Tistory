package com.google.android.datatransport.runtime;

import androidx.annotation.WorkerThread;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.Transport;

public final class ForcedSender {
    @WorkerThread
    public static void sendBlocking(Transport transport0, Priority priority0) {
        if(!(transport0 instanceof v)) {
            throw new IllegalArgumentException("Expected instance of TransportImpl.");
        }
        TransportContext transportContext0 = ((v)transport0).a.withPriority(priority0);
        TransportRuntime.getInstance().getUploader().logAndUpdateState(transportContext0, 1);
    }
}

