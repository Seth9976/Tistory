package com.kakao.kphotopicker.util;

import android.content.Context;
import android.util.TypedValue;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001J\u001D\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001A\u00020\u00062\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000B"}, d2 = {"Lcom/kakao/kphotopicker/util/UIUtil;", "", "Landroid/content/Context;", "context", "", "dpSize", "", "dp2px", "(Landroid/content/Context;F)I", "getDisplayWidth", "(Landroid/content/Context;)I", "kphotopicker_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class UIUtil {
    @NotNull
    public static final UIUtil INSTANCE;

    static {
        UIUtil.INSTANCE = new UIUtil();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public final int dp2px(@NotNull Context context0, float f) {
        Intrinsics.checkNotNullParameter(context0, "context");
        return (int)TypedValue.applyDimension(1, f, context0.getResources().getDisplayMetrics());
    }

    public final int getDisplayWidth(@NotNull Context context0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        return context0.getResources().getDisplayMetrics().widthPixels;
    }
}

