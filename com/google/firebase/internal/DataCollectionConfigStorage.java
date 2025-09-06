package com.google.firebase.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import androidx.annotation.VisibleForTesting;
import androidx.core.content.ContextCompat;
import com.google.firebase.DataCollectionDefaultChange;
import com.google.firebase.events.Event;
import com.google.firebase.events.Publisher;

public class DataCollectionConfigStorage {
    @VisibleForTesting
    public static final String DATA_COLLECTION_DEFAULT_ENABLED = "firebase_data_collection_default_enabled";
    public final Context a;
    public final SharedPreferences b;
    public final Publisher c;
    public boolean d;

    public DataCollectionConfigStorage(Context context0, String s, Publisher publisher0) {
        Context context1 = ContextCompat.createDeviceProtectedStorageContext(context0);
        this.a = context1;
        SharedPreferences sharedPreferences0 = context1.getSharedPreferences("com.google.firebase.common.prefs:" + s, 0);
        this.b = sharedPreferences0;
        this.c = publisher0;
        this.d = sharedPreferences0.contains("firebase_data_collection_default_enabled") ? sharedPreferences0.getBoolean("firebase_data_collection_default_enabled", true) : this.a();
    }

    public final boolean a() {
        try {
            PackageManager packageManager0 = this.a.getPackageManager();
            if(packageManager0 != null) {
                ApplicationInfo applicationInfo0 = packageManager0.getApplicationInfo("net.daum.android.tistoryapp", 0x80);
                return applicationInfo0 == null || (applicationInfo0.metaData == null || !applicationInfo0.metaData.containsKey("firebase_data_collection_default_enabled")) ? true : applicationInfo0.metaData.getBoolean("firebase_data_collection_default_enabled");
            }
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
        }
        return true;
    }

    public final void b(boolean z) {
        synchronized(this) {
            if(this.d != z) {
                this.d = z;
                DataCollectionDefaultChange dataCollectionDefaultChange0 = new DataCollectionDefaultChange(z);
                Event event0 = new Event(DataCollectionDefaultChange.class, dataCollectionDefaultChange0);
                this.c.publish(event0);
            }
        }
    }

    public boolean isEnabled() {
        synchronized(this) {
        }
        return this.d;
    }

    public void setEnabled(Boolean boolean0) {
        synchronized(this) {
            if(boolean0 == null) {
                this.b.edit().remove("firebase_data_collection_default_enabled").apply();
                this.b(this.a());
            }
            else {
                boolean z = Boolean.TRUE.equals(boolean0);
                this.b.edit().putBoolean("firebase_data_collection_default_enabled", z).apply();
                this.b(z);
            }
        }
    }
}

