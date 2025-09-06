package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000F\n\u0002\u0010\u000E\n\u0002\b\u0007\n\u0002\u0010\u000B\n\u0002\b\t\b\u0081@\u0018\u00002\u00020\u0001B)\b\u0016\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0002\u0012\u0006\u0010\u0006\u001A\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\n\u001A\u00020\t\u0012\u0006\u0010\f\u001A\u00020\u000B¢\u0006\u0004\b\u0007\u0010\rJ\u0013\u0010\u0010\u001A\u00020\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001B\u0010\u0012\u001A\u00020\t2\u0006\u0010\f\u001A\u00020\u000Bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\rJ\u0015\u0010\u0015\u001A\u00020\u00022\u0006\u0010\f\u001A\u00020\u000B¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001A\u00020\u00022\u0006\u0010\f\u001A\u00020\u000B¢\u0006\u0004\b\u0016\u0010\u0014J;\u0010\u001A\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001E\u001A\u00020\u001BHÖ\u0001¢\u0006\u0004\b\u001C\u0010\u001DJ\u0010\u0010!\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001F\u0010 J\u001A\u0010&\u001A\u00020#2\b\u0010\"\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0012\u0010\u0003\u001A\u00020\u00028Æ\u0002¢\u0006\u0006\u001A\u0004\b\'\u0010 R\u0012\u0010\u0004\u001A\u00020\u00028Æ\u0002¢\u0006\u0006\u001A\u0004\b(\u0010 R\u0012\u0010\u0005\u001A\u00020\u00028Æ\u0002¢\u0006\u0006\u001A\u0004\b)\u0010 R\u0012\u0010\u0006\u001A\u00020\u00028Æ\u0002¢\u0006\u0006\u001A\u0004\b*\u0010 \u0088\u0001+\u0092\u0001\u00020\t\u0082\u0002\u000B\n\u0002\b!\n\u0005\b¡\u001E0\u0001¨\u0006,"}, d2 = {"Landroidx/compose/foundation/layout/OrientationIndependentConstraints;", "", "", "mainAxisMin", "mainAxisMax", "crossAxisMin", "crossAxisMax", "constructor-impl", "(IIII)J", "Landroidx/compose/ui/unit/Constraints;", "c", "Landroidx/compose/foundation/layout/LayoutOrientation;", "orientation", "(JLandroidx/compose/foundation/layout/LayoutOrientation;)J", "stretchCrossAxis-q4ezo7Y", "(J)J", "stretchCrossAxis", "toBoxConstraints-OenEA2s", "toBoxConstraints", "maxWidth-impl", "(JLandroidx/compose/foundation/layout/LayoutOrientation;)I", "maxWidth", "maxHeight-impl", "maxHeight", "copy-yUG9Ft0", "(JIIII)J", "copy", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "hashCode-impl", "(J)I", "hashCode", "other", "", "equals-impl", "(JLjava/lang/Object;)Z", "equals", "getMainAxisMin-impl", "getMainAxisMax-impl", "getCrossAxisMin-impl", "getCrossAxisMax-impl", "value", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@JvmInline
@SourceDebugExtension({"SMAP\nRowColumnImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RowColumnImpl.kt\nandroidx/compose/foundation/layout/OrientationIndependentConstraints\n*L\n1#1,722:1\n228#1:723\n229#1:724\n231#1:725\n230#1:726\n231#1:727\n228#1,4:728\n230#1,2:732\n228#1,2:734\n229#1:736\n231#1:737\n231#1:738\n229#1:739\n228#1:740\n229#1:741\n230#1:742\n231#1:743\n*S KotlinDebug\n*F\n+ 1 RowColumnImpl.kt\nandroidx/compose/foundation/layout/OrientationIndependentConstraints\n*L\n256#1:723\n257#1:724\n258#1:725\n258#1:726\n259#1:727\n265#1:728,4\n267#1:732,2\n267#1:734,2\n273#1:736\n275#1:737\n281#1:738\n283#1:739\n287#1:740\n288#1:741\n289#1:742\n290#1:743\n*E\n"})
public final class OrientationIndependentConstraints {
    public final long a;

    public OrientationIndependentConstraints(long v) {
        this.a = v;
    }

    public static final OrientationIndependentConstraints box-impl(long v) {
        return new OrientationIndependentConstraints(v);
    }

    public static long constructor-impl(int v, int v1, int v2, int v3) {
        return ConstraintsKt.Constraints(v, v1, v2, v3);
    }

    public static long constructor-impl(long v, @NotNull LayoutOrientation layoutOrientation0) {
        int v1 = layoutOrientation0 == LayoutOrientation.Horizontal ? Constraints.getMinWidth-impl(v) : Constraints.getMinHeight-impl(v);
        int v2 = layoutOrientation0 == LayoutOrientation.Horizontal ? Constraints.getMaxWidth-impl(v) : Constraints.getMaxHeight-impl(v);
        int v3 = layoutOrientation0 == LayoutOrientation.Horizontal ? Constraints.getMinHeight-impl(v) : Constraints.getMinWidth-impl(v);
        return layoutOrientation0 == LayoutOrientation.Horizontal ? OrientationIndependentConstraints.constructor-impl(v1, v2, v3, Constraints.getMaxHeight-impl(v)) : OrientationIndependentConstraints.constructor-impl(v1, v2, v3, Constraints.getMaxWidth-impl(v));
    }

    public static final long copy-yUG9Ft0(long v, int v1, int v2, int v3, int v4) {
        return OrientationIndependentConstraints.constructor-impl(v1, v2, v3, v4);
    }

    public static long copy-yUG9Ft0$default(long v, int v1, int v2, int v3, int v4, int v5, Object object0) {
        if((v5 & 1) != 0) {
            v1 = Constraints.getMinWidth-impl(v);
        }
        if((v5 & 2) != 0) {
            v2 = Constraints.getMaxWidth-impl(v);
        }
        if((v5 & 4) != 0) {
            v3 = Constraints.getMinHeight-impl(v);
        }
        if((v5 & 8) != 0) {
            v4 = Constraints.getMaxHeight-impl(v);
        }
        return OrientationIndependentConstraints.copy-yUG9Ft0(v, v1, v2, v3, v4);
    }

    @Override
    public boolean equals(Object object0) {
        return OrientationIndependentConstraints.equals-impl(this.a, object0);
    }

    // 去混淆评级： 低(20)
    public static boolean equals-impl(long v, Object object0) {
        return object0 instanceof OrientationIndependentConstraints ? Constraints.equals-impl0(v, ((OrientationIndependentConstraints)object0).unbox-impl()) : false;
    }

    public static final boolean equals-impl0(long v, long v1) {
        return Constraints.equals-impl0(v, v1);
    }

    public static final int getCrossAxisMax-impl(long v) {
        return Constraints.getMaxHeight-impl(v);
    }

    public static final int getCrossAxisMin-impl(long v) {
        return Constraints.getMinHeight-impl(v);
    }

    public static final int getMainAxisMax-impl(long v) {
        return Constraints.getMaxWidth-impl(v);
    }

    public static final int getMainAxisMin-impl(long v) {
        return Constraints.getMinWidth-impl(v);
    }

    @Override
    public int hashCode() {
        return OrientationIndependentConstraints.hashCode-impl(this.a);
    }

    public static int hashCode-impl(long v) {
        return Constraints.hashCode-impl(v);
    }

    public static final int maxHeight-impl(long v, @NotNull LayoutOrientation layoutOrientation0) {
        return layoutOrientation0 == LayoutOrientation.Horizontal ? Constraints.getMaxHeight-impl(v) : Constraints.getMaxWidth-impl(v);
    }

    public static final int maxWidth-impl(long v, @NotNull LayoutOrientation layoutOrientation0) {
        return layoutOrientation0 == LayoutOrientation.Horizontal ? Constraints.getMaxWidth-impl(v) : Constraints.getMaxHeight-impl(v);
    }

    public static final long stretchCrossAxis-q4ezo7Y(long v) {
        int v1 = Constraints.getMinWidth-impl(v);
        int v2 = Constraints.getMaxWidth-impl(v);
        return Constraints.getMaxHeight-impl(v) == 0x7FFFFFFF ? OrientationIndependentConstraints.constructor-impl(v1, v2, Constraints.getMinHeight-impl(v), Constraints.getMaxHeight-impl(v)) : OrientationIndependentConstraints.constructor-impl(v1, v2, Constraints.getMaxHeight-impl(v), Constraints.getMaxHeight-impl(v));
    }

    public static final long toBoxConstraints-OenEA2s(long v, @NotNull LayoutOrientation layoutOrientation0) {
        return layoutOrientation0 == LayoutOrientation.Horizontal ? ConstraintsKt.Constraints(Constraints.getMinWidth-impl(v), Constraints.getMaxWidth-impl(v), Constraints.getMinHeight-impl(v), Constraints.getMaxHeight-impl(v)) : ConstraintsKt.Constraints(Constraints.getMinHeight-impl(v), Constraints.getMaxHeight-impl(v), Constraints.getMinWidth-impl(v), Constraints.getMaxWidth-impl(v));
    }

    @Override
    public String toString() {
        return OrientationIndependentConstraints.toString-impl(this.a);
    }

    public static String toString-impl(long v) {
        return "OrientationIndependentConstraints(value=" + Constraints.toString-impl(v) + ')';
    }

    public final long unbox-impl() {
        return this.a;
    }
}

