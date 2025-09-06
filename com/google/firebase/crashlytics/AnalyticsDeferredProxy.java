package com.google.firebase.crashlytics;

import androidx.annotation.NonNull;
import com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.analytics.UnavailableAnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource;
import com.google.firebase.crashlytics.internal.breadcrumbs.DisabledBreadcrumbSource;
import com.google.firebase.inject.Deferred;
import java.util.ArrayList;
import o8.a;

public class AnalyticsDeferredProxy {
    public final Deferred a;
    public volatile AnalyticsEventLogger b;
    public volatile BreadcrumbSource c;
    public final ArrayList d;

    public AnalyticsDeferredProxy(Deferred deferred0) {
        this(deferred0, new DisabledBreadcrumbSource(), new UnavailableAnalyticsEventLogger());
    }

    public AnalyticsDeferredProxy(Deferred deferred0, @NonNull BreadcrumbSource breadcrumbSource0, @NonNull AnalyticsEventLogger analyticsEventLogger0) {
        this.a = deferred0;
        this.c = breadcrumbSource0;
        this.d = new ArrayList();
        this.b = analyticsEventLogger0;
        deferred0.whenAvailable(new a(this));
    }

    public AnalyticsEventLogger getAnalyticsEventLogger() {
        return new a(this);
    }

    public BreadcrumbSource getDeferredBreadcrumbSource() {
        return new a(this);
    }
}

