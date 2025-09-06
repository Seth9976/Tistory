package com.google.android.gms.common.wrappers;

import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Binder;
import android.os.Process;
import androidx.annotation.NonNull;
import androidx.core.util.Pair;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
public class PackageManagerWrapper {
    @NonNull
    protected final Context zza;

    public PackageManagerWrapper(@NonNull Context context0) {
        this.zza = context0;
    }

    @KeepForSdk
    public int checkCallingOrSelfPermission(@NonNull String s) {
        return this.zza.checkCallingOrSelfPermission(s);
    }

    @KeepForSdk
    public int checkPermission(@NonNull String s, @NonNull String s1) {
        return this.zza.getPackageManager().checkPermission(s, s1);
    }

    @NonNull
    @KeepForSdk
    public ApplicationInfo getApplicationInfo(@NonNull String s, int v) throws PackageManager.NameNotFoundException {
        return this.zza.getPackageManager().getApplicationInfo(s, v);
    }

    @NonNull
    @KeepForSdk
    public CharSequence getApplicationLabel(@NonNull String s) throws PackageManager.NameNotFoundException {
        return this.zza.getPackageManager().getApplicationLabel(this.zza.getPackageManager().getApplicationInfo(s, 0));
    }

    @NonNull
    @KeepForSdk
    public Pair getApplicationLabelAndIcon(@NonNull String s) throws PackageManager.NameNotFoundException {
        ApplicationInfo applicationInfo0 = this.zza.getPackageManager().getApplicationInfo(s, 0);
        return Pair.create(this.zza.getPackageManager().getApplicationLabel(applicationInfo0), this.zza.getPackageManager().getApplicationIcon(applicationInfo0));
    }

    @NonNull
    @KeepForSdk
    public PackageInfo getPackageInfo(@NonNull String s, int v) throws PackageManager.NameNotFoundException {
        return this.zza.getPackageManager().getPackageInfo(s, v);
    }

    @KeepForSdk
    public boolean isCallerInstantApp() {
        if(Binder.getCallingUid() == Process.myUid()) {
            return InstantApps.isInstantApp(this.zza);
        }
        String s = this.zza.getPackageManager().getNameForUid(Binder.getCallingUid());
        return s == null ? false : this.zza.getPackageManager().isInstantApp(s);
    }

    @TargetApi(19)
    public final boolean zza(int v, @NonNull String s) {
        try {
            AppOpsManager appOpsManager0 = (AppOpsManager)this.zza.getSystemService("appops");
            if(appOpsManager0 == null) {
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            }
            appOpsManager0.checkPackage(v, s);
            return true;
        }
        catch(SecurityException unused_ex) {
            return false;
        }
    }
}

