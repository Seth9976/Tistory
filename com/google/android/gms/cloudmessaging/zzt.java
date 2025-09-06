package com.google.android.gms.cloudmessaging;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.List;

public final class zzt {
    public final Context a;
    public int b;
    public int c;

    public zzt(Context context0) {
        this.c = 0;
        this.a = context0;
    }

    public final int zza() {
        PackageInfo packageInfo0;
        synchronized(this) {
            if(this.b == 0) {
                try {
                    packageInfo0 = Wrappers.packageManager(this.a).getPackageInfo("com.google.android.gms", 0);
                }
                catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
                    Log.w("Metadata", "Failed to find package " + packageManager$NameNotFoundException0);
                    packageInfo0 = null;
                }
                if(packageInfo0 != null) {
                    this.b = packageInfo0.versionCode;
                }
            }
            return this.b;
        }
    }

    public final int zzb() {
        synchronized(this) {
            int v1 = this.c;
            if(v1 != 0) {
                return v1;
            }
            PackageManager packageManager0 = this.a.getPackageManager();
            if(Wrappers.packageManager(this.a).checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                Log.e("Metadata", "Google Play services missing or without correct permission.");
                return 0;
            }
            Intent intent0 = new Intent("com.google.iid.TOKEN_REQUEST");
            intent0.setPackage("com.google.android.gms");
            List list0 = packageManager0.queryBroadcastReceivers(intent0, 0);
            if(list0 != null && list0.size() > 0) {
                this.c = 2;
                return 2;
            }
            Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
            this.c = 2;
            return 2;
        }
    }
}

