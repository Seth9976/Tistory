package com.google.android.gms.common.wrappers;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
public class InstantApps {
    public static Context a;
    public static Boolean b;

    @KeepForSdk
    public static boolean isInstantApp(@NonNull Context context0) {
        synchronized(InstantApps.class) {
            Context context1 = context0.getApplicationContext();
            Context context2 = InstantApps.a;
            if(context2 != null) {
                Boolean boolean0 = InstantApps.b;
                if(boolean0 != null && context2 == context1) {
                    return boolean0.booleanValue();
                }
            }
            InstantApps.b = Boolean.valueOf(context1.getPackageManager().isInstantApp());
            InstantApps.a = context1;
            return InstantApps.b.booleanValue();
        }
    }
}

