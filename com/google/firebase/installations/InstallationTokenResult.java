package com.google.firebase.installations;

import androidx.annotation.NonNull;
import com.google.auto.value.AutoValue.Builder;
import com.google.auto.value.AutoValue;

@AutoValue
public abstract class InstallationTokenResult {
    @AutoValue.Builder
    public static abstract class Builder {
        @NonNull
        public abstract InstallationTokenResult build();

        @NonNull
        public abstract Builder setToken(@NonNull String arg1);

        @NonNull
        public abstract Builder setTokenCreationTimestamp(long arg1);

        @NonNull
        public abstract Builder setTokenExpirationTimestamp(long arg1);
    }

    @NonNull
    public static Builder builder() {
        return new a();  // 初始化器: Lcom/google/firebase/installations/InstallationTokenResult$Builder;-><init>()V
    }

    @NonNull
    public abstract String getToken();

    @NonNull
    public abstract long getTokenCreationTimestamp();

    @NonNull
    public abstract long getTokenExpirationTimestamp();

    @NonNull
    public abstract Builder toBuilder();
}

