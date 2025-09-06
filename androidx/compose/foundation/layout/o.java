package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;

public final class o extends Node implements LayoutModifierNode {
    public float n;
    public boolean o;

    public final long b(long v, boolean z) {
        int v1 = Constraints.getMaxHeight-impl(v);
        if(v1 != 0x7FFFFFFF) {
            int v2 = Math.round(((float)v1) * this.n);
            if(v2 > 0) {
                long v3 = IntSizeKt.IntSize(v2, v1);
                return z && !ConstraintsKt.isSatisfiedBy-4WqzIAM(v, v3) ? 0L : v3;
            }
        }
        return 0L;
    }

    public final long c(long v, boolean z) {
        int v1 = Constraints.getMaxWidth-impl(v);
        if(v1 != 0x7FFFFFFF) {
            int v2 = Math.round(((float)v1) / this.n);
            if(v2 > 0) {
                long v3 = IntSizeKt.IntSize(v1, v2);
                return z && !ConstraintsKt.isSatisfiedBy-4WqzIAM(v, v3) ? 0L : v3;
            }
        }
        return 0L;
    }

    public final long d(long v, boolean z) {
        int v1 = Constraints.getMinHeight-impl(v);
        int v2 = Math.round(((float)v1) * this.n);
        if(v2 > 0) {
            long v3 = IntSizeKt.IntSize(v2, v1);
            return z && !ConstraintsKt.isSatisfiedBy-4WqzIAM(v, v3) ? 0L : v3;
        }
        return 0L;
    }

    public final long e(long v, boolean z) {
        int v1 = Constraints.getMinWidth-impl(v);
        int v2 = Math.round(((float)v1) / this.n);
        if(v2 > 0) {
            long v3 = IntSizeKt.IntSize(v1, v2);
            return z && !ConstraintsKt.isSatisfiedBy-4WqzIAM(v, v3) ? 0L : v3;
        }
        return 0L;
    }

    @Override  // androidx.compose.ui.node.LayoutModifierNode
    public final int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope0, IntrinsicMeasurable intrinsicMeasurable0, int v) {
        return v == 0x7FFFFFFF ? intrinsicMeasurable0.maxIntrinsicHeight(0x7FFFFFFF) : Math.round(((float)v) / this.n);
    }

    @Override  // androidx.compose.ui.node.LayoutModifierNode
    public final int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope0, IntrinsicMeasurable intrinsicMeasurable0, int v) {
        return v == 0x7FFFFFFF ? intrinsicMeasurable0.maxIntrinsicWidth(0x7FFFFFFF) : Math.round(((float)v) * this.n);
    }

    @Override  // androidx.compose.ui.node.LayoutModifierNode
    public final MeasureResult measure-3p2s80s(MeasureScope measureScope0, Measurable measurable0, long v) {
        long v1;
        if(this.o) {
            v1 = this.b(v, true);
            if(IntSize.equals-impl0(v1, 0L)) {
                v1 = this.c(v, true);
                if(IntSize.equals-impl0(v1, 0L)) {
                    v1 = this.d(v, true);
                    if(IntSize.equals-impl0(v1, 0L)) {
                        v1 = this.e(v, true);
                        if(IntSize.equals-impl0(v1, 0L)) {
                            v1 = this.b(v, false);
                            if(IntSize.equals-impl0(v1, 0L)) {
                                v1 = this.c(v, false);
                                if(IntSize.equals-impl0(v1, 0L)) {
                                    v1 = this.d(v, false);
                                    if(IntSize.equals-impl0(v1, 0L)) {
                                        v1 = this.e(v, false);
                                        if(IntSize.equals-impl0(v1, 0L)) {
                                            v1 = 0L;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        else {
            v1 = this.c(v, true);
            if(IntSize.equals-impl0(v1, 0L)) {
                v1 = this.b(v, true);
                if(IntSize.equals-impl0(v1, 0L)) {
                    v1 = this.e(v, true);
                    if(IntSize.equals-impl0(v1, 0L)) {
                        v1 = this.d(v, true);
                        if(IntSize.equals-impl0(v1, 0L)) {
                            v1 = this.c(v, false);
                            if(IntSize.equals-impl0(v1, 0L)) {
                                v1 = this.b(v, false);
                                if(IntSize.equals-impl0(v1, 0L)) {
                                    v1 = this.e(v, false);
                                    if(IntSize.equals-impl0(v1, 0L)) {
                                        v1 = this.d(v, false);
                                        if(IntSize.equals-impl0(v1, 0L)) {
                                            v1 = 0L;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if(!IntSize.equals-impl0(v1, 0L)) {
            v = Constraints.Companion.fixed-JhjzzOo(IntSize.getWidth-impl(v1), IntSize.getHeight-impl(v1));
        }
        Placeable placeable0 = measurable0.measure-BRTryo0(v);
        return MeasureScope.layout$default(measureScope0, placeable0.getWidth(), placeable0.getHeight(), null, new n(placeable0), 4, null);
    }

    @Override  // androidx.compose.ui.node.LayoutModifierNode
    public final int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope0, IntrinsicMeasurable intrinsicMeasurable0, int v) {
        return v == 0x7FFFFFFF ? intrinsicMeasurable0.minIntrinsicHeight(0x7FFFFFFF) : Math.round(((float)v) / this.n);
    }

    @Override  // androidx.compose.ui.node.LayoutModifierNode
    public final int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope0, IntrinsicMeasurable intrinsicMeasurable0, int v) {
        return v == 0x7FFFFFFF ? intrinsicMeasurable0.minIntrinsicWidth(0x7FFFFFFF) : Math.round(((float)v) * this.n);
    }
}

