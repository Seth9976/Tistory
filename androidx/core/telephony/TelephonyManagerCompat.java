package androidx.core.telephony;

import android.annotation.SuppressLint;
import android.os.Build.VERSION;
import android.telephony.TelephonyManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresPermission;
import j3.b;
import j3.c;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TelephonyManagerCompat {
    public static Method a;

    @SuppressLint({"MissingPermission"})
    @Nullable
    @RequiresPermission("android.permission.READ_PHONE_STATE")
    public static String getImei(@NonNull TelephonyManager telephonyManager0) {
        return b.a(telephonyManager0);
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    public static int getSubscriptionId(@NonNull TelephonyManager telephonyManager0) {
        if(Build.VERSION.SDK_INT >= 30) {
            return c.a(telephonyManager0);
        }
        try {
            if(TelephonyManagerCompat.a == null) {
                Method method0 = TelephonyManager.class.getDeclaredMethod("getSubId", null);
                TelephonyManagerCompat.a = method0;
                method0.setAccessible(true);
            }
            Integer integer0 = (Integer)TelephonyManagerCompat.a.invoke(telephonyManager0, null);
            if(integer0 != null && ((int)integer0) != -1) {
                return (int)integer0;
            }
        }
        catch(InvocationTargetException | IllegalAccessException | NoSuchMethodException unused_ex) {
        }
        return 0x7FFFFFFF;
    }
}

