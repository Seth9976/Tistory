package com.google.android.datatransport.runtime.firebase.transport;

import com.google.firebase.encoders.proto.Protobuf;

public final class StorageMetrics {
    public static final class Builder {
        public long a;
        public long b;

        public Builder() {
            this.a = 0L;
            this.b = 0L;
        }

        public StorageMetrics build() {
            return new StorageMetrics(this.a, this.b);
        }

        public Builder setCurrentCacheSizeBytes(long v) {
            this.a = v;
            return this;
        }

        public Builder setMaxCacheSizeBytes(long v) {
            this.b = v;
            return this;
        }
    }

    public final long a;
    public final long b;
    public static final StorageMetrics c;

    static {
        StorageMetrics.c = new Builder().build();
    }

    public StorageMetrics(long v, long v1) {
        this.a = v;
        this.b = v1;
    }

    @Protobuf(tag = 1)
    public long getCurrentCacheSizeBytes() {
        return this.a;
    }

    public static StorageMetrics getDefaultInstance() {
        return StorageMetrics.c;
    }

    @Protobuf(tag = 2)
    public long getMaxCacheSizeBytes() {
        return this.b;
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}

