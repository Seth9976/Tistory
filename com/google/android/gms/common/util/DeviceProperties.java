package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
public final class DeviceProperties {
    public static Boolean a;
    public static Boolean b;
    public static Boolean c;
    public static Boolean d;
    public static Boolean e;
    public static Boolean f;
    public static Boolean g;
    public static Boolean h;
    public static Boolean i;
    public static Boolean j;
    public static Boolean k;
    public static Boolean l;

    @KeepForSdk
    public static boolean isAuto(@NonNull Context context0) {
        boolean z = false;
        PackageManager packageManager0 = context0.getPackageManager();
        if(DeviceProperties.i == null) {
            if(packageManager0.hasSystemFeature("android.hardware.type.automotive")) {
                z = true;
            }
            DeviceProperties.i = Boolean.valueOf(z);
        }
        return DeviceProperties.i.booleanValue();
    }

    @KeepForSdk
    public static boolean isBstar(@NonNull Context context0) {
        boolean z = false;
        if(DeviceProperties.l == null) {
            if(context0.getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE")) {
                z = true;
            }
            DeviceProperties.l = Boolean.valueOf(z);
        }
        return DeviceProperties.l.booleanValue();
    }

    @KeepForSdk
    public static boolean isLatchsky(@NonNull Context context0) {
        if(DeviceProperties.f == null) {
            PackageManager packageManager0 = context0.getPackageManager();
            DeviceProperties.f = Boolean.valueOf(packageManager0.hasSystemFeature("com.google.android.feature.services_updater") && packageManager0.hasSystemFeature("cn.google.services"));
        }
        return DeviceProperties.f.booleanValue();
    }

    @KeepForSdk
    public static boolean isPhone(@NonNull Context context0) {
        boolean z = false;
        if(DeviceProperties.a == null) {
            if(!DeviceProperties.isTablet(context0) && !DeviceProperties.isWearable(context0) && !DeviceProperties.zzb(context0)) {
                if(DeviceProperties.h == null) {
                    DeviceProperties.h = Boolean.valueOf(context0.getPackageManager().hasSystemFeature("org.chromium.arc"));
                }
                if(!DeviceProperties.h.booleanValue() && !DeviceProperties.isAuto(context0) && !DeviceProperties.isTv(context0)) {
                    if(DeviceProperties.k == null) {
                        DeviceProperties.k = Boolean.valueOf(context0.getPackageManager().hasSystemFeature("com.google.android.feature.AMATI_EXPERIENCE"));
                    }
                    if(!DeviceProperties.k.booleanValue() && !DeviceProperties.isBstar(context0)) {
                        z = true;
                    }
                }
            }
            DeviceProperties.a = Boolean.valueOf(z);
        }
        return DeviceProperties.a.booleanValue();
    }

    @KeepForSdk
    public static boolean isSevenInchTablet(@NonNull Context context0) {
        return DeviceProperties.zzc(context0.getResources());
    }

    @TargetApi(21)
    @KeepForSdk
    public static boolean isSidewinder(@NonNull Context context0) {
        return DeviceProperties.zza(context0);
    }

    @KeepForSdk
    public static boolean isTablet(@NonNull Context context0) {
        return DeviceProperties.isTablet(context0.getResources());
    }

    @KeepForSdk
    public static boolean isTablet(@NonNull Resources resources0) {
        boolean z = false;
        if(resources0 == null) {
            return false;
        }
        if(DeviceProperties.b == null) {
            if((resources0.getConfiguration().screenLayout & 15) > 3) {
                z = true;
            }
            else if(DeviceProperties.zzc(resources0)) {
                z = true;
            }
            DeviceProperties.b = Boolean.valueOf(z);
        }
        return DeviceProperties.b.booleanValue();
    }

    @KeepForSdk
    public static boolean isTv(@NonNull Context context0) {
        boolean z = true;
        PackageManager packageManager0 = context0.getPackageManager();
        if(DeviceProperties.j == null) {
            if(!packageManager0.hasSystemFeature("com.google.android.tv") && !packageManager0.hasSystemFeature("android.hardware.type.television") && !packageManager0.hasSystemFeature("android.software.leanback")) {
                z = false;
            }
            DeviceProperties.j = Boolean.valueOf(z);
        }
        return DeviceProperties.j.booleanValue();
    }

    @KeepForSdk
    public static boolean isUserBuild() {
        return "user".equals(Build.TYPE);
    }

    @TargetApi(20)
    @KeepForSdk
    public static boolean isWearable(@NonNull Context context0) {
        boolean z = false;
        PackageManager packageManager0 = context0.getPackageManager();
        if(DeviceProperties.d == null) {
            if(packageManager0.hasSystemFeature("android.hardware.type.watch")) {
                z = true;
            }
            DeviceProperties.d = Boolean.valueOf(z);
        }
        return DeviceProperties.d.booleanValue();
    }

    // 去混淆评级： 低(25)
    @TargetApi(26)
    @KeepForSdk
    public static boolean isWearableWithoutPlayStore(@NonNull Context context0) {
        boolean z = !DeviceProperties.isWearable(context0);
        return DeviceProperties.zza(context0);
    }

    @TargetApi(21)
    public static boolean zza(@NonNull Context context0) {
        boolean z = false;
        if(DeviceProperties.e == null) {
            if(context0.getPackageManager().hasSystemFeature("cn.google")) {
                z = true;
            }
            DeviceProperties.e = Boolean.valueOf(z);
        }
        return DeviceProperties.e.booleanValue();
    }

    public static boolean zzb(@NonNull Context context0) {
        boolean z = true;
        if(DeviceProperties.g == null) {
            if(!context0.getPackageManager().hasSystemFeature("android.hardware.type.iot") && !context0.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                z = false;
            }
            DeviceProperties.g = Boolean.valueOf(z);
        }
        return DeviceProperties.g.booleanValue();
    }

    public static boolean zzc(@NonNull Resources resources0) {
        boolean z = false;
        if(resources0 == null) {
            return false;
        }
        if(DeviceProperties.c == null) {
            Configuration configuration0 = resources0.getConfiguration();
            if((configuration0.screenLayout & 15) <= 3 && configuration0.smallestScreenWidthDp >= 600) {
                z = true;
            }
            DeviceProperties.c = Boolean.valueOf(z);
        }
        return DeviceProperties.c.booleanValue();
    }
}

