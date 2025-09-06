package com.google.android.datatransport.cct.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue.Builder;
import com.google.auto.value.AutoValue;

@AutoValue
public abstract class ClientInfo {
    @AutoValue.Builder
    public static abstract class Builder {
        @NonNull
        public abstract ClientInfo build();

        @NonNull
        public abstract Builder setAndroidClientInfo(@Nullable AndroidClientInfo arg1);

        @NonNull
        public abstract Builder setClientType(@Nullable ClientType arg1);
    }

    public static enum ClientType {
        UNKNOWN,
        ANDROID_FIREBASE;

    }

    @NonNull
    public static Builder builder() {
        return new d();  // 初始化器: Lcom/google/android/datatransport/cct/internal/ClientInfo$Builder;-><init>()V
    }

    @Nullable
    public abstract AndroidClientInfo getAndroidClientInfo();

    @Nullable
    public abstract ClientType getClientType();
}

