package com.google.android.datatransport.cct.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue.Builder;
import com.google.auto.value.AutoValue;

@AutoValue
public abstract class AndroidClientInfo {
    @AutoValue.Builder
    public static abstract class Builder {
        @NonNull
        public abstract AndroidClientInfo build();

        @NonNull
        public abstract Builder setApplicationBuild(@Nullable String arg1);

        @NonNull
        public abstract Builder setCountry(@Nullable String arg1);

        @NonNull
        public abstract Builder setDevice(@Nullable String arg1);

        @NonNull
        public abstract Builder setFingerprint(@Nullable String arg1);

        @NonNull
        public abstract Builder setHardware(@Nullable String arg1);

        @NonNull
        public abstract Builder setLocale(@Nullable String arg1);

        @NonNull
        public abstract Builder setManufacturer(@Nullable String arg1);

        @NonNull
        public abstract Builder setMccMnc(@Nullable String arg1);

        @NonNull
        public abstract Builder setModel(@Nullable String arg1);

        @NonNull
        public abstract Builder setOsBuild(@Nullable String arg1);

        @NonNull
        public abstract Builder setProduct(@Nullable String arg1);

        @NonNull
        public abstract Builder setSdkVersion(@Nullable Integer arg1);
    }

    @NonNull
    public static Builder builder() {
        return new c();  // 初始化器: Lcom/google/android/datatransport/cct/internal/AndroidClientInfo$Builder;-><init>()V
    }

    @Nullable
    public abstract String getApplicationBuild();

    @Nullable
    public abstract String getCountry();

    @Nullable
    public abstract String getDevice();

    @Nullable
    public abstract String getFingerprint();

    @Nullable
    public abstract String getHardware();

    @Nullable
    public abstract String getLocale();

    @Nullable
    public abstract String getManufacturer();

    @Nullable
    public abstract String getMccMnc();

    @Nullable
    public abstract String getModel();

    @Nullable
    public abstract String getOsBuild();

    @Nullable
    public abstract String getProduct();

    @Nullable
    public abstract Integer getSdkVersion();
}

