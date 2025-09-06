package com.google.firebase.crashlytics.internal.settings;

import com.google.firebase.crashlytics.internal.common.CurrentTimeProvider;
import org.json.JSONObject;

public final class a implements SettingsJsonTransform {
    public static Settings a(CurrentTimeProvider currentTimeProvider0) {
        SessionData settings$SessionData0 = new SessionData(8, 4);
        FeatureFlagData settings$FeatureFlagData0 = new FeatureFlagData(true, false);
        return new Settings(currentTimeProvider0.getCurrentTimeMillis() + 3600000L, settings$SessionData0, settings$FeatureFlagData0, 0, 3600, 10.0, 1.2, 60);
    }

    @Override  // com.google.firebase.crashlytics.internal.settings.SettingsJsonTransform
    public final Settings buildFromJson(CurrentTimeProvider currentTimeProvider0, JSONObject jSONObject0) {
        return a.a(currentTimeProvider0);
    }
}

