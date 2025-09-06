package ca;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;

public final class i1 extends Lambda implements Function2 {
    public static final i1 w;

    static {
        i1.w = new i1(2);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).floatValue();
        Intrinsics.checkNotNullParameter(((CoroutineScope)object0), "$this$null");
        return Unit.INSTANCE;
    }
}

