package com.google.firebase.crashlytics.internal.common;

import androidx.annotation.NonNull;
import com.google.auto.value.AutoValue;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.io.File;

@AutoValue
public abstract class CrashlyticsReportWithSessionId {
    @NonNull
    public static CrashlyticsReportWithSessionId create(CrashlyticsReport crashlyticsReport0, String s, File file0) {
        return new a(crashlyticsReport0, s, file0);
    }

    public abstract CrashlyticsReport getReport();

    public abstract File getReportFile();

    public abstract String getSessionId();
}

