package androidx.compose.material3.internal;

import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.Easing;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"material3_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class PredictiveBack_androidKt {
    public static final CubicBezierEasing a;

    static {
        PredictiveBack_androidKt.a = new CubicBezierEasing(0.1f, 0.1f, 0.0f, 1.0f);
    }

    public static final Easing access$getPredictiveBackEasing$p() {
        return PredictiveBack_androidKt.a;
    }
}

