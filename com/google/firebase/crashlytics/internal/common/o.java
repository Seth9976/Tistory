package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.settings.SettingsProvider;
import java.util.concurrent.atomic.AtomicBoolean;

public final class o implements Thread.UncaughtExceptionHandler {
    public final g a;
    public final SettingsProvider b;
    public final Thread.UncaughtExceptionHandler c;
    public final CrashlyticsNativeComponent d;
    public final AtomicBoolean e;

    public o(g g0, SettingsProvider settingsProvider0, Thread.UncaughtExceptionHandler thread$UncaughtExceptionHandler0, CrashlyticsNativeComponent crashlyticsNativeComponent0) {
        this.a = g0;
        this.b = settingsProvider0;
        this.c = thread$UncaughtExceptionHandler0;
        this.e = new AtomicBoolean(false);
        this.d = crashlyticsNativeComponent0;
    }

    public final boolean a(Thread thread0, Throwable throwable0) {
        if(thread0 == null) {
            Logger.getLogger().e("Crashlytics will not record uncaught exception; null thread");
            return false;
        }
        if(throwable0 == null) {
            Logger.getLogger().e("Crashlytics will not record uncaught exception; null throwable");
            return false;
        }
        if(this.d.hasCrashDataForCurrentSession()) {
            Logger.getLogger().d("Crashlytics will not record uncaught exception; native crash exists for session.");
            return false;
        }
        return true;
    }

    @Override
    public final void uncaughtException(Thread thread0, Throwable throwable0) {
        Thread.UncaughtExceptionHandler thread$UncaughtExceptionHandler0 = this.c;
        AtomicBoolean atomicBoolean0 = this.e;
        atomicBoolean0.set(true);
        try {
            if(this.a(thread0, throwable0)) {
                this.a.onUncaughtException(this.b, thread0, throwable0);
            }
            else {
                Logger.getLogger().d("Uncaught exception will not be recorded by Crashlytics.");
            }
        }
        catch(Exception exception0) {
            Logger.getLogger().e("An error occurred in the uncaught exception handler", exception0);
        }
        finally {
            Logger.getLogger().d("Completed exception processing. Invoking default exception handler.");
            thread$UncaughtExceptionHandler0.uncaughtException(thread0, throwable0);
            atomicBoolean0.set(false);
        }
    }
}

