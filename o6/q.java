package o6;

import dev.chrisbanes.snapper.SnapperLayoutInfo;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.c;

public final class q extends Lambda implements Function3 {
    public static final q w;

    static {
        q.w = new q(3);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v = ((Number)object1).intValue();
        Intrinsics.checkNotNullParameter(((SnapperLayoutInfo)object0), "layoutInfo");
        return c.coerceIn(c.coerceIn(((Number)object2).intValue(), v - 1, v + 1), 0, ((SnapperLayoutInfo)object0).getTotalItemsCount() - 1);
    }
}

