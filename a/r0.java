package a;

import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig;
import androidx.compose.ui.unit.Dp;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class r0 extends Lambda implements Function1 {
    public static final r0 a;

    static {
        r0.a = new r0();
    }

    public r0() {
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((KeyframesSpecConfig)object0), "$this$keyframes");
        ((KeyframesSpecConfig)object0).setDurationMillis(1200);
        ((KeyframesSpecConfig)object0).with(((KeyframesSpecConfig)object0).at(Dp.box-impl(0.0f), 0), new CubicBezierEasing(0.1f, 0.1f, 0.2f, 1.0f));
        ((KeyframesSpecConfig)object0).with(((KeyframesSpecConfig)object0).at(Dp.box-impl(-8.0f), 600), new CubicBezierEasing(0.1f, 0.1f, 0.9f, 1.0f));
        ((KeyframesSpecConfig)object0).at(Dp.box-impl(0.0f), 1200);
        return Unit.INSTANCE;
    }
}

