package com.kakao.common.view;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.WindowManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A\n\u0010\u0000\u001A\u00020\u0001*\u00020\u0002\u001A\n\u0010\u0003\u001A\u00020\u0001*\u00020\u0002¨\u0006\u0004"}, d2 = {"getScreenHeight", "", "Landroid/content/Context;", "getScreenWidth", "keditor_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class ScreenKt {
    public static final int getScreenHeight(@NotNull Context context0) {
        Intrinsics.checkNotNullParameter(context0, "<this>");
        if(Build.VERSION.SDK_INT >= 30) {
            Object object0 = context0.getSystemService("window");
            Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type android.view.WindowManager");
            Rect rect0 = ((WindowManager)object0).getCurrentWindowMetrics().getBounds();
            Intrinsics.checkNotNullExpressionValue(rect0, "getBounds(...)");
            return rect0.height();
        }
        Object object1 = context0.getSystemService("window");
        Intrinsics.checkNotNull(object1, "null cannot be cast to non-null type android.view.WindowManager");
        return ((WindowManager)object1).getDefaultDisplay().getHeight();
    }

    public static final int getScreenWidth(@NotNull Context context0) {
        Intrinsics.checkNotNullParameter(context0, "<this>");
        if(Build.VERSION.SDK_INT >= 30) {
            Object object0 = context0.getSystemService("window");
            Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type android.view.WindowManager");
            Rect rect0 = ((WindowManager)object0).getCurrentWindowMetrics().getBounds();
            Intrinsics.checkNotNullExpressionValue(rect0, "getBounds(...)");
            return rect0.width();
        }
        Object object1 = context0.getSystemService("window");
        Intrinsics.checkNotNull(object1, "null cannot be cast to non-null type android.view.WindowManager");
        return ((WindowManager)object1).getDefaultDisplay().getWidth();
    }
}

