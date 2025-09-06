package com.google.firebase.crashlytics;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CrashlyticsCore;

public class FirebaseCrashlytics {
    public final CrashlyticsCore a;

    public FirebaseCrashlytics(CrashlyticsCore crashlyticsCore0) {
        this.a = crashlyticsCore0;
    }

    @NonNull
    public Task checkForUnsentReports() {
        return this.a.checkForUnsentReports();
    }

    public void deleteUnsentReports() {
        this.a.deleteUnsentReports();
    }

    public boolean didCrashOnPreviousExecution() {
        return this.a.didCrashOnPreviousExecution();
    }

    @NonNull
    public static FirebaseCrashlytics getInstance() {
        FirebaseCrashlytics firebaseCrashlytics0 = (FirebaseCrashlytics)FirebaseApp.getInstance().get(FirebaseCrashlytics.class);
        if(firebaseCrashlytics0 == null) {
            throw new NullPointerException("FirebaseCrashlytics component is not present.");
        }
        return firebaseCrashlytics0;
    }

    public void log(@NonNull String s) {
        this.a.log(s);
    }

    public void recordException(@NonNull Throwable throwable0) {
        if(throwable0 == null) {
            Logger.getLogger().w("A null value was passed to recordException. Ignoring.");
            return;
        }
        this.a.logException(throwable0);
    }

    public void sendUnsentReports() {
        this.a.sendUnsentReports();
    }

    public void setCrashlyticsCollectionEnabled(@Nullable Boolean boolean0) {
        this.a.setCrashlyticsCollectionEnabled(boolean0);
    }

    public void setCrashlyticsCollectionEnabled(boolean z) {
        this.a.setCrashlyticsCollectionEnabled(Boolean.valueOf(z));
    }

    public void setCustomKey(@NonNull String s, double f) {
        this.a.setCustomKey(s, Double.toString(f));
    }

    public void setCustomKey(@NonNull String s, float f) {
        this.a.setCustomKey(s, Float.toString(f));
    }

    public void setCustomKey(@NonNull String s, int v) {
        this.a.setCustomKey(s, Integer.toString(v));
    }

    public void setCustomKey(@NonNull String s, long v) {
        this.a.setCustomKey(s, Long.toString(v));
    }

    public void setCustomKey(@NonNull String s, @NonNull String s1) {
        this.a.setCustomKey(s, s1);
    }

    public void setCustomKey(@NonNull String s, boolean z) {
        this.a.setCustomKey(s, Boolean.toString(z));
    }

    public void setCustomKeys(@NonNull CustomKeysAndValues customKeysAndValues0) {
        this.a.setCustomKeys(customKeysAndValues0.a);
    }

    public void setUserId(@NonNull String s) {
        this.a.setUserId(s);
    }
}

