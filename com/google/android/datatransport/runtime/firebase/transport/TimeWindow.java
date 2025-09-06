package com.google.android.datatransport.runtime.firebase.transport;

import com.google.firebase.encoders.proto.Protobuf;

public final class TimeWindow {
    public static final class Builder {
        public long a;
        public long b;

        public Builder() {
            this.a = 0L;
            this.b = 0L;
        }

        public TimeWindow build() {
            return new TimeWindow(this.a, this.b);
        }

        public Builder setEndMs(long v) {
            this.b = v;
            return this;
        }

        public Builder setStartMs(long v) {
            this.a = v;
            return this;
        }
    }

    public final long a;
    public final long b;
    public static final TimeWindow c;

    static {
        TimeWindow.c = new Builder().build();
    }

    public TimeWindow(long v, long v1) {
        this.a = v;
        this.b = v1;
    }

    public static TimeWindow getDefaultInstance() {
        return TimeWindow.c;
    }

    @Protobuf(tag = 2)
    public long getEndMs() {
        return this.b;
    }

    @Protobuf(tag = 1)
    public long getStartMs() {
        return this.a;
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}

