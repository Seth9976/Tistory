package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.Placeable.PlacementScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class e2 extends Lambda implements Function1 {
    public static final e2 w;

    static {
        e2.w = new e2(1);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        PlacementScope placeable$PlacementScope0 = (PlacementScope)object0;
        return Unit.INSTANCE;
    }
}

