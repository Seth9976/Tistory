package androidx.core.content;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build.VERSION;
import android.util.Log;
import androidx.activity.h;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.concurrent.futures.ResolvableFuture;
import androidx.core.os.UserManagerCompat;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.Executors;

public final class PackageManagerCompat {
    @RestrictTo({Scope.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    public @interface UnusedAppRestrictionsStatus {
    }

    @SuppressLint({"ActionValue"})
    public static final String ACTION_PERMISSION_REVOCATION_SETTINGS = "android.intent.action.AUTO_REVOKE_PERMISSIONS";
    @RestrictTo({Scope.LIBRARY})
    public static final String LOG_TAG = "PackageManagerCompat";

    // 去混淆评级： 中等(80)
    @RestrictTo({Scope.LIBRARY})
    public static boolean areUnusedAppRestrictionsAvailable(@NonNull PackageManager packageManager0) {
        return Build.VERSION.SDK_INT >= 30 || Build.VERSION.SDK_INT < 30 && PackageManagerCompat.getPermissionRevocationVerifierApp(packageManager0) != null;
    }

    @Nullable
    @RestrictTo({Scope.LIBRARY})
    public static String getPermissionRevocationVerifierApp(@NonNull PackageManager packageManager0) {
        String s = null;
        for(Object object0: packageManager0.queryIntentActivities(new Intent("android.intent.action.AUTO_REVOKE_PERMISSIONS").setData(Uri.fromParts("package", "com.example", null)), 0)) {
            String s1 = ((ResolveInfo)object0).activityInfo.packageName;
            if(packageManager0.checkPermission("android.permission.PACKAGE_VERIFICATION_AGENT", s1) == 0) {
                if(s != null) {
                    return s;
                }
                s = s1;
            }
        }
        return s;
    }

    @NonNull
    public static ListenableFuture getUnusedAppRestrictionsStatus(@NonNull Context context0) {
        ResolvableFuture resolvableFuture0 = ResolvableFuture.create();
        if(!UserManagerCompat.isUserUnlocked(context0)) {
            resolvableFuture0.set(0);
            Log.e("PackageManagerCompat", "User is in locked direct boot mode");
            return resolvableFuture0;
        }
        if(!PackageManagerCompat.areUnusedAppRestrictionsAvailable(context0.getPackageManager())) {
            resolvableFuture0.set(1);
            return resolvableFuture0;
        }
        int v = Build.VERSION.SDK_INT;
        int v1 = 2;
        if(v >= 0x1F) {
            if(r.a(context0)) {
                resolvableFuture0.set(5);
                return resolvableFuture0;
            }
            resolvableFuture0.set(2);
            return resolvableFuture0;
        }
        if(v == 30) {
            if(r.a(context0)) {
                v1 = 4;
            }
            resolvableFuture0.set(v1);
            return resolvableFuture0;
        }
        v v2 = new v(context0);
        resolvableFuture0.addListener(new h(v2, 7), Executors.newSingleThreadExecutor());
        if(v2.d) {
            throw new IllegalStateException("Each UnusedAppRestrictionsBackportServiceConnection can only be bound once.");
        }
        v2.d = true;
        v2.b = resolvableFuture0;
        context0.bindService(new Intent("android.support.unusedapprestrictions.action.CustomUnusedAppRestrictionsBackportService").setPackage(PackageManagerCompat.getPermissionRevocationVerifierApp(context0.getPackageManager())), v2, 1);
        return resolvableFuture0;
    }
}

