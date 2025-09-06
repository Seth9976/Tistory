package androidx.window.layout;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class n extends Lambda implements Function1 {
    public static final n w;

    static {
        n.w = new n(1);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((WindowMetricsCalculator)object0), "it");
        return (WindowMetricsCalculator)object0;
    }
}

