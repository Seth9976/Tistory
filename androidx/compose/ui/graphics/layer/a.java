package androidx.compose.ui.graphics.layer;

import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class a extends Lambda implements Function1 {
    public static final a w;

    static {
        a.w = new a(1);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        DrawScope.drawRect-n-J9OG0$default(((DrawScope)object0), 0L, 0L, 0L, 0.0f, null, null, 0, 0x7E, null);
        return Unit.INSTANCE;
    }
}

