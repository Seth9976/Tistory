package androidx.compose.animation;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class z extends Lambda implements Function1 {
    public static final z w;

    static {
        z.w = new z(1);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        return ((EnterExitState)object0) == EnterExitState.Visible;
    }
}

