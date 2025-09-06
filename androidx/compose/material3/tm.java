package androidx.compose.material3;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class tm extends Lambda implements Function1 {
    public static final tm w;

    static {
        tm.w = new tm(1);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        SwipeToDismissBoxValue swipeToDismissBoxValue0 = (SwipeToDismissBoxValue)object0;
        return true;
    }
}

