package androidx.compose.animation;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class c extends Lambda implements Function1 {
    public static final c w;

    static {
        c.w = new c(1);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        return ((Number)object0).intValue();
    }
}

