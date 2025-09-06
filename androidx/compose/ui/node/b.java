package androidx.compose.ui.node;

import androidx.compose.ui.unit.Density;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class b extends Lambda implements Function2 {
    public static final b w;

    static {
        b.w = new b(2);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((ComposeUiNode)object0).setDensity(((Density)object1));
        return Unit.INSTANCE;
    }
}

