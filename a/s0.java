package a;

import androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig;
import androidx.compose.ui.graphics.Color;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class s0 extends Lambda implements Function1 {
    public static final s0 a;

    static {
        s0.a = new s0();
    }

    public s0() {
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((KeyframesSpecConfig)object0), "$this$keyframes");
        ((KeyframesSpecConfig)object0).setDurationMillis(1200);
        ((KeyframesSpecConfig)object0).at(Color.box-impl(0xFF00000000000000L), 0);
        ((KeyframesSpecConfig)object0).at(Color.box-impl(0xFF66666600000000L), 600);
        ((KeyframesSpecConfig)object0).at(Color.box-impl(0xFF00000000000000L), 1200);
        return Unit.INSTANCE;
    }
}

