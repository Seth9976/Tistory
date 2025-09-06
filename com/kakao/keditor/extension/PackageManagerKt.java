package com.kakao.keditor.extension;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.PackageInfoFlags;
import android.content.pm.PackageManager;
import android.os.Build.VERSION;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0000\u001A\u001E\u0010\u0000\u001A\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u00042\b\b\u0002\u0010\u0005\u001A\u00020\u0006H\u0000¨\u0006\u0007"}, d2 = {"getPackageInfoCompat", "Landroid/content/pm/PackageInfo;", "Landroid/content/pm/PackageManager;", "packageName", "", "flags", "", "keditor_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class PackageManagerKt {
    @NotNull
    public static final PackageInfo getPackageInfoCompat(@NotNull PackageManager packageManager0, @NotNull String s, int v) {
        PackageInfo packageInfo0;
        Intrinsics.checkNotNullParameter(packageManager0, "<this>");
        Intrinsics.checkNotNullParameter(s, "packageName");
        if(Build.VERSION.SDK_INT >= 33) {
            packageInfo0 = packageManager0.getPackageInfo(s, PackageManager.PackageInfoFlags.of(v));
            Intrinsics.checkNotNull(packageInfo0);
            return packageInfo0;
        }
        packageInfo0 = packageManager0.getPackageInfo(s, v);
        Intrinsics.checkNotNull(packageInfo0);
        return packageInfo0;
    }

    public static PackageInfo getPackageInfoCompat$default(PackageManager packageManager0, String s, int v, int v1, Object object0) {
        if((v1 & 2) != 0) {
            v = 0;
        }
        return PackageManagerKt.getPackageInfoCompat(packageManager0, s, v);
    }
}

