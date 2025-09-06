package androidx.compose.material.ripple;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0005\u001A\u001A\u0010\u0005\u001A\u00020\u00022\u0006\u0010\u0001\u001A\u00020\u0000H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001A&\u0010\u000B\u001A\u00020\u0002*\u00020\u00062\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\u0001\u001A\u00020\u0000H\u0000ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\f"}, d2 = {"Landroidx/compose/ui/geometry/Size;", "size", "", "getRippleStartRadius-uvyYCjk", "(J)F", "getRippleStartRadius", "Landroidx/compose/ui/unit/Density;", "", "bounded", "getRippleEndRadius-cSwnlzA", "(Landroidx/compose/ui/unit/Density;ZJ)F", "getRippleEndRadius", "material-ripple_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nRippleAnimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RippleAnimation.kt\nandroidx/compose/material/ripple/RippleAnimationKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,184:1\n154#2:185\n*S KotlinDebug\n*F\n+ 1 RippleAnimation.kt\nandroidx/compose/material/ripple/RippleAnimationKt\n*L\n179#1:185\n*E\n"})
public final class RippleAnimationKt {
    public static final float a;

    static {
        RippleAnimationKt.a = 10.0f;
    }

    public static final float getRippleEndRadius-cSwnlzA(@NotNull Density density0, boolean z, long v) {
        float f = Offset.getDistance-impl(OffsetKt.Offset(Size.getWidth-impl(v), Size.getHeight-impl(v))) / 2.0f;
        return z ? f + density0.toPx-0680j_4(RippleAnimationKt.a) : f;
    }

    public static final float getRippleStartRadius-uvyYCjk(long v) {
        return Math.max(Size.getWidth-impl(v), Size.getHeight-impl(v)) * 0.3f;
    }
}

