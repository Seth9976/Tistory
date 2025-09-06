package com.google.firebase.crashlytics.internal.analytics;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.analytics.connector.AnalyticsConnector;

public class CrashlyticsOriginAnalyticsEventLogger implements AnalyticsEventLogger {
    public final AnalyticsConnector a;

    public CrashlyticsOriginAnalyticsEventLogger(@NonNull AnalyticsConnector analyticsConnector0) {
        this.a = analyticsConnector0;
    }

    @Override  // com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger
    public void logEvent(@NonNull String s, @Nullable Bundle bundle0) {
        this.a.logEvent("clx", s, bundle0);
    }
}

