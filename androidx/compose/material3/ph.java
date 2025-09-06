package androidx.compose.material3;

import androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class ph extends Lambda implements Function1 {
    public static final ph w;

    static {
        ph.w = new ph(1);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        ((KeyframesSpecConfig)object0).setDurationMillis(0x534);
        ((KeyframesSpecConfig)object0).using(((KeyframesSpecConfig)object0).at(0.0f, 0), ProgressIndicatorKt.j);
        ((KeyframesSpecConfig)object0).at(290.0f, 666);
        return Unit.INSTANCE;
    }
}

