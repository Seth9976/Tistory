package ca;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class b0 extends Lambda implements Function0 {
    public static final b0 w;

    static {
        b0.w = new b0(0);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return Unit.INSTANCE;
    }
}

