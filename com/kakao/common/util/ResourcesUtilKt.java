package com.kakao.common.util;

import android.content.Context;
import android.content.res.Configuration;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001A\n\u0010\u0000\u001A\u00020\u0001*\u00020\u0002\u001A\n\u0010\u0003\u001A\u00020\u0001*\u00020\u0004¨\u0006\u0005"}, d2 = {"isUseNightMode", "", "Landroid/content/res/Configuration;", "isUsingNightModeResources", "Landroid/content/Context;", "keditor_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class ResourcesUtilKt {
    public static final boolean isUseNightMode(@NotNull Configuration configuration0) {
        Intrinsics.checkNotNullParameter(configuration0, "<this>");
        return (configuration0.uiMode & 0x30) == 0x20;
    }

    public static final boolean isUsingNightModeResources(@NotNull Context context0) {
        Intrinsics.checkNotNullParameter(context0, "<this>");
        Configuration configuration0 = context0.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration0, "getConfiguration(...)");
        return ResourcesUtilKt.isUseNightMode(configuration0);
    }
}

