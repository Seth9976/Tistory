package androidx.compose.animation.core;

import androidx.compose.ui.geometry.Offset.Companion;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.IntCompanionObject;
import org.jetbrains.annotations.NotNull;
import t.g;
import t.h0;

@Metadata(d1 = {"\u0000\u0086\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001AQ\u0010\u0007\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00012\u0012\u0010\u0004\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0012\u0010\u0005\u001A\u000E\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u0003\u00A2\u0006\u0004\b\u0007\u0010\b\u001A\'\u0010\r\u001A\u00020\t2\u0006\u0010\n\u001A\u00020\t2\u0006\u0010\u000B\u001A\u00020\t2\u0006\u0010\f\u001A\u00020\tH\u0000\u00A2\u0006\u0004\b\r\u0010\u000E\"!\u0010\u0013\u001A\u000E\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00100\u0006*\u00020\u000F8F\u00A2\u0006\u0006\u001A\u0004\b\u0011\u0010\u0012\"!\u0010\u0013\u001A\u000E\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00100\u0006*\u00020\u00148F\u00A2\u0006\u0006\u001A\u0004\b\u0011\u0010\u0016\"!\u0010\u0013\u001A\u000E\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0006*\u00020\u00178F\u00A2\u0006\u0006\u001A\u0004\b\u0011\u0010\u001A\"!\u0010\u0013\u001A\u000E\u0012\u0004\u0012\u00020\u001C\u0012\u0004\u0012\u00020\u00100\u0006*\u00020\u001B8F\u00A2\u0006\u0006\u001A\u0004\b\u0011\u0010\u001D\"!\u0010\u0013\u001A\u000E\u0012\u0004\u0012\u00020\u001F\u0012\u0004\u0012\u00020 0\u0006*\u00020\u001E8F\u00A2\u0006\u0006\u001A\u0004\b\u0011\u0010!\"!\u0010\u0013\u001A\u000E\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020 0\u0006*\u00020\"8F\u00A2\u0006\u0006\u001A\u0004\b\u0011\u0010$\"!\u0010\u0013\u001A\u000E\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020 0\u0006*\u00020%8F\u00A2\u0006\u0006\u001A\u0004\b\u0011\u0010\'\"!\u0010\u0013\u001A\u000E\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020 0\u0006*\u00020(8F\u00A2\u0006\u0006\u001A\u0004\b\u0011\u0010*\"!\u0010\u0013\u001A\u000E\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020 0\u0006*\u00020+8F\u00A2\u0006\u0006\u001A\u0004\b\u0011\u0010-\u00A8\u0006."}, d2 = {"T", "Landroidx/compose/animation/core/AnimationVector;", "V", "Lkotlin/Function1;", "convertToVector", "convertFromVector", "Landroidx/compose/animation/core/TwoWayConverter;", "TwoWayConverter", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Landroidx/compose/animation/core/TwoWayConverter;", "", "start", "stop", "fraction", "lerp", "(FFF)F", "Lkotlin/Float$Companion;", "Landroidx/compose/animation/core/AnimationVector1D;", "getVectorConverter", "(Lkotlin/jvm/internal/FloatCompanionObject;)Landroidx/compose/animation/core/TwoWayConverter;", "VectorConverter", "Lkotlin/Int$Companion;", "", "(Lkotlin/jvm/internal/IntCompanionObject;)Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/ui/geometry/Rect$Companion;", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/animation/core/AnimationVector4D;", "(Landroidx/compose/ui/geometry/Rect$Companion;)Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/ui/unit/Dp$Companion;", "Landroidx/compose/ui/unit/Dp;", "(Landroidx/compose/ui/unit/Dp$Companion;)Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/ui/unit/DpOffset$Companion;", "Landroidx/compose/ui/unit/DpOffset;", "Landroidx/compose/animation/core/AnimationVector2D;", "(Landroidx/compose/ui/unit/DpOffset$Companion;)Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/ui/geometry/Size$Companion;", "Landroidx/compose/ui/geometry/Size;", "(Landroidx/compose/ui/geometry/Size$Companion;)Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/ui/geometry/Offset$Companion;", "Landroidx/compose/ui/geometry/Offset;", "(Landroidx/compose/ui/geometry/Offset$Companion;)Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/ui/unit/IntOffset$Companion;", "Landroidx/compose/ui/unit/IntOffset;", "(Landroidx/compose/ui/unit/IntOffset$Companion;)Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/ui/unit/IntSize$Companion;", "Landroidx/compose/ui/unit/IntSize;", "(Landroidx/compose/ui/unit/IntSize$Companion;)Landroidx/compose/animation/core/TwoWayConverter;", "animation-core_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class VectorConvertersKt {
    public static final TwoWayConverter a;
    public static final TwoWayConverter b;
    public static final TwoWayConverter c;
    public static final TwoWayConverter d;
    public static final TwoWayConverter e;
    public static final TwoWayConverter f;
    public static final TwoWayConverter g;
    public static final TwoWayConverter h;
    public static final TwoWayConverter i;

    static {
        VectorConvertersKt.a = VectorConvertersKt.TwoWayConverter(g.I, g.J);
        VectorConvertersKt.b = VectorConvertersKt.TwoWayConverter(g.O, g.P);
        VectorConvertersKt.c = VectorConvertersKt.TwoWayConverter(g.G, g.H);
        VectorConvertersKt.d = VectorConvertersKt.TwoWayConverter(g.E, g.F);
        VectorConvertersKt.e = VectorConvertersKt.TwoWayConverter(g.U, g.V);
        VectorConvertersKt.f = VectorConvertersKt.TwoWayConverter(g.Q, g.R);
        VectorConvertersKt.g = VectorConvertersKt.TwoWayConverter(g.K, g.L);
        VectorConvertersKt.h = VectorConvertersKt.TwoWayConverter(g.M, g.N);
        VectorConvertersKt.i = VectorConvertersKt.TwoWayConverter(g.S, g.T);
    }

    @NotNull
    public static final TwoWayConverter TwoWayConverter(@NotNull Function1 function10, @NotNull Function1 function11) {
        return new h0(function10, function11);
    }

    @NotNull
    public static final TwoWayConverter getVectorConverter(@NotNull Companion offset$Companion0) {
        return VectorConvertersKt.f;
    }

    @NotNull
    public static final TwoWayConverter getVectorConverter(@NotNull androidx.compose.ui.geometry.Rect.Companion rect$Companion0) {
        return VectorConvertersKt.i;
    }

    @NotNull
    public static final TwoWayConverter getVectorConverter(@NotNull androidx.compose.ui.geometry.Size.Companion size$Companion0) {
        return VectorConvertersKt.e;
    }

    @NotNull
    public static final TwoWayConverter getVectorConverter(@NotNull androidx.compose.ui.unit.Dp.Companion dp$Companion0) {
        return VectorConvertersKt.c;
    }

    @NotNull
    public static final TwoWayConverter getVectorConverter(@NotNull androidx.compose.ui.unit.DpOffset.Companion dpOffset$Companion0) {
        return VectorConvertersKt.d;
    }

    @NotNull
    public static final TwoWayConverter getVectorConverter(@NotNull androidx.compose.ui.unit.IntOffset.Companion intOffset$Companion0) {
        return VectorConvertersKt.g;
    }

    @NotNull
    public static final TwoWayConverter getVectorConverter(@NotNull androidx.compose.ui.unit.IntSize.Companion intSize$Companion0) {
        return VectorConvertersKt.h;
    }

    @NotNull
    public static final TwoWayConverter getVectorConverter(@NotNull FloatCompanionObject floatCompanionObject0) {
        return VectorConvertersKt.a;
    }

    @NotNull
    public static final TwoWayConverter getVectorConverter(@NotNull IntCompanionObject intCompanionObject0) {
        return VectorConvertersKt.b;
    }

    public static final float lerp(float f, float f1, float f2) {
        return f1 * f2 + (1.0f - f2) * f;
    }
}

