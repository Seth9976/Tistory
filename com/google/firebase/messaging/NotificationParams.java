package com.google.firebase.messaging;

import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import org.json.JSONArray;
import org.json.JSONException;

public class NotificationParams {
    public final Bundle a;

    public NotificationParams(@NonNull Bundle bundle0) {
        if(bundle0 == null) {
            throw new NullPointerException("data");
        }
        this.a = new Bundle(bundle0);
    }

    public final int[] a() {
        JSONArray jSONArray0 = this.getJSONArray("gcm.n.light_settings");
        if(jSONArray0 == null) {
            return null;
        }
        try {
            int[] arr_v = new int[3];
            if(jSONArray0.length() == 3) {
                int v = Color.parseColor(jSONArray0.optString(0));
                if(v == 0xFF000000) {
                    throw new IllegalArgumentException("Transparent color is invalid");
                }
                arr_v[0] = v;
                arr_v[1] = jSONArray0.optInt(1);
                arr_v[2] = jSONArray0.optInt(2);
                return arr_v;
            }
            goto label_15;
        }
        catch(JSONException unused_ex) {
            goto label_15;
        }
        catch(IllegalArgumentException illegalArgumentException0) {
        }
        Log.w("NotificationParams", "LightSettings is invalid: " + jSONArray0 + ". " + illegalArgumentException0.getMessage() + ". Skipping setting LightSettings");
        return null;
    label_15:
        Log.w("NotificationParams", "LightSettings is invalid: " + jSONArray0 + ". Skipping setting LightSettings");
        return null;
    }

    // 去混淆评级： 低(20)
    public static String b(String s) {
        return s.startsWith("gcm.n.") ? s.substring(6) : s;
    }

    public boolean getBoolean(String s) {
        String s1 = this.getString(s);
        return "1".equals(s1) || Boolean.parseBoolean(s1);
    }

    public Integer getInteger(String s) {
        String s1 = this.getString(s);
        if(!TextUtils.isEmpty(s1)) {
            try {
                return Integer.parseInt(s1);
            }
            catch(NumberFormatException unused_ex) {
                Log.w("NotificationParams", "Couldn\'t parse value of " + NotificationParams.b(s) + "(" + s1 + ") into an int");
            }
        }
        return null;
    }

    @Nullable
    public JSONArray getJSONArray(String s) {
        String s1 = this.getString(s);
        if(!TextUtils.isEmpty(s1)) {
            try {
                return new JSONArray(s1);
            }
            catch(JSONException unused_ex) {
                Log.w("NotificationParams", "Malformed JSON for key " + NotificationParams.b(s) + ": " + s1 + ", falling back to default");
            }
        }
        return null;
    }

    @Nullable
    public Uri getLink() {
        String s = this.getString("gcm.n.link_android");
        if(TextUtils.isEmpty(s)) {
            s = this.getString("gcm.n.link");
        }
        return TextUtils.isEmpty(s) ? null : Uri.parse(s);
    }

    @Nullable
    public Object[] getLocalizationArgsForKey(String s) {
        JSONArray jSONArray0 = this.getJSONArray(s + "_loc_args");
        if(jSONArray0 == null) {
            return null;
        }
        int v = jSONArray0.length();
        Object[] arr_object = new String[v];
        for(int v1 = 0; v1 < v; ++v1) {
            arr_object[v1] = jSONArray0.optString(v1);
        }
        return arr_object;
    }

    @Nullable
    public String getLocalizationResourceForKey(String s) {
        return this.getString(s + "_loc_key");
    }

    @Nullable
    public String getLocalizedString(Resources resources0, String s, String s1) {
        String s2 = this.getLocalizationResourceForKey(s1);
        if(TextUtils.isEmpty(s2)) {
            return null;
        }
        int v = resources0.getIdentifier(s2, "string", s);
        if(v == 0) {
            Log.w("NotificationParams", NotificationParams.b((s1 + "_loc_key")) + " resource not found: " + s1 + " Default value will be used.");
            return null;
        }
        Object[] arr_object = this.getLocalizationArgsForKey(s1);
        if(arr_object == null) {
            return resources0.getString(v);
        }
        try {
            return resources0.getString(v, arr_object);
        }
        catch(MissingFormatArgumentException missingFormatArgumentException0) {
            Log.w("NotificationParams", "Missing format argument for " + NotificationParams.b(s1) + ": " + Arrays.toString(arr_object) + " Default value will be used.", missingFormatArgumentException0);
            return null;
        }
    }

    public Long getLong(String s) {
        String s1 = this.getString(s);
        if(!TextUtils.isEmpty(s1)) {
            try {
                return Long.parseLong(s1);
            }
            catch(NumberFormatException unused_ex) {
                Log.w("NotificationParams", "Couldn\'t parse value of " + NotificationParams.b(s) + "(" + s1 + ") into a long");
            }
        }
        return null;
    }

    public String getNotificationChannelId() {
        return this.getString("gcm.n.android_channel_id");
    }

    public String getPossiblyLocalizedString(Resources resources0, String s, String s1) {
        String s2 = this.getString(s1);
        return TextUtils.isEmpty(s2) ? this.getLocalizedString(resources0, s, s1) : s2;
    }

    @Nullable
    public String getSoundResourceName() {
        String s = this.getString("gcm.n.sound2");
        return TextUtils.isEmpty(s) ? this.getString("gcm.n.sound") : s;
    }

    public String getString(String s) {
        Bundle bundle0 = this.a;
        if(!bundle0.containsKey(s) && s.startsWith("gcm.n.")) {
            String s1 = s.startsWith("gcm.n.") ? s.replace("gcm.n.", "gcm.notification.") : s;
            if(bundle0.containsKey(s1)) {
                s = s1;
            }
        }
        return bundle0.getString(s);
    }

    @Nullable
    public long[] getVibrateTimings() {
        JSONArray jSONArray0 = this.getJSONArray("gcm.n.vibrate_timings");
        if(jSONArray0 == null) {
            return null;
        }
        try {
            if(jSONArray0.length() > 1) {
                int v = jSONArray0.length();
                long[] arr_v = new long[v];
                for(int v1 = 0; v1 < v; ++v1) {
                    arr_v[v1] = jSONArray0.optLong(v1);
                }
                return arr_v;
            }
        }
        catch(JSONException | NumberFormatException unused_ex) {
        }
        Log.w("NotificationParams", "User defined vibrateTimings is invalid: " + jSONArray0 + ". Skipping setting vibrateTimings.");
        return null;
    }

    public boolean hasImage() {
        return !TextUtils.isEmpty(this.getString("gcm.n.image"));
    }

    // 去混淆评级： 低(30)
    public static boolean isNotification(Bundle bundle0) {
        return "1".equals(bundle0.getString("gcm.n.e")) || "1".equals(bundle0.getString("gcm.notification.e"));
    }

    public boolean isNotification() {
        return this.getBoolean("gcm.n.e");
    }

    public Bundle paramsForAnalyticsIntent() {
        Bundle bundle0 = new Bundle(this.a);
        for(Object object0: this.a.keySet()) {
            String s = (String)object0;
            if(!s.startsWith("google.c.a.") && !s.equals("from")) {
                bundle0.remove(s);
            }
        }
        return bundle0;
    }

    public Bundle paramsWithReservedKeysRemoved() {
        Bundle bundle0 = new Bundle(this.a);
        for(Object object0: this.a.keySet()) {
            String s = (String)object0;
            if(s.startsWith("google.c.") || s.startsWith("gcm.n.") || s.startsWith("gcm.notification.")) {
                bundle0.remove(s);
            }
        }
        return bundle0;
    }
}

