package androidx.compose.animation.core;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import t.j;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u000F\"\u0017\u0010\u0005\u001A\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001A\u0004\b\u0003\u0010\u0004\"\u0017\u0010\b\u001A\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0002\u001A\u0004\b\u0007\u0010\u0004\"\u0017\u0010\u000B\u001A\u00020\u00008\u0006¢\u0006\f\n\u0004\b\t\u0010\u0002\u001A\u0004\b\n\u0010\u0004\"\u0017\u0010\u000E\u001A\u00020\u00008\u0006¢\u0006\f\n\u0004\b\f\u0010\u0002\u001A\u0004\b\r\u0010\u0004¨\u0006\u000F"}, d2 = {"Landroidx/compose/animation/core/Easing;", "a", "Landroidx/compose/animation/core/Easing;", "getFastOutSlowInEasing", "()Landroidx/compose/animation/core/Easing;", "FastOutSlowInEasing", "b", "getLinearOutSlowInEasing", "LinearOutSlowInEasing", "c", "getFastOutLinearInEasing", "FastOutLinearInEasing", "d", "getLinearEasing", "LinearEasing", "animation-core_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class EasingKt {
    public static final CubicBezierEasing a;
    public static final CubicBezierEasing b;
    public static final CubicBezierEasing c;
    public static final j d;

    static {
        EasingKt.a = new CubicBezierEasing(0.4f, 0.0f, 0.2f, 1.0f);
        EasingKt.b = new CubicBezierEasing(0.0f, 0.0f, 0.2f, 1.0f);
        EasingKt.c = new CubicBezierEasing(0.4f, 0.0f, 1.0f, 1.0f);
        EasingKt.d = new j(6);
    }

    @NotNull
    public static final Easing getFastOutLinearInEasing() {
        return EasingKt.c;
    }

    @NotNull
    public static final Easing getFastOutSlowInEasing() {
        return EasingKt.a;
    }

    @NotNull
    public static final Easing getLinearEasing() {
        return EasingKt.d;
    }

    @NotNull
    public static final Easing getLinearOutSlowInEasing() {
        return EasingKt.b;
    }
}

