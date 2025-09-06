package androidx.navigation;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class g extends Lambda implements Function1 {
    public static final g w;

    static {
        g.w = new g(1);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((NavDestination)object0), "it");
        return ((NavDestination)object0) instanceof NavGraph ? ((NavGraph)(((NavDestination)object0))).findNode(((NavGraph)(((NavDestination)object0))).getStartDestinationId()) : null;
    }
}

