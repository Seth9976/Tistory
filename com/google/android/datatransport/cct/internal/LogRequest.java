package com.google.android.datatransport.cct.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue.Builder;
import com.google.auto.value.AutoValue;
import com.google.firebase.encoders.annotations.Encodable.Field;
import java.util.List;

@AutoValue
public abstract class LogRequest {
    @AutoValue.Builder
    public static abstract class Builder {
        public abstract g a(Integer arg1);

        public abstract g b(String arg1);

        @NonNull
        public abstract LogRequest build();

        @NonNull
        public abstract Builder setClientInfo(@Nullable ClientInfo arg1);

        @NonNull
        public abstract Builder setLogEvents(@Nullable List arg1);

        @NonNull
        public abstract Builder setQosTier(@Nullable QosTier arg1);

        @NonNull
        public abstract Builder setRequestTimeMs(long arg1);

        @NonNull
        public abstract Builder setRequestUptimeMs(long arg1);

        @NonNull
        public Builder setSource(int v) {
            return this.a(v);
        }

        @NonNull
        public Builder setSource(@NonNull String s) {
            return this.b(s);
        }
    }

    @NonNull
    public static Builder builder() {
        return new g();  // 初始化器: Lcom/google/android/datatransport/cct/internal/LogRequest$Builder;-><init>()V
    }

    @Nullable
    public abstract ClientInfo getClientInfo();

    @Nullable
    @Field(name = "logEvent")
    public abstract List getLogEvents();

    @Nullable
    public abstract Integer getLogSource();

    @Nullable
    public abstract String getLogSourceName();

    @Nullable
    public abstract QosTier getQosTier();

    public abstract long getRequestTimeMs();

    public abstract long getRequestUptimeMs();
}

