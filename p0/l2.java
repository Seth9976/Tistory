package p0;

import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class l2 extends Lambda implements Function1 {
    public static final l2 w;

    static {
        l2.w = new l2(1);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        SemanticsPropertiesKt.setRole-kuIjeqM(((SemanticsPropertyReceiver)object0), 1);
        return Unit.INSTANCE;
    }
}

