package com.google.android.gms.internal.base;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;

public final class zal {
    public static final int zaa;

    static {
        zal.zaa = Build.VERSION.SDK_INT >= 0x1F || Build.VERSION.SDK_INT >= 30 && (Build.VERSION.CODENAME.length() == 1 && Build.VERSION.CODENAME.charAt(0) >= 83 && Build.VERSION.CODENAME.charAt(0) <= 90) ? 0x2000000 : 0;
    }

    public static PendingIntent zaa(Context context0, int v, Intent intent0, int v1) {
        return PendingIntent.getActivity(context0, v, intent0, v1);
    }
}

