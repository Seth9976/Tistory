package com.google.android.gms.common;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.HideFirstParty;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.common.zzd;

@KeepForSdk
@ShowFirstParty
public class GoogleApiAvailabilityLight {
    @NonNull
    @KeepForSdk
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
    @KeepForSdk
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = 0;
    @NonNull
    @KeepForSdk
    public static final String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";
    public static final GoogleApiAvailabilityLight a;

    static {
        GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE = GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
        GoogleApiAvailabilityLight.a = new GoogleApiAvailabilityLight();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @KeepForSdk
    public void cancelAvailabilityErrorNotifications(@NonNull Context context0) {
        GooglePlayServicesUtilLight.cancelAvailabilityErrorNotifications(context0);
    }

    @KeepForSdk
    @ShowFirstParty
    public int getApkVersion(@NonNull Context context0) {
        return GooglePlayServicesUtilLight.getApkVersion(context0);
    }

    @KeepForSdk
    @ShowFirstParty
    public int getClientVersion(@NonNull Context context0) {
        return GooglePlayServicesUtilLight.getClientVersion(context0);
    }

    @Nullable
    @KeepForSdk
    @ShowFirstParty
    @Deprecated
    public Intent getErrorResolutionIntent(int v) {
        return this.getErrorResolutionIntent(null, v, null);
    }

    @Nullable
    @KeepForSdk
    @ShowFirstParty
    public Intent getErrorResolutionIntent(@Nullable Context context0, int v, @Nullable String s) {
        switch(v) {
            case 1: 
            case 2: {
                if(context0 != null && DeviceProperties.isWearableWithoutPlayStore(context0)) {
                    return zzt.zza();
                }
                StringBuilder stringBuilder0 = new StringBuilder("gcore_");
                stringBuilder0.append(GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
                stringBuilder0.append("-");
                if(!TextUtils.isEmpty(s)) {
                    stringBuilder0.append(s);
                }
                stringBuilder0.append("-");
                if(context0 != null) {
                    stringBuilder0.append("net.daum.android.tistoryapp");
                }
                stringBuilder0.append("-");
                if(context0 != null) {
                    try {
                        stringBuilder0.append(Wrappers.packageManager(context0).getPackageInfo("net.daum.android.tistoryapp", 0).versionCode);
                    }
                    catch(PackageManager.NameNotFoundException unused_ex) {
                    }
                }
                return zzt.zzb("com.google.android.gms", stringBuilder0.toString());
            }
            case 3: {
                return zzt.zzc("com.google.android.gms");
            }
            default: {
                return null;
            }
        }
    }

    @Nullable
    @KeepForSdk
    public PendingIntent getErrorResolutionPendingIntent(@NonNull Context context0, int v, int v1) {
        return this.getErrorResolutionPendingIntent(context0, v, v1, null);
    }

    @Nullable
    @KeepForSdk
    @ShowFirstParty
    public PendingIntent getErrorResolutionPendingIntent(@NonNull Context context0, int v, int v1, @Nullable String s) {
        Intent intent0 = this.getErrorResolutionIntent(context0, v, s);
        return intent0 == null ? null : PendingIntent.getActivity(context0, v1, intent0, zzd.zza | 0x8000000);
    }

    @NonNull
    @KeepForSdk
    public String getErrorString(int v) {
        return GooglePlayServicesUtilLight.getErrorString(v);
    }

    @NonNull
    @KeepForSdk
    public static GoogleApiAvailabilityLight getInstance() {
        return GoogleApiAvailabilityLight.a;
    }

    @KeepForSdk
    @HideFirstParty
    public int isGooglePlayServicesAvailable(@NonNull Context context0) {
        return this.isGooglePlayServicesAvailable(context0, GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }

    @KeepForSdk
    public int isGooglePlayServicesAvailable(@NonNull Context context0, int v) {
        int v1 = GooglePlayServicesUtilLight.isGooglePlayServicesAvailable(context0, v);
        return GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(context0, v1) ? 18 : v1;
    }

    @KeepForSdk
    @ShowFirstParty
    public boolean isPlayServicesPossiblyUpdating(@NonNull Context context0, int v) {
        return GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(context0, v);
    }

    @KeepForSdk
    @ShowFirstParty
    public boolean isPlayStorePossiblyUpdating(@NonNull Context context0, int v) {
        return GooglePlayServicesUtilLight.isPlayStorePossiblyUpdating(context0, v);
    }

    @KeepForSdk
    public boolean isUninstalledAppPossiblyUpdating(@NonNull Context context0, @NonNull String s) {
        return GooglePlayServicesUtilLight.a(context0, s);
    }

    @KeepForSdk
    public boolean isUserResolvableError(int v) {
        return GooglePlayServicesUtilLight.isUserRecoverableError(v);
    }

    @KeepForSdk
    public void verifyGooglePlayServicesIsAvailable(@NonNull Context context0, int v) throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException {
        GooglePlayServicesUtilLight.ensurePlayServicesAvailable(context0, v);
    }
}

