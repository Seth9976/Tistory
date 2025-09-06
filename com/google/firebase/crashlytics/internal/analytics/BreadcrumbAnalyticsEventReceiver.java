package com.google.firebase.crashlytics.internal.analytics;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbHandler;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource;
import org.json.JSONException;
import org.json.JSONObject;

public class BreadcrumbAnalyticsEventReceiver implements AnalyticsEventReceiver, BreadcrumbSource {
    public BreadcrumbHandler a;

    public static String a(String s, Bundle bundle0) {
        JSONObject jSONObject0 = new JSONObject();
        JSONObject jSONObject1 = new JSONObject();
        for(Object object0: bundle0.keySet()) {
            jSONObject1.put(((String)object0), bundle0.get(((String)object0)));
        }
        jSONObject0.put("name", s);
        jSONObject0.put("parameters", jSONObject1);
        return jSONObject0.toString();
    }

    @Override  // com.google.firebase.crashlytics.internal.analytics.AnalyticsEventReceiver
    public void onEvent(@NonNull String s, @NonNull Bundle bundle0) {
        BreadcrumbHandler breadcrumbHandler0 = this.a;
        if(breadcrumbHandler0 != null) {
            try {
                breadcrumbHandler0.handleBreadcrumb("$A$:" + BreadcrumbAnalyticsEventReceiver.a(s, bundle0));
            }
            catch(JSONException unused_ex) {
                Logger.getLogger().w("Unable to serialize Firebase Analytics event to breadcrumb.");
            }
        }
    }

    @Override  // com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource
    public void registerBreadcrumbHandler(@Nullable BreadcrumbHandler breadcrumbHandler0) {
        this.a = breadcrumbHandler0;
        Logger.getLogger().d("Registered Firebase Analytics event receiver for breadcrumbs");
    }
}

