package androidx.compose.foundation;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.StartOffset;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import u.x;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001AR\u0010\r\u001A\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00012\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u00012\b\b\u0002\u0010\u0006\u001A\u00020\u00012\b\b\u0002\u0010\b\u001A\u00020\u00072\b\b\u0002\u0010\n\u001A\u00020\tH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000B\u0010\f\u001A\u0018\u0010\u0010\u001A\u00020\u00072\u0006\u0010\b\u001A\u00020\tø\u0001\u0000¢\u0006\u0004\b\u000E\u0010\u000F\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/Modifier;", "", "iterations", "Landroidx/compose/foundation/MarqueeAnimationMode;", "animationMode", "repeatDelayMillis", "initialDelayMillis", "Landroidx/compose/foundation/MarqueeSpacing;", "spacing", "Landroidx/compose/ui/unit/Dp;", "velocity", "basicMarquee-1Mj1MLw", "(Landroidx/compose/ui/Modifier;IIIILandroidx/compose/foundation/MarqueeSpacing;F)Landroidx/compose/ui/Modifier;", "basicMarquee", "MarqueeSpacing-0680j_4", "(F)Landroidx/compose/foundation/MarqueeSpacing;", "MarqueeSpacing", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nBasicMarquee.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicMarquee.kt\nandroidx/compose/foundation/BasicMarqueeKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,507:1\n1#2:508\n*E\n"})
public final class BasicMarqueeKt {
    @NotNull
    public static final MarqueeSpacing MarqueeSpacing-0680j_4(float f) {
        return new x(f, 0);
    }

    public static final AnimationSpec access$createMarqueeAnimationSpec-Z4HSEVQ(int v, float f, int v1, int v2, float f1, Density density0) {
        TweenSpec tweenSpec0 = AnimationSpecKt.tween(((int)(((float)Math.ceil(f / (Math.abs(density0.toPx-0680j_4(f1)) / 1000.0f))))), v2, EasingKt.getLinearEasing());
        long v3 = StartOffset.constructor-impl$default(v1 - v2, 0, 2, null);
        return v == 0x7FFFFFFF ? AnimationSpecKt.infiniteRepeatable-9IiC70o$default(tweenSpec0, null, v3, 2, null) : AnimationSpecKt.repeatable-91I0pcU$default(v, tweenSpec0, null, v3, 4, null);
    }

    @Stable
    @NotNull
    public static final Modifier basicMarquee-1Mj1MLw(@NotNull Modifier modifier0, int v, int v1, int v2, int v3, @NotNull MarqueeSpacing marqueeSpacing0, float f) {
        return modifier0.then(new MarqueeModifierElement(v, v1, v2, v3, marqueeSpacing0, f));
    }

    public static Modifier basicMarquee-1Mj1MLw$default(Modifier modifier0, int v, int v1, int v2, int v3, MarqueeSpacing marqueeSpacing0, float f, int v4, Object object0) {
        if((v4 & 1) != 0) {
            v = 3;
        }
        if((v4 & 2) != 0) {
            v1 = 0;
        }
        if((v4 & 4) != 0) {
            v2 = 1200;
        }
        if((v4 & 8) != 0) {
            v3 = MarqueeAnimationMode.equals-impl0(v1, 0) ? v2 : 0;
        }
        if((v4 & 16) != 0) {
            marqueeSpacing0 = MarqueeDefaults.INSTANCE.getSpacing();
        }
        if((v4 & 0x20) != 0) {
            f = 0.0f;
        }
        return BasicMarqueeKt.basicMarquee-1Mj1MLw(modifier0, v, v1, v2, v3, marqueeSpacing0, f);
    }
}

