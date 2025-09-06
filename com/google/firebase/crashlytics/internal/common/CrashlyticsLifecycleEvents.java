package com.google.firebase.crashlytics.internal.common;

import androidx.annotation.NonNull;

interface CrashlyticsLifecycleEvents {
    void onBeginSession(@NonNull String arg1, long arg2);

    void onCustomKey(String arg1, String arg2);

    void onLog(long arg1, String arg2);

    void onUserId(String arg1);
}

