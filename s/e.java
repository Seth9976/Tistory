package s;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class e extends Lambda implements Function1 {
    public static final e w;

    static {
        e.w = new e(1);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        return object0;
    }
}

