package androidx.compose.material3;

import androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class ai extends Lambda implements Function1 {
    public static final ai w;

    static {
        ai.w = new ai(1);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        ((KeyframesSpecConfig)object0).setDurationMillis(1800);
        ((KeyframesSpecConfig)object0).using(((KeyframesSpecConfig)object0).at(0.0f, 0), ProgressIndicatorKt.f);
        ((KeyframesSpecConfig)object0).at(1.0f, 750);
        return Unit.INSTANCE;
    }
}

