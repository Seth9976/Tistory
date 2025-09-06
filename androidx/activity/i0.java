package androidx.activity;

import android.content.res.Resources;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class i0 extends Lambda implements Function1 {
    public static final i0 w;

    static {
        i0.w = new i0(1);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((Resources)object0), "resources");
        return (((Resources)object0).getConfiguration().uiMode & 0x30) == 0x20;
    }
}

