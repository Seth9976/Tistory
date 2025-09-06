package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.util.Log;
import androidx.compose.foundation.lazy.layout.e;
import com.google.firebase.FirebaseApp;
import java.io.Serializable;
import java.util.List;

public final class o {
    public int a;
    public int b;
    public final Object c;
    public Serializable d;
    public Object e;

    public o(Context context0) {
        this.b = 0;
        this.c = context0;
    }

    public o(e e0, List list0) {
        this.e = e0;
        this.c = list0;
        this.d = new List[list0.size()];
        if(list0.isEmpty()) {
            throw new IllegalArgumentException("NestedPrefetchController shouldn\'t be created with no states");
        }
    }

    public String a() {
        synchronized(this) {
            if(((String)this.d) == null) {
                this.e();
            }
            return (String)this.d;
        }
    }

    public static String b(FirebaseApp firebaseApp0) {
        String s = firebaseApp0.getOptions().getGcmSenderId();
        if(s != null) {
            return s;
        }
        String s1 = firebaseApp0.getOptions().getApplicationId();
        if(!s1.startsWith("1:")) {
            return s1;
        }
        String[] arr_s = s1.split(":");
        if(arr_s.length < 2) {
            return null;
        }
        String s2 = arr_s[1];
        return s2.isEmpty() ? null : s2;
    }

    public PackageInfo c(String s) {
        try {
            return ((Context)this.c).getPackageManager().getPackageInfo(s, 0);
        }
        catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
            Log.w("FirebaseMessaging", "Failed to find package " + packageManager$NameNotFoundException0);
            return null;
        }
    }

    public boolean d() {
        synchronized(this) {
            int v1 = this.b;
            if(v1 == 0) {
                PackageManager packageManager0 = ((Context)this.c).getPackageManager();
                if(packageManager0.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                    Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
                    return false;
                }
                Intent intent0 = new Intent("com.google.iid.TOKEN_REQUEST");
                intent0.setPackage("com.google.android.gms");
                List list0 = packageManager0.queryBroadcastReceivers(intent0, 0);
                if(list0 != null && list0.size() > 0) {
                    this.b = 2;
                    return true;
                }
                Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
                this.b = 2;
                v1 = 2;
            }
            return v1 != 0;
        }
    }

    public void e() {
        synchronized(this) {
            PackageInfo packageInfo0 = this.c("net.daum.android.tistoryapp");
            if(packageInfo0 != null) {
                this.d = Integer.toString(packageInfo0.versionCode);
                this.e = packageInfo0.versionName;
            }
        }
    }
}

