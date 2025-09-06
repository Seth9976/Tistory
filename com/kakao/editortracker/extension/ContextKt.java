package com.kakao.editortracker.extension;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010\u000E\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A\u0016\u0010\u0000\u001A\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u0001H\u0000\u001A\u000E\u0010\u0004\u001A\u0004\u0018\u00010\u0001*\u00020\u0002H\u0000¨\u0006\u0005"}, d2 = {"getMetadata", "", "Landroid/content/Context;", "key", "getVersionName", "editortracker_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class ContextKt {
    @Nullable
    public static final String getMetadata(@NotNull Context context0, @NotNull String s) {
        Intrinsics.checkNotNullParameter(context0, "<this>");
        Intrinsics.checkNotNullParameter(s, "key");
        try {
            PackageManager packageManager0 = context0.getPackageManager();
            if(packageManager0 != null) {
                Intrinsics.checkNotNull(packageManager0);
                Intrinsics.checkNotNullExpressionValue("net.daum.android.tistoryapp", "getPackageName(...)");
                ApplicationInfo applicationInfo0 = PackageManagerKt.getApplicationInfoCompat(packageManager0, "net.daum.android.tistoryapp", 0x80);
                if(applicationInfo0 != null) {
                    Bundle bundle0 = applicationInfo0.metaData;
                    if(bundle0 != null) {
                        String s1 = bundle0.getString(s);
                        return Result.isFailure-impl(s1) ? null : s1;
                    }
                }
            }
            return null;
        }
        catch(Throwable throwable0) {
        }
        String s2 = Result.constructor-impl(ResultKt.createFailure(throwable0));
        return Result.isFailure-impl(s2) ? null : s2;
    }

    @Nullable
    public static final String getVersionName(@NotNull Context context0) {
        Intrinsics.checkNotNullParameter(context0, "<this>");
        PackageManager packageManager0 = context0.getPackageManager();
        if(packageManager0 != null) {
            Intrinsics.checkNotNullExpressionValue("net.daum.android.tistoryapp", "getPackageName(...)");
            PackageInfo packageInfo0 = PackageManagerKt.getPackageInfoCompat(packageManager0, "net.daum.android.tistoryapp", 0);
            return packageInfo0 == null ? null : packageInfo0.versionName;
        }
        return null;
    }
}

