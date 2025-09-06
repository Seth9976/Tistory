package androidx.compose.animation.core;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.unit.Dp.Companion;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpOffset;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.x;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000d\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\".\u0010\u0007\u001A\u0016\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0001\u0012\u0004\u0012\u00020\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006\"\u0015\u0010\f\u001A\u00020\t*\u00020\b8F¢\u0006\u0006\u001A\u0004\b\n\u0010\u000B\"\u0015\u0010\f\u001A\u00020\u000E*\u00020\r8F¢\u0006\u0006\u001A\u0004\b\n\u0010\u000F\"\u0015\u0010\f\u001A\u00020\u0011*\u00020\u00108F¢\u0006\u0006\u001A\u0004\b\n\u0010\u0012\"\u0015\u0010\f\u001A\u00020\u0014*\u00020\u00138F¢\u0006\u0006\u001A\u0004\b\n\u0010\u0015\"\u0015\u0010\f\u001A\u00020\u0017*\u00020\u00168F¢\u0006\u0006\u001A\u0004\b\n\u0010\u0018\"\u0015\u0010\f\u001A\u00020\u001A*\u00020\u00198F¢\u0006\u0006\u001A\u0004\b\n\u0010\u001B\"\u0015\u0010\f\u001A\u00020\u001D*\u00020\u001C8F¢\u0006\u0006\u001A\u0004\b\n\u0010\u001E\"\u0015\u0010\f\u001A\u00020 *\u00020\u001F8F¢\u0006\u0006\u001A\u0004\b\n\u0010!¨\u0006\""}, d2 = {"", "Landroidx/compose/animation/core/TwoWayConverter;", "", "b", "Ljava/util/Map;", "getVisibilityThresholdMap", "()Ljava/util/Map;", "visibilityThresholdMap", "Landroidx/compose/ui/unit/IntOffset$Companion;", "Landroidx/compose/ui/unit/IntOffset;", "getVisibilityThreshold", "(Landroidx/compose/ui/unit/IntOffset$Companion;)J", "VisibilityThreshold", "Landroidx/compose/ui/geometry/Offset$Companion;", "Landroidx/compose/ui/geometry/Offset;", "(Landroidx/compose/ui/geometry/Offset$Companion;)J", "Lkotlin/Int$Companion;", "", "(Lkotlin/jvm/internal/IntCompanionObject;)I", "Landroidx/compose/ui/unit/Dp$Companion;", "Landroidx/compose/ui/unit/Dp;", "(Landroidx/compose/ui/unit/Dp$Companion;)F", "Landroidx/compose/ui/unit/DpOffset$Companion;", "Landroidx/compose/ui/unit/DpOffset;", "(Landroidx/compose/ui/unit/DpOffset$Companion;)J", "Landroidx/compose/ui/geometry/Size$Companion;", "Landroidx/compose/ui/geometry/Size;", "(Landroidx/compose/ui/geometry/Size$Companion;)J", "Landroidx/compose/ui/unit/IntSize$Companion;", "Landroidx/compose/ui/unit/IntSize;", "(Landroidx/compose/ui/unit/IntSize$Companion;)J", "Landroidx/compose/ui/geometry/Rect$Companion;", "Landroidx/compose/ui/geometry/Rect;", "(Landroidx/compose/ui/geometry/Rect$Companion;)Landroidx/compose/ui/geometry/Rect;", "animation-core_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nVisibilityThresholds.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VisibilityThresholds.kt\nandroidx/compose/animation/core/VisibilityThresholdsKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,115:1\n168#2:116\n*S KotlinDebug\n*F\n+ 1 VisibilityThresholds.kt\nandroidx/compose/animation/core/VisibilityThresholdsKt\n*L\n68#1:116\n*E\n"})
public final class VisibilityThresholdsKt {
    public static final Rect a;
    public static final Map b;

    static {
        VisibilityThresholdsKt.a = new Rect(0.5f, 0.5f, 0.5f, 0.5f);
        VisibilityThresholdsKt.b = x.mapOf(new Pair[]{TuplesKt.to(VectorConvertersKt.getVectorConverter(IntCompanionObject.INSTANCE), 1.0f), TuplesKt.to(VectorConvertersKt.getVectorConverter(IntSize.Companion), 1.0f), TuplesKt.to(VectorConvertersKt.getVectorConverter(IntOffset.Companion), 1.0f), TuplesKt.to(VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE), 0.01f), TuplesKt.to(VectorConvertersKt.getVectorConverter(Rect.Companion), 0.5f), TuplesKt.to(VectorConvertersKt.getVectorConverter(Size.Companion), 0.5f), TuplesKt.to(VectorConvertersKt.getVectorConverter(Offset.Companion), 0.5f), TuplesKt.to(VectorConvertersKt.getVectorConverter(Dp.Companion), 0.1f), TuplesKt.to(VectorConvertersKt.getVectorConverter(DpOffset.Companion), 0.1f)});
    }

    public static final float getVisibilityThreshold(@NotNull Companion dp$Companion0) [...] // 潜在的解密器

    public static final int getVisibilityThreshold(@NotNull IntCompanionObject intCompanionObject0) [...] // Inlined contents

    // 去混淆评级： 低(20)
    public static final long getVisibilityThreshold(@NotNull androidx.compose.ui.geometry.Offset.Companion offset$Companion0) [...] // 潜在的解密器

    // 去混淆评级： 低(20)
    public static final long getVisibilityThreshold(@NotNull androidx.compose.ui.geometry.Size.Companion size$Companion0) [...] // 潜在的解密器

    // 去混淆评级： 中等(60)
    public static final long getVisibilityThreshold(@NotNull androidx.compose.ui.unit.DpOffset.Companion dpOffset$Companion0) {
        return 0x3DCCCCCD3DCCCCCDL;
    }

    // 去混淆评级： 低(20)
    public static final long getVisibilityThreshold(@NotNull androidx.compose.ui.unit.IntOffset.Companion intOffset$Companion0) [...] // 潜在的解密器

    // 去混淆评级： 低(20)
    public static final long getVisibilityThreshold(@NotNull androidx.compose.ui.unit.IntSize.Companion intSize$Companion0) [...] // 潜在的解密器

    @NotNull
    public static final Rect getVisibilityThreshold(@NotNull androidx.compose.ui.geometry.Rect.Companion rect$Companion0) {
        return VisibilityThresholdsKt.a;
    }

    @NotNull
    public static final Map getVisibilityThresholdMap() {
        return VisibilityThresholdsKt.b;
    }
}

