package androidx.compose.ui.node;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class t extends Lambda implements Function1 {
    public static final t w;

    static {
        t.w = new t(1);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        ((AlignmentLinesOwner)object0).getAlignmentLines().setPreviousUsedDuringParentLayout$ui_release(((AlignmentLinesOwner)object0).getAlignmentLines().getUsedDuringParentLayout$ui_release());
        return Unit.INSTANCE;
    }
}

