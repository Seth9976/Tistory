package com.google.android.datatransport.runtime.backends;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class BackendResponse {
    public static enum Status {
        OK,
        TRANSIENT_ERROR,
        FATAL_ERROR,
        INVALID_PAYLOAD;

    }

    public static BackendResponse fatalError() {
        return new b(Status.FATAL_ERROR, -1L);
    }

    public abstract long getNextRequestWaitMillis();

    public abstract Status getStatus();

    public static BackendResponse invalidPayload() {
        return new b(Status.INVALID_PAYLOAD, -1L);
    }

    public static BackendResponse ok(long v) {
        return new b(Status.OK, v);
    }

    public static BackendResponse transientError() {
        return new b(Status.TRANSIENT_ERROR, -1L);
    }
}

