package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.settings.SettingsProvider;

interface CrashlyticsUncaughtExceptionHandler.CrashListener {
    void onUncaughtException(SettingsProvider arg1, Thread arg2, Throwable arg3);
}

