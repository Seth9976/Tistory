package com.google.android.gms.common.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.service.zao;

@KeepForSdk
public class TelemetryLogging {
    @NonNull
    @KeepForSdk
    public static TelemetryLoggingClient getClient(@NonNull Context context0) {
        return TelemetryLogging.getClient(context0, TelemetryLoggingOptions.zaa);
    }

    @NonNull
    @KeepForSdk
    public static TelemetryLoggingClient getClient(@NonNull Context context0, @NonNull TelemetryLoggingOptions telemetryLoggingOptions0) {
        return new zao(context0, telemetryLoggingOptions0);
    }
}

