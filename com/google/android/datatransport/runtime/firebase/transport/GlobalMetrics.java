package com.google.android.datatransport.runtime.firebase.transport;

import com.google.firebase.encoders.annotations.Encodable.Field;
import com.google.firebase.encoders.annotations.Encodable.Ignore;
import com.google.firebase.encoders.proto.Protobuf;

public final class GlobalMetrics {
    public static final class Builder {
        public StorageMetrics a;

        public Builder() {
            this.a = null;
        }

        public GlobalMetrics build() {
            return new GlobalMetrics(this.a);
        }

        public Builder setStorageMetrics(StorageMetrics storageMetrics0) {
            this.a = storageMetrics0;
            return this;
        }
    }

    public final StorageMetrics a;
    public static final GlobalMetrics b;

    static {
        GlobalMetrics.b = new Builder().build();
    }

    public GlobalMetrics(StorageMetrics storageMetrics0) {
        this.a = storageMetrics0;
    }

    public static GlobalMetrics getDefaultInstance() {
        return GlobalMetrics.b;
    }

    @Ignore
    public StorageMetrics getStorageMetrics() {
        return this.a == null ? StorageMetrics.getDefaultInstance() : this.a;
    }

    @Field(name = "storageMetrics")
    @Protobuf(tag = 1)
    public StorageMetrics getStorageMetricsInternal() {
        return this.a;
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}

