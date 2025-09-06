package com.google.firebase.installations.remote;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue.Builder;
import com.google.auto.value.AutoValue;

@AutoValue
public abstract class TokenResult {
    @AutoValue.Builder
    public static abstract class Builder {
        @NonNull
        public abstract TokenResult build();

        @NonNull
        public abstract Builder setResponseCode(@NonNull ResponseCode arg1);

        @NonNull
        public abstract Builder setToken(@NonNull String arg1);

        @NonNull
        public abstract Builder setTokenExpirationTimestamp(long arg1);
    }

    public static enum ResponseCode {
        OK,
        BAD_CONFIG,
        AUTH_ERROR;

    }

    @NonNull
    public static Builder builder() {
        Builder tokenResult$Builder0 = new c();  // 初始化器: Lcom/google/firebase/installations/remote/TokenResult$Builder;-><init>()V
        tokenResult$Builder0.b = 0L;
        return tokenResult$Builder0;
    }

    @Nullable
    public abstract ResponseCode getResponseCode();

    @Nullable
    public abstract String getToken();

    @NonNull
    public abstract long getTokenExpirationTimestamp();

    @NonNull
    public abstract Builder toBuilder();
}

