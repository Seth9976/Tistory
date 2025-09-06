package com.google.firebase.crashlytics.internal.common;

import a5.b;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build.VERSION;
import android.os.Build;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.installations.FirebaseInstallationsApi;
import java.util.regex.Pattern;

public class IdManager implements InstallIdProvider {
    public static final String DEFAULT_VERSION_NAME = "0.0";
    public final g a;
    public final Context b;
    public final String c;
    public final FirebaseInstallationsApi d;
    public final DataCollectionArbiter e;
    public String f;
    public static final Pattern g;
    public static final String h;

    static {
        IdManager.g = Pattern.compile("[^\\p{Alnum}]");
        IdManager.h = "\\Q/\\E";
    }

    public IdManager(Context context0, String s, FirebaseInstallationsApi firebaseInstallationsApi0, DataCollectionArbiter dataCollectionArbiter0) {
        if(context0 == null) {
            throw new IllegalArgumentException("appContext must not be null");
        }
        if(s == null) {
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        this.b = context0;
        this.c = s;
        this.d = firebaseInstallationsApi0;
        this.e = dataCollectionArbiter0;
        this.a = new g();
    }

    public final String a(SharedPreferences sharedPreferences0, String s) {
        synchronized(this) {
            Logger.getLogger().v("Created new Crashlytics installation ID: 47906e463f9e4f28adb17b126e01a8e2 for FID: " + s);
            sharedPreferences0.edit().putString("crashlytics.installation.id", "47906e463f9e4f28adb17b126e01a8e2").putString("firebase.installation.id", s).apply();
            return "47906e463f9e4f28adb17b126e01a8e2";
        }
    }

    // 去混淆评级： 低(40)
    public static String b() [...] // 潜在的解密器

    public String getAppIdentifier() {
        return this.c;
    }

    @Override  // com.google.firebase.crashlytics.internal.common.InstallIdProvider
    @NonNull
    public String getCrashlyticsInstallId() {
        String s2;
        synchronized(this) {
            String s = this.f;
            if(s != null) {
                return s;
            }
            Logger.getLogger().v("Determining Crashlytics installation ID...");
            SharedPreferences sharedPreferences0 = CommonUtils.getSharedPrefs(this.b);
            String s1 = sharedPreferences0.getString("firebase.installation.id", null);
            Logger.getLogger().v("Cached Firebase Installation ID: " + s1);
            if(this.e.isAutomaticDataCollectionEnabled()) {
                Task task0 = this.d.getId();
                try {
                    s2 = (String)Utils.awaitEvenIfOnMainThread(task0);
                }
                catch(Exception exception0) {
                    Logger.getLogger().w("Failed to retrieve Firebase Installations ID.", exception0);
                    s2 = null;
                }
                Logger.getLogger().v("Fetched Firebase Installation ID: " + s2);
                if(s2 == null) {
                    s2 = s1 == null ? "SYN_d4838d47-82c1-40db-a393-a16a907e1e12" : s1;
                }
                this.f = s2.equals(s1) ? sharedPreferences0.getString("crashlytics.installation.id", null) : this.a(sharedPreferences0, s2);
            }
            else if(s1 == null || !s1.startsWith("SYN_")) {
                this.f = this.a(sharedPreferences0, "SYN_d4838d47-82c1-40db-a393-a16a907e1e12");
            }
            else {
                this.f = sharedPreferences0.getString("crashlytics.installation.id", null);
            }
            if(this.f == null) {
                Logger.getLogger().w("Unable to determine Crashlytics Install Id, creating a new one.");
                this.f = this.a(sharedPreferences0, "SYN_d4838d47-82c1-40db-a393-a16a907e1e12");
            }
            Logger.getLogger().v("Crashlytics installation ID: " + this.f);
            return this.f;
        }
    }

    public String getInstallerPackageName() {
        g g0 = this.a;
        Context context0 = this.b;
        synchronized(g0) {
            if(((String)g0.b) == null) {
                String s = context0.getPackageManager().getInstallerPackageName("net.daum.android.tistoryapp");
                if(s == null) {
                    s = "";
                }
                g0.b = s;
            }
            return "".equals(((String)g0.b)) ? null : ((String)g0.b);
        }
    }

    // 去混淆评级： 低(40)
    public String getModelName() {
        return b.m(Build.MANUFACTURER.replaceAll("\\Q/\\E", ""), "/", Build.MODEL.replaceAll("\\Q/\\E", ""));
    }

    // 去混淆评级： 低(20)
    public String getOsBuildVersionString() {
        return Build.VERSION.INCREMENTAL.replaceAll("\\Q/\\E", "");
    }

    public String getOsDisplayVersionString() {
        return Build.VERSION.RELEASE.replaceAll("\\Q/\\E", "");
    }
}

