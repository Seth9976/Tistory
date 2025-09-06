package s;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class l0 extends Lambda implements Function1 {
    public static final l0 w;

    static {
        l0.w = new l0(1);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        ((Number)object0).intValue();
        return 0;
    }
}

