package w0;

import androidx.compose.ui.unit.IntRect;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class u0 extends Lambda implements Function2 {
    public static final u0 w;

    static {
        u0.w = new u0(2);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        IntRect intRect0 = (IntRect)object0;
        IntRect intRect1 = (IntRect)object1;
        return Unit.INSTANCE;
    }
}

