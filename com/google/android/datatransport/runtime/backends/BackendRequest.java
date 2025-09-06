package com.google.android.datatransport.runtime.backends;

import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue.Builder;
import com.google.auto.value.AutoValue;

@AutoValue
public abstract class BackendRequest {
    @AutoValue.Builder
    public static abstract class Builder {
        public abstract BackendRequest build();

        public abstract Builder setEvents(Iterable arg1);

        public abstract Builder setExtras(@Nullable byte[] arg1);
    }

    public static Builder builder() {
        return new a();  // 初始化器: Lcom/google/android/datatransport/runtime/backends/BackendRequest$Builder;-><init>()V
    }

    public static BackendRequest create(Iterable iterable0) {
        return BackendRequest.builder().setEvents(iterable0).build();
    }

    public abstract Iterable getEvents();

    @Nullable
    public abstract byte[] getExtras();
}

