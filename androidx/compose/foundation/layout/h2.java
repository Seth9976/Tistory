package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.IntrinsicMeasurable;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class h2 extends Lambda implements Function3 {
    public static final h2 w;

    static {
        h2.w = new h2(3);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        ((Number)object1).intValue();
        return ((IntrinsicMeasurable)object0).maxIntrinsicWidth(((Number)object2).intValue());
    }
}

