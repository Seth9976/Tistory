package ca;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class q0 extends Lambda implements Function2 {
    public static final q0 w;

    static {
        q0.w = new q0(2);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Boolean)object0).booleanValue();
        ((Number)object1).intValue();
        return Unit.INSTANCE;
    }
}

