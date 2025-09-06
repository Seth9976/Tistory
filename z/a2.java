package z;

import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerType;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class a2 extends Lambda implements Function1 {
    public static final a2 w;

    static {
        a2.w = new a2(1);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    // 去混淆评级： 低(20)
    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        return Boolean.valueOf(!PointerType.equals-impl0(((PointerInputChange)object0).getType-T8wyACA(), 2));
    }
}

