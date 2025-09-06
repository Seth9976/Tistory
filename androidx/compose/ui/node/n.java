package androidx.compose.ui.node;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class n extends Lambda implements Function1 {
    public static final n w;

    static {
        n.w = new n(1);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        ((AlignmentLinesOwner)object0).getAlignmentLines().setUsedDuringParentLayout$ui_release(false);
        return Unit.INSTANCE;
    }
}

