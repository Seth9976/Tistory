package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.SimpleArrayMap;
import androidx.core.os.ConfigurationCompat;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.R.string;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.Locale;

public final class zac {
    public static final SimpleArrayMap a;
    public static Locale b;

    static {
        zac.a = new SimpleArrayMap();
    }

    public static String a(Context context0, String s, String s1) {
        Resources resources0 = context0.getResources();
        String s2 = zac.b(context0, s);
        if(s2 == null) {
            s2 = resources0.getString(string.common_google_play_services_unknown_issue);
        }
        return String.format(resources0.getConfiguration().locale, s2, s1);
    }

    public static String b(Context context0, String s) {
        SimpleArrayMap simpleArrayMap0 = zac.a;
        synchronized(simpleArrayMap0) {
            Locale locale0 = ConfigurationCompat.getLocales(context0.getResources().getConfiguration()).get(0);
            if(!locale0.equals(zac.b)) {
                simpleArrayMap0.clear();
                zac.b = locale0;
            }
            String s1 = (String)simpleArrayMap0.get(s);
            if(s1 != null) {
                return s1;
            }
            Resources resources0 = GooglePlayServicesUtil.getRemoteResource(context0);
            if(resources0 == null) {
                return null;
            }
            int v1 = resources0.getIdentifier(s, "string", "com.google.android.gms");
            if(v1 == 0) {
                Log.w("GoogleApiAvailability", (s.length() == 0 ? new String("Missing resource: ") : "Missing resource: " + s));
                return null;
            }
            String s2 = resources0.getString(v1);
            if(TextUtils.isEmpty(s2)) {
                Log.w("GoogleApiAvailability", (s.length() == 0 ? new String("Got empty resource: ") : "Got empty resource: " + s));
                return null;
            }
            simpleArrayMap0.put(s, s2);
            return s2;
        }
    }

    public static String zaa(Context context0) {
        try {
            return Wrappers.packageManager(context0).getApplicationLabel("net.daum.android.tistoryapp").toString();
        }
        catch(PackageManager.NameNotFoundException | NullPointerException unused_ex) {
            String s = context0.getApplicationInfo().name;
            return TextUtils.isEmpty(s) ? "net.daum.android.tistoryapp" : s;
        }
    }

    public static String zab(Context context0) {
        return context0.getResources().getString(com.google.android.gms.base.R.string.common_google_play_services_notification_channel_name);
    }

    @NonNull
    public static String zac(Context context0, int v) {
        Resources resources0 = context0.getResources();
        switch(v) {
            case 1: {
                return resources0.getString(com.google.android.gms.base.R.string.common_google_play_services_install_button);
            }
            case 2: {
                return resources0.getString(com.google.android.gms.base.R.string.common_google_play_services_update_button);
            }
            case 3: {
                return resources0.getString(com.google.android.gms.base.R.string.common_google_play_services_enable_button);
            }
            default: {
                return resources0.getString(0x104000A);
            }
        }
    }

    @NonNull
    public static String zad(Context context0, int v) {
        Resources resources0 = context0.getResources();
        String s = zac.zaa(context0);
        switch(v) {
            case 1: {
                return resources0.getString(com.google.android.gms.base.R.string.common_google_play_services_install_text, new Object[]{s});
            }
            case 2: {
                return DeviceProperties.isWearableWithoutPlayStore(context0) ? resources0.getString(com.google.android.gms.base.R.string.common_google_play_services_wear_update_text) : resources0.getString(com.google.android.gms.base.R.string.common_google_play_services_update_text, new Object[]{s});
            }
            case 3: {
                return resources0.getString(com.google.android.gms.base.R.string.common_google_play_services_enable_text, new Object[]{s});
            }
            case 5: {
                return zac.a(context0, "common_google_play_services_invalid_account_text", s);
            }
            case 7: {
                return zac.a(context0, "common_google_play_services_network_error_text", s);
            }
            case 9: {
                return resources0.getString(com.google.android.gms.base.R.string.common_google_play_services_unsupported_text, new Object[]{s});
            }
            case 16: {
                return zac.a(context0, "common_google_play_services_api_unavailable_text", s);
            }
            case 17: {
                return zac.a(context0, "common_google_play_services_sign_in_failed_text", s);
            }
            case 18: {
                return resources0.getString(com.google.android.gms.base.R.string.common_google_play_services_updating_text, new Object[]{s});
            }
            case 20: {
                return zac.a(context0, "common_google_play_services_restricted_profile_text", s);
            }
            default: {
                return resources0.getString(string.common_google_play_services_unknown_issue, new Object[]{s});
            }
        }
    }

    @NonNull
    public static String zae(Context context0, int v) {
        return v == 6 || v == 19 ? zac.a(context0, "common_google_play_services_resolution_required_text", zac.zaa(context0)) : zac.zad(context0, v);
    }

    @NonNull
    public static String zaf(Context context0, int v) {
        String s = v == 6 ? zac.b(context0, "common_google_play_services_resolution_required_title") : zac.zag(context0, v);
        return s == null ? context0.getResources().getString(com.google.android.gms.base.R.string.common_google_play_services_notification_ticker) : s;
    }

    @Nullable
    public static String zag(Context context0, int v) {
        Resources resources0 = context0.getResources();
        switch(v) {
            case 1: {
                return resources0.getString(com.google.android.gms.base.R.string.common_google_play_services_install_title);
            }
            case 2: {
                return resources0.getString(com.google.android.gms.base.R.string.common_google_play_services_update_title);
            }
            case 3: {
                return resources0.getString(com.google.android.gms.base.R.string.common_google_play_services_enable_title);
            }
            case 5: {
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return zac.b(context0, "common_google_play_services_invalid_account_title");
            }
            case 7: {
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return zac.b(context0, "common_google_play_services_network_error_title");
            }
            case 8: {
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            }
            case 9: {
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            }
            case 10: {
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            }
            case 11: {
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            }
            case 16: {
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            }
            case 17: {
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return zac.b(context0, "common_google_play_services_sign_in_failed_title");
            }
            case 4: 
            case 6: 
            case 18: {
                return null;
            }
            case 20: {
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return zac.b(context0, "common_google_play_services_restricted_profile_title");
            }
            default: {
                Log.e("GoogleApiAvailability", "Unexpected error code " + v);
                return null;
            }
        }
    }
}

