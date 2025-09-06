package com.google.firebase.installations.remote;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue.Builder;
import com.google.auto.value.AutoValue;

@AutoValue
public abstract class InstallationResponse {
    @AutoValue.Builder
    public static abstract class Builder {
        @NonNull
        public abstract InstallationResponse build();

        @NonNull
        public abstract Builder setAuthToken(@NonNull TokenResult arg1);

        @NonNull
        public abstract Builder setFid(@NonNull String arg1);

        @NonNull
        public abstract Builder setRefreshToken(@NonNull String arg1);

        @NonNull
        public abstract Builder setResponseCode(@NonNull ResponseCode arg1);

        @NonNull
        public abstract Builder setUri(@NonNull String arg1);
    }

    public static enum ResponseCode {
        OK,
        BAD_CONFIG;

    }

    @NonNull
    public static Builder builder() {
        return new a();  // 初始化器: Lcom/google/firebase/installations/remote/InstallationResponse$Builder;-><init>()V
    }

    @Nullable
    public abstract TokenResult getAuthToken();

    @Nullable
    public abstract String getFid();

    @Nullable
    public abstract String getRefreshToken();

    @Nullable
    public abstract ResponseCode getResponseCode();

    @Nullable
    public abstract String getUri();

    @NonNull
    public abstract Builder toBuilder();
}

