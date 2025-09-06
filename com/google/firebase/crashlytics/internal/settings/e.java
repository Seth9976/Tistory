package com.google.firebase.crashlytics.internal.settings;

import com.google.firebase.crashlytics.internal.common.CurrentTimeProvider;
import org.json.JSONObject;

public final class e implements SettingsJsonTransform {
    @Override  // com.google.firebase.crashlytics.internal.settings.SettingsJsonTransform
    public final Settings buildFromJson(CurrentTimeProvider currentTimeProvider0, JSONObject jSONObject0) {
        int v = jSONObject0.optInt("settings_version", 0);
        int v1 = jSONObject0.optInt("cache_duration", 3600);
        double f = jSONObject0.optDouble("on_demand_upload_rate_per_minute", 10.0);
        double f1 = jSONObject0.optDouble("on_demand_backoff_base", 1.2);
        int v2 = jSONObject0.optInt("on_demand_backoff_step_duration_seconds", 60);
        SessionData settings$SessionData0 = jSONObject0.has("session") ? new SessionData(jSONObject0.getJSONObject("session").optInt("max_custom_exception_events", 8), 4) : new SessionData(new JSONObject().optInt("max_custom_exception_events", 8), 4);
        JSONObject jSONObject1 = jSONObject0.getJSONObject("features");
        FeatureFlagData settings$FeatureFlagData0 = new FeatureFlagData(jSONObject1.optBoolean("collect_reports", true), jSONObject1.optBoolean("collect_anrs", false));
        return jSONObject0.has("expires_at") ? new Settings(jSONObject0.optLong("expires_at"), settings$SessionData0, settings$FeatureFlagData0, v, v1, f, f1, v2) : new Settings(((long)v1) * 1000L + currentTimeProvider0.getCurrentTimeMillis(), settings$SessionData0, settings$FeatureFlagData0, v, v1, f, f1, v2);
    }
}

