package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import androidx.annotation.Nullable;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.FirebaseApp;
import com.google.firebase.crashlytics.internal.Logger;
import java.util.concurrent.Executor;

public class DataCollectionArbiter {
    public final SharedPreferences a;
    public final FirebaseApp b;
    public final Object c;
    public TaskCompletionSource d;
    public boolean e;
    public boolean f;
    public Boolean g;
    public final TaskCompletionSource h;

    public DataCollectionArbiter(FirebaseApp firebaseApp0) {
        Boolean boolean0;
        Object object0 = new Object();
        this.c = object0;
        this.d = new TaskCompletionSource();
        this.e = false;
        this.f = false;
        this.h = new TaskCompletionSource();
        Context context0 = firebaseApp0.getApplicationContext();
        this.b = firebaseApp0;
        SharedPreferences sharedPreferences0 = CommonUtils.getSharedPrefs(context0);
        this.a = sharedPreferences0;
        if(sharedPreferences0.contains("firebase_crashlytics_collection_enabled")) {
            this.f = false;
            boolean0 = Boolean.valueOf(sharedPreferences0.getBoolean("firebase_crashlytics_collection_enabled", true));
        }
        else {
            boolean0 = null;
        }
        if(boolean0 == null) {
            boolean0 = this.a(context0);
        }
        this.g = boolean0;
        synchronized(object0) {
            if(this.isAutomaticDataCollectionEnabled()) {
                this.d.trySetResult(null);
                this.e = true;
            }
        }
    }

    public final Boolean a(Context context0) {
        Boolean boolean0;
        try {
            PackageManager packageManager0 = context0.getPackageManager();
            if(packageManager0 == null) {
                goto label_12;
            }
            else {
                ApplicationInfo applicationInfo0 = packageManager0.getApplicationInfo("net.daum.android.tistoryapp", 0x80);
                boolean0 = applicationInfo0 == null || (applicationInfo0.metaData == null || !applicationInfo0.metaData.containsKey("firebase_crashlytics_collection_enabled")) ? null : Boolean.valueOf(applicationInfo0.metaData.getBoolean("firebase_crashlytics_collection_enabled"));
            }
        }
        catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
            Logger.getLogger().e("Could not read data collection permission from manifest", packageManager$NameNotFoundException0);
            boolean0 = null;
        }
        goto label_13;
    label_12:
        boolean0 = null;
    label_13:
        if(boolean0 == null) {
            this.f = false;
            return null;
        }
        this.f = true;
        return Boolean.valueOf(Boolean.TRUE.equals(boolean0));
    }

    public void grantDataCollectionPermission(boolean z) {
        if(!z) {
            throw new IllegalStateException("An invalid data collection token was used.");
        }
        this.h.trySetResult(null);
    }

    public boolean isAutomaticDataCollectionEnabled() {
        String s;
        synchronized(this) {
            Boolean boolean0 = this.g;
            boolean z = boolean0 == null ? this.b.isDataCollectionDefaultEnabled() : boolean0.booleanValue();
            if(this.g == null) {
                s = "global Firebase setting";
            }
            else {
                s = this.f ? "firebase_crashlytics_collection_enabled manifest flag" : "API";
            }
            Logger.getLogger().d("Crashlytics automatic data collection " + (z ? "ENABLED" : "DISABLED") + " by " + s + ".");
            return z;
        }
    }

    public void setCrashlyticsDataCollectionEnabled(@Nullable Boolean boolean0) {
        synchronized(this) {
            if(boolean0 != null) {
                this.f = false;
            }
            this.g = boolean0 == null ? this.a(this.b.getApplicationContext()) : boolean0;
            SharedPreferences.Editor sharedPreferences$Editor0 = this.a.edit();
            if(boolean0 == null) {
                sharedPreferences$Editor0.remove("firebase_crashlytics_collection_enabled");
            }
            else {
                sharedPreferences$Editor0.putBoolean("firebase_crashlytics_collection_enabled", boolean0.booleanValue());
            }
            sharedPreferences$Editor0.apply();
            Object object0 = this.c;
            synchronized(object0) {
                if(!this.isAutomaticDataCollectionEnabled()) {
                    if(this.e) {
                        this.d = new TaskCompletionSource();
                        this.e = false;
                    }
                }
                else if(!this.e) {
                    this.d.trySetResult(null);
                    this.e = true;
                }
            }
        }
    }

    public Task waitForAutomaticDataCollectionEnabled() {
        synchronized(this.c) {
        }
        return this.d.getTask();
    }

    public Task waitForDataCollectionPermission(Executor executor0) {
        Task task0 = this.waitForAutomaticDataCollectionEnabled();
        return Utils.race(executor0, this.h.getTask(), task0);
    }
}

