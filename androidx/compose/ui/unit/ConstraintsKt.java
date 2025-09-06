package androidx.compose.ui.unit;

import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;

@Metadata(d1 = {"\u0000 \n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000B\n\u0002\b\t\u001A/\u0010\u0006\u001A\u00020\u00052\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u00002\u0006\u0010\u0003\u001A\u00020\u00002\u0006\u0010\u0004\u001A\u00020\u0000H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001A7\u0010\b\u001A\u00020\u00052\b\b\u0002\u0010\u0001\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00002\b\b\u0002\u0010\u0004\u001A\u00020\u0000H\u0007¢\u0006\u0004\b\b\u0010\u0007\u001A\u001C\u0010\f\u001A\u00020\u0005*\u00020\u00052\u0006\u0010\t\u001A\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000B\u001A\u001E\u0010\f\u001A\u00020\r*\u00020\u00052\u0006\u0010\u000E\u001A\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000F\u0010\u000B\u001A\u001E\u0010\u0013\u001A\u00020\u0000*\u00020\u00052\u0006\u0010\u0010\u001A\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001A\u001E\u0010\u0016\u001A\u00020\u0000*\u00020\u00052\u0006\u0010\u0014\u001A\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0012\u001A\u001E\u0010\u001A\u001A\u00020\u0017*\u00020\u00052\u0006\u0010\u000E\u001A\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001A*\u0010\u001F\u001A\u00020\u0005*\u00020\u00052\b\b\u0002\u0010\u001B\u001A\u00020\u00002\b\b\u0002\u0010\u001C\u001A\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001D\u0010\u001E\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006 "}, d2 = {"", "minWidth", "maxWidth", "minHeight", "maxHeight", "Landroidx/compose/ui/unit/Constraints;", "createConstraints", "(IIII)J", "Constraints", "otherConstraints", "constrain-N9IONVI", "(JJ)J", "constrain", "Landroidx/compose/ui/unit/IntSize;", "size", "constrain-4WqzIAM", "width", "constrainWidth-K40F9xA", "(JI)I", "constrainWidth", "height", "constrainHeight-K40F9xA", "constrainHeight", "", "isSatisfiedBy-4WqzIAM", "(JJ)Z", "isSatisfiedBy", "horizontal", "vertical", "offset-NN6Ew-U", "(JII)J", "offset", "ui-unit_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nConstraints.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Constraints.kt\nandroidx/compose/ui/unit/ConstraintsKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/unit/InlineClassHelperKt\n*L\n1#1,706:1\n685#1,9:707\n37#2,7:716\n37#2,7:723\n37#2,7:730\n*S KotlinDebug\n*F\n+ 1 Constraints.kt\nandroidx/compose/ui/unit/ConstraintsKt\n*L\n505#1:707,9\n548#1:716,7\n551#1:723,7\n554#1:730,7\n*E\n"})
public final class ConstraintsKt {
    @Stable
    public static final long Constraints(int v, int v1, int v2, int v3) {
        if(v1 < v) {
            InlineClassHelperKt.throwIllegalArgumentException(("maxWidth(" + v1 + ") must be >= than minWidth(" + v + ')'));
        }
        if(v3 < v2) {
            InlineClassHelperKt.throwIllegalArgumentException(("maxHeight(" + v3 + ") must be >= than minHeight(" + v2 + ')'));
        }
        if(v < 0 || v2 < 0) {
            InlineClassHelperKt.throwIllegalArgumentException(("minWidth(" + v + ") and minHeight(" + v2 + ") must be >= 0"));
        }
        return ConstraintsKt.createConstraints(v, v1, v2, v3);
    }

    public static long Constraints$default(int v, int v1, int v2, int v3, int v4, Object object0) {
        if((v4 & 1) != 0) {
            v = 0;
        }
        if((v4 & 2) != 0) {
            v1 = 0x7FFFFFFF;
        }
        if((v4 & 4) != 0) {
            v2 = 0;
        }
        if((v4 & 8) != 0) {
            v3 = 0x7FFFFFFF;
        }
        return ConstraintsKt.Constraints(v, v1, v2, v3);
    }

    public static final int a(int v) {
        if(v < 0x1FFF) {
            return 13;
        }
        if(v < 0x7FFF) {
            return 15;
        }
        if(v < 0xFFFF) {
            return 16;
        }
        return v >= 0x3FFFF ? 0xFF : 18;
    }

    public static final int access$maxAllowedForSize(int v) {
        if(v < 0x1FFF) {
            return 0x3FFFE;
        }
        if(v < 0x7FFF) {
            return 0xFFFE;
        }
        if(v < 0xFFFF) {
            return 0x7FFE;
        }
        if(v >= 0x3FFFF) {
            throw new IllegalArgumentException("Can\'t represent a size of " + v + " in Constraints");
        }
        return 0x1FFE;
    }

    @Stable
    public static final long constrain-4WqzIAM(long v, long v1) {
        return IntSizeKt.IntSize(c.coerceIn(IntSize.getWidth-impl(v1), Constraints.getMinWidth-impl(v), Constraints.getMaxWidth-impl(v)), c.coerceIn(IntSize.getHeight-impl(v1), Constraints.getMinHeight-impl(v), Constraints.getMaxHeight-impl(v)));
    }

    public static final long constrain-N9IONVI(long v, long v1) {
        return ConstraintsKt.Constraints(c.coerceIn(Constraints.getMinWidth-impl(v1), Constraints.getMinWidth-impl(v), Constraints.getMaxWidth-impl(v)), c.coerceIn(Constraints.getMaxWidth-impl(v1), Constraints.getMinWidth-impl(v), Constraints.getMaxWidth-impl(v)), c.coerceIn(Constraints.getMinHeight-impl(v1), Constraints.getMinHeight-impl(v), Constraints.getMaxHeight-impl(v)), c.coerceIn(Constraints.getMaxHeight-impl(v1), Constraints.getMinHeight-impl(v), Constraints.getMaxHeight-impl(v)));
    }

    @Stable
    public static final int constrainHeight-K40F9xA(long v, int v1) {
        return c.coerceIn(v1, Constraints.getMinHeight-impl(v), Constraints.getMaxHeight-impl(v));
    }

    @Stable
    public static final int constrainWidth-K40F9xA(long v, int v1) {
        return c.coerceIn(v1, Constraints.getMinWidth-impl(v), Constraints.getMaxWidth-impl(v));
    }

    public static final long createConstraints(int v, int v1, int v2, int v3) {
        int v4 = v3 == 0x7FFFFFFF ? v2 : v3;
        int v5 = v1 == 0x7FFFFFFF ? v : v1;
        int v6 = 0;
        int v7 = ConstraintsKt.a(v5);
        if(ConstraintsKt.a(v4) + v7 > 0x1F) {
            throw new IllegalArgumentException("Can\'t represent a width of " + v5 + " and height of " + v4 + " in Constraints");
        }
        switch(v7) {
            case 15: {
                v6 = 1;
                break;
            }
            case 16: {
                v6 = 2;
                break;
            }
            case 18: {
                v6 = 3;
            }
        }
        int v8 = ((v6 & 2) >> 1) * 3 + ((v6 & 1) << 1);
        return ((long)(v1 + 1 & ~(v1 + 1 >> 0x1F))) << 33 | (((long)v6) | ((long)v) << 2) | ((long)v2) << v8 + 15 | ((long)(v3 + 1 & ~(v3 + 1 >> 0x1F))) << v8 + 46;
    }

    @Stable
    public static final boolean isSatisfiedBy-4WqzIAM(long v, long v1) {
        int v2 = IntSize.getWidth-impl(v1);
        if(Constraints.getMinWidth-impl(v) <= v2 && v2 <= Constraints.getMaxWidth-impl(v)) {
            int v3 = IntSize.getHeight-impl(v1);
            return Constraints.getMinHeight-impl(v) <= v3 && v3 <= Constraints.getMaxHeight-impl(v);
        }
        return false;
    }

    @Stable
    public static final long offset-NN6Ew-U(long v, int v1, int v2) {
        int v3 = Constraints.getMaxWidth-impl(v);
        int v4 = Constraints.getMaxHeight-impl(v);
        return ConstraintsKt.Constraints(c.coerceAtLeast(Constraints.getMinWidth-impl(v) + v1, 0), (v3 == 0x7FFFFFFF ? Constraints.getMaxWidth-impl(v) : c.coerceAtLeast(v3 + v1, 0)), c.coerceAtLeast(Constraints.getMinHeight-impl(v) + v2, 0), (v4 == 0x7FFFFFFF ? Constraints.getMaxHeight-impl(v) : c.coerceAtLeast(v4 + v2, 0)));
    }

    public static long offset-NN6Ew-U$default(long v, int v1, int v2, int v3, Object object0) {
        if((v3 & 1) != 0) {
            v1 = 0;
        }
        if((v3 & 2) != 0) {
            v2 = 0;
        }
        return ConstraintsKt.offset-NN6Ew-U(v, v1, v2);
    }
}

