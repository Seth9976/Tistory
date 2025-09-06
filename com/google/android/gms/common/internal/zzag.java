package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;

public final class zzag {
    public static final Object a;
    public static boolean b;
    public static String c;
    public static int d;

    static {
        zzag.a = new Object();
    }

    public static void a(Context context0) {
        synchronized(zzag.a) {
            if(zzag.b) {
                return;
            }
            zzag.b = true;
            PackageManagerWrapper packageManagerWrapper0 = Wrappers.packageManager(context0);
            try {
                Bundle bundle0 = packageManagerWrapper0.getApplicationInfo("net.daum.android.tistoryapp", 0x80).metaData;
                if(bundle0 == null) {
                    return;
                }
                zzag.c = bundle0.getString("com.google.app.id");
                zzag.d = bundle0.getInt("com.google.android.gms.version");
            }
            catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
                Log.wtf("MetadataValueReader", "This should never happen.", packageManager$NameNotFoundException0);
            }
        }
    }

    public static int zza(Context context0) {
        zzag.a(context0);
        return zzag.d;
    }

    @Nullable
    public static String zzb(Context context0) {
        zzag.a(context0);
        return zzag.c;
    }
}

