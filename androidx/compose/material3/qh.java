package androidx.compose.material3;

import androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class qh extends Lambda implements Function1 {
    public static final qh w;

    static {
        qh.w = new qh(1);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        ((KeyframesSpecConfig)object0).setDurationMillis(0x534);
        ((KeyframesSpecConfig)object0).using(((KeyframesSpecConfig)object0).at(0.0f, 666), ProgressIndicatorKt.j);
        ((KeyframesSpecConfig)object0).at(290.0f, ((KeyframesSpecConfig)object0).getDurationMillis());
        return Unit.INSTANCE;
    }
}

