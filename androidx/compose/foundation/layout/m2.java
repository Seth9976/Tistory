package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.IntrinsicMeasurable;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class m2 extends Lambda implements Function3 {
    public static final m2 w;

    static {
        m2.w = new m2(3);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        ((Number)object1).intValue();
        return ((IntrinsicMeasurable)object0).minIntrinsicWidth(((Number)object2).intValue());
    }
}

