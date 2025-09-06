package androidx.compose.ui.node;

import androidx.compose.ui.layout.MeasurePolicy;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class d extends Lambda implements Function2 {
    public static final d w;

    static {
        d.w = new d(2);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((ComposeUiNode)object0).setMeasurePolicy(((MeasurePolicy)object1));
        return Unit.INSTANCE;
    }
}

