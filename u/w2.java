package u;

import androidx.compose.ui.semantics.ProgressBarRangeInfo;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class w2 extends Lambda implements Function1 {
    public static final w2 w;

    static {
        w2.w = new w2(1);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        SemanticsPropertiesKt.setProgressBarRangeInfo(((SemanticsPropertyReceiver)object0), ProgressBarRangeInfo.Companion.getIndeterminate());
        return Unit.INSTANCE;
    }
}

