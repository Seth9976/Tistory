package androidx.compose.ui.layout;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class h extends Lambda implements Function2 {
    public static final h w;

    static {
        h.w = new h(2);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        PlacementScope placeable$PlacementScope0 = (PlacementScope)object0;
        LayoutCoordinates layoutCoordinates0 = (LayoutCoordinates)object1;
        return false;
    }
}

