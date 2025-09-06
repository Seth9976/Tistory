package com.google.android.gms.common.internal;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api.ApiOptions.Optional;

@KeepForSdk
public class TelemetryLoggingOptions implements Optional {
    @KeepForSdk
    public static class Builder {
        public String a;

        @NonNull
        @KeepForSdk
        public TelemetryLoggingOptions build() {
            return new TelemetryLoggingOptions(this.a);
        }

        @NonNull
        @KeepForSdk
        public Builder setApi(@Nullable String s) {
            this.a = s;
            return this;
        }
    }

    public final String a;
    @NonNull
    public static final TelemetryLoggingOptions zaa;

    static {
        TelemetryLoggingOptions.zaa = TelemetryLoggingOptions.builder().build();
    }

    public TelemetryLoggingOptions(String s) {
        this.a = s;
    }

    @NonNull
    @KeepForSdk
    public static Builder builder() {
        return new Builder();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override
    public final boolean equals(@Nullable Object object0) {
        if(object0 == this) {
            return true;
        }
        return object0 instanceof TelemetryLoggingOptions ? Objects.equal(this.a, ((TelemetryLoggingOptions)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return Objects.hashCode(new Object[]{this.a});
    }

    @NonNull
    public final Bundle zaa() {
        Bundle bundle0 = new Bundle();
        String s = this.a;
        if(s != null) {
            bundle0.putString("api", s);
        }
        return bundle0;
    }
}

