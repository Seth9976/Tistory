package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import com.google.firebase.DataCollectionDefaultChange;
import com.google.firebase.events.Subscriber;

public final class m {
    public final Subscriber a;
    public boolean b;
    public l c;
    public Boolean d;
    public final FirebaseMessaging e;

    public m(FirebaseMessaging firebaseMessaging0, Subscriber subscriber0) {
        this.e = firebaseMessaging0;
        this.a = subscriber0;
    }

    public final void a() {
        synchronized(this) {
            if(this.b) {
                return;
            }
            Boolean boolean0 = this.c();
            this.d = boolean0;
            if(boolean0 == null) {
                l l0 = new l(this);
                this.c = l0;
                this.a.subscribe(DataCollectionDefaultChange.class, l0);
            }
            this.b = true;
        }
    }

    public final boolean b() {
        synchronized(this) {
            this.a();
            Boolean boolean0 = this.d;
            return boolean0 == null ? this.e.a.isDataCollectionDefaultEnabled() : boolean0.booleanValue();
        }
    }

    public final Boolean c() {
        Context context0 = this.e.a.getApplicationContext();
        SharedPreferences sharedPreferences0 = context0.getSharedPreferences("com.google.firebase.messaging", 0);
        if(sharedPreferences0.contains("auto_init")) {
            return Boolean.valueOf(sharedPreferences0.getBoolean("auto_init", false));
        }
        try {
            PackageManager packageManager0 = context0.getPackageManager();
            if(packageManager0 != null) {
                ApplicationInfo applicationInfo0 = packageManager0.getApplicationInfo("net.daum.android.tistoryapp", 0x80);
                return applicationInfo0 == null || (applicationInfo0.metaData == null || !applicationInfo0.metaData.containsKey("firebase_messaging_auto_init_enabled")) ? null : Boolean.valueOf(applicationInfo0.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            }
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
        }
        return null;
    }
}

