package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbHandler;

public final class m implements BreadcrumbHandler {
    public final CrashlyticsCore a;

    public m(CrashlyticsCore crashlyticsCore0) {
        this.a = crashlyticsCore0;
    }

    @Override  // com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbHandler
    public final void handleBreadcrumb(String s) {
        this.a.log(s);
    }
}

