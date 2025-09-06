package p0;

import androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig;
import androidx.compose.material.ProgressIndicatorKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class t6 extends Lambda implements Function1 {
    public static final t6 w;

    static {
        t6.w = new t6(1);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        ((KeyframesSpecConfig)object0).setDurationMillis(1800);
        ((KeyframesSpecConfig)object0).using(((KeyframesSpecConfig)object0).at(0.0f, 0x4F3), ProgressIndicatorKt.g);
        ((KeyframesSpecConfig)object0).at(1.0f, 1800);
        return Unit.INSTANCE;
    }
}

