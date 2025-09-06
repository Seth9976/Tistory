package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.IntrinsicMeasurable;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class i2 extends Lambda implements Function3 {
    public static final i2 w;

    static {
        i2.w = new i2(3);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        ((Number)object1).intValue();
        return ((IntrinsicMeasurable)object0).maxIntrinsicHeight(((Number)object2).intValue());
    }
}

