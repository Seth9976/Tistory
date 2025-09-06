package com.google.firebase.crashlytics.internal.settings;

import android.text.TextUtils;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.network.HttpGetRequest;
import com.google.firebase.crashlytics.internal.network.HttpRequestFactory;
import com.google.firebase.crashlytics.internal.network.HttpResponse;
import java.io.IOException;
import java.util.HashMap;
import org.json.JSONObject;

public final class b implements SettingsSpiCall {
    public final String a;
    public final HttpRequestFactory b;
    public final Logger c;

    public b(String s, HttpRequestFactory httpRequestFactory0) {
        this.c = Logger.getLogger();
        this.b = httpRequestFactory0;
        this.a = s;
    }

    public static void a(HttpGetRequest httpGetRequest0, d d0) {
        b.b(httpGetRequest0, "X-CRASHLYTICS-GOOGLE-APP-ID", d0.a);
        b.b(httpGetRequest0, "X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        b.b(httpGetRequest0, "X-CRASHLYTICS-API-CLIENT-VERSION", "18.3.2");
        b.b(httpGetRequest0, "Accept", "application/json");
        b.b(httpGetRequest0, "X-CRASHLYTICS-DEVICE-MODEL", d0.b);
        b.b(httpGetRequest0, "X-CRASHLYTICS-OS-BUILD-VERSION", d0.c);
        b.b(httpGetRequest0, "X-CRASHLYTICS-OS-DISPLAY-VERSION", d0.d);
        b.b(httpGetRequest0, "X-CRASHLYTICS-INSTALLATION-ID", d0.e.getCrashlyticsInstallId());
    }

    public static void b(HttpGetRequest httpGetRequest0, String s, String s1) {
        if(s1 != null) {
            httpGetRequest0.header(s, s1);
        }
    }

    public static HashMap c(d d0) {
        HashMap hashMap0 = new HashMap();
        hashMap0.put("build_version", d0.h);
        hashMap0.put("display_version", d0.g);
        hashMap0.put("source", Integer.toString(d0.i));
        String s = d0.f;
        if(!TextUtils.isEmpty(s)) {
            hashMap0.put("instance", s);
        }
        return hashMap0;
    }

    public final JSONObject d(HttpResponse httpResponse0) {
        String s1;
        int v = httpResponse0.code();
        Logger logger0 = this.c;
        logger0.v("Settings response code was: " + v);
        String s = this.a;
        if(v != 200 && v != 201 && v != 202 && v != 203) {
            logger0.e("Settings request failed; (status: " + v + ") from " + s);
            return null;
        }
        try {
            s1 = httpResponse0.body();
            return new JSONObject(s1);
        }
        catch(Exception exception0) {
            logger0.w("Failed to parse settings JSON from " + s, exception0);
            logger0.w("Settings response " + s1);
            return null;
        }
    }

    @Override  // com.google.firebase.crashlytics.internal.settings.SettingsSpiCall
    public final JSONObject invoke(d d0, boolean z) {
        String s = this.a;
        Logger logger0 = this.c;
        if(z) {
            try {
                HashMap hashMap0 = b.c(d0);
                HttpGetRequest httpGetRequest0 = this.b.buildHttpGetRequest(s, hashMap0).header("User-Agent", "Crashlytics Android SDK/18.3.2").header("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
                b.a(httpGetRequest0, d0);
                logger0.d("Requesting settings from " + s);
                logger0.v("Settings query params were: " + hashMap0);
                return this.d(httpGetRequest0.execute());
            }
            catch(IOException iOException0) {
                logger0.e("Settings request failed.", iOException0);
                return null;
            }
        }
        throw new RuntimeException("An invalid data collection token was used.");
    }
}

