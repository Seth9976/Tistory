package androidx.compose.material3;

import androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class di extends Lambda implements Function1 {
    public static final di w;

    static {
        di.w = new di(1);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        ((KeyframesSpecConfig)object0).setDurationMillis(1800);
        ((KeyframesSpecConfig)object0).using(((KeyframesSpecConfig)object0).at(0.0f, 0x4F3), ProgressIndicatorKt.i);
        ((KeyframesSpecConfig)object0).at(1.0f, 1800);
        return Unit.INSTANCE;
    }
}

