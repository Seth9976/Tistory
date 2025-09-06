package j0;

import androidx.compose.ui.text.TextLayoutResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class r extends Lambda implements Function1 {
    public static final r w;

    static {
        r.w = new r(1);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        TextLayoutResult textLayoutResult0 = (TextLayoutResult)object0;
        return Unit.INSTANCE;
    }
}

