package j0;

import androidx.compose.ui.text.TextLayoutResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class a1 extends Lambda implements Function1 {
    public static final a1 w;

    static {
        a1.w = new a1(1);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        TextLayoutResult textLayoutResult0 = (TextLayoutResult)object0;
        return Unit.INSTANCE;
    }
}

