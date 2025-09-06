package com.google.firebase.crashlytics.internal;

import androidx.annotation.NonNull;
import com.google.firebase.crashlytics.internal.model.StaticSessionData;

public interface CrashlyticsNativeComponent {
    @NonNull
    NativeSessionFileProvider getSessionFileProvider(@NonNull String arg1);

    boolean hasCrashDataForCurrentSession();

    boolean hasCrashDataForSession(@NonNull String arg1);

    void prepareNativeSession(@NonNull String arg1, @NonNull String arg2, long arg3, @NonNull StaticSessionData arg4);
}

