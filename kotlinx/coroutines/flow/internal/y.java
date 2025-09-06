package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.CoroutineContext.Element;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class y extends Lambda implements Function2 {
    public static final y w;

    static {
        y.w = new y(2);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        Element coroutineContext$Element0 = (Element)object1;
        return (int)(((Number)object0).intValue() + 1);
    }
}

