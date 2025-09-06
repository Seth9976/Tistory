package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Process;
import android.os.UserManager;
import android.util.Log;

public final class zzhb {
    public static UserManager a;
    public static volatile boolean b;

    static {
        zzhb.b = false;
    }

    public static boolean zza(Context context0) {
        boolean z;
        if(!zzhb.b) {
            synchronized(zzhb.class) {
                if(zzhb.b) {
                    return false;
                }
                int v1 = 1;
                while(true) {
                    if(zzhb.a == null) {
                        zzhb.a = (UserManager)context0.getSystemService(UserManager.class);
                    }
                    UserManager userManager0 = zzhb.a;
                    if(userManager0 == null) {
                        z = true;
                        goto label_28;
                    }
                    try {
                        if(!userManager0.isUserUnlocked() && userManager0.isUserRunning(Process.myUserHandle())) {
                            goto label_25;
                        }
                        break;
                    }
                    catch(NullPointerException nullPointerException0) {
                        Log.w("DirectBootUtils", "Failed to check if user is unlocked.", nullPointerException0);
                        zzhb.a = null;
                        ++v1;
                    }
                }
                z = true;
                goto label_26;
            label_25:
                z = false;
            label_26:
                if(z) {
                    zzhb.a = null;
                }
            label_28:
                if(z) {
                    zzhb.b = true;
                }
                return !z;
            }
        }
        return false;
    }

    public static boolean zzb() [...] // Inlined contents
}

