package com.google.android.datatransport.cct.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue.Builder;
import com.google.auto.value.AutoValue;

@AutoValue
public abstract class LogEvent {
    @AutoValue.Builder
    public static abstract class Builder {
        @NonNull
        public abstract LogEvent build();

        @NonNull
        public abstract Builder setEventCode(@Nullable Integer arg1);

        @NonNull
        public abstract Builder setEventTimeMs(long arg1);

        @NonNull
        public abstract Builder setEventUptimeMs(long arg1);

        @NonNull
        public abstract Builder setNetworkConnectionInfo(@Nullable NetworkConnectionInfo arg1);

        @NonNull
        public abstract Builder setTimezoneOffsetSeconds(long arg1);
    }

    @Nullable
    public abstract Integer getEventCode();

    public abstract long getEventTimeMs();

    public abstract long getEventUptimeMs();

    @Nullable
    public abstract NetworkConnectionInfo getNetworkConnectionInfo();

    @Nullable
    public abstract byte[] getSourceExtension();

    @Nullable
    public abstract String getSourceExtensionJsonProto3();

    public abstract long getTimezoneOffsetSeconds();

    @NonNull
    public static Builder jsonBuilder(@NonNull String s) {
        Builder logEvent$Builder0 = new f();  // 初始化器: Lcom/google/android/datatransport/cct/internal/LogEvent$Builder;-><init>()V
        logEvent$Builder0.e = s;
        return logEvent$Builder0;
    }

    @NonNull
    public static Builder protoBuilder(@NonNull byte[] arr_b) {
        Builder logEvent$Builder0 = new f();  // 初始化器: Lcom/google/android/datatransport/cct/internal/LogEvent$Builder;-><init>()V
        logEvent$Builder0.d = arr_b;
        return logEvent$Builder0;
    }
}

