package j3;

import android.annotation.SuppressLint;
import android.telephony.TelephonyManager;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresPermission;

public abstract class b {
    @SuppressLint({"MissingPermission"})
    @DoNotInline
    @Nullable
    @RequiresPermission("android.permission.READ_PHONE_STATE")
    public static String a(TelephonyManager telephonyManager0) {
        return telephonyManager0.getImei();
    }
}

