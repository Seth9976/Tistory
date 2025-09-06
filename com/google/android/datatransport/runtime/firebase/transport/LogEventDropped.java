package com.google.android.datatransport.runtime.firebase.transport;

import com.google.firebase.encoders.proto.ProtoEnum;
import com.google.firebase.encoders.proto.Protobuf;

public final class LogEventDropped {
    public static final class Builder {
        public long a;
        public Reason b;

        public Builder() {
            this.a = 0L;
            this.b = Reason.REASON_UNKNOWN;
        }

        public LogEventDropped build() {
            return new LogEventDropped(this.a, this.b);
        }

        public Builder setEventsDroppedCount(long v) {
            this.a = v;
            return this;
        }

        public Builder setReason(Reason logEventDropped$Reason0) {
            this.b = logEventDropped$Reason0;
            return this;
        }
    }

    public static enum Reason implements ProtoEnum {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);

        public final int a;

        public Reason(int v1) {
            this.a = v1;
        }

        @Override  // com.google.firebase.encoders.proto.ProtoEnum
        public int getNumber() {
            return this.a;
        }
    }

    public final long a;
    public final Reason b;
    public static final LogEventDropped c;

    static {
        LogEventDropped.c = new Builder().build();
    }

    public LogEventDropped(long v, Reason logEventDropped$Reason0) {
        this.a = v;
        this.b = logEventDropped$Reason0;
    }

    public static LogEventDropped getDefaultInstance() {
        return LogEventDropped.c;
    }

    @Protobuf(tag = 1)
    public long getEventsDroppedCount() {
        return this.a;
    }

    @Protobuf(tag = 3)
    public Reason getReason() {
        return this.b;
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}

