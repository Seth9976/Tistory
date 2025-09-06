package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class k extends Lambda implements Function2 {
    public static final k w;

    static {
        k.w = new k(2);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return Alignment.Companion.getStart().align(0, ((Number)object0).intValue(), ((LayoutDirection)object1));
    }
}

