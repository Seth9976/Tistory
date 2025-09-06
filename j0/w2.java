package j0;

import androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig;
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
        ((KeyframesSpecConfig)object0).setDurationMillis(1000);
        ((KeyframesSpecConfig)object0).at(1.0f, 0);
        ((KeyframesSpecConfig)object0).at(1.0f, 0x1F3);
        ((KeyframesSpecConfig)object0).at(0.0f, 500);
        ((KeyframesSpecConfig)object0).at(0.0f, 999);
        return Unit.INSTANCE;
    }
}

