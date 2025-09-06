package vc;

import dev.chrisbanes.snapper.SnapperLayoutInfo;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class i extends Lambda implements Function3 {
    public static final i w;

    static {
        i.w = new i(3);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        ((Number)object1).intValue();
        Intrinsics.checkNotNullParameter(((SnapperLayoutInfo)object0), "$noName_0");
        return ((Number)object2).intValue();
    }
}

