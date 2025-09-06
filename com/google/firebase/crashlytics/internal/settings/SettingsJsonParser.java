package com.google.firebase.crashlytics.internal.settings;

import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.SystemCurrentTimeProvider;
import org.json.JSONException;
import org.json.JSONObject;

public class SettingsJsonParser {
    public final SystemCurrentTimeProvider a;

    public SettingsJsonParser(SystemCurrentTimeProvider systemCurrentTimeProvider0) {
        this.a = systemCurrentTimeProvider0;
    }

    public Settings parseSettingsJson(JSONObject jSONObject0) throws JSONException {
        int v = jSONObject0.getInt("settings_version");
        if(v != 3) {
            Logger.getLogger().e("Could not determine SettingsJsonTransform for settings version " + v + ". Using default settings values.");
            return new a().buildFromJson(this.a, jSONObject0);  // 初始化器: Ljava/lang/Object;-><init>()V
        }
        return new e().buildFromJson(this.a, jSONObject0);  // 初始化器: Ljava/lang/Object;-><init>()V
    }
}

