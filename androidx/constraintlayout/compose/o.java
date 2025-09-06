package androidx.constraintlayout.compose;

import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.MeasurePolicy.DefaultImpls;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class o implements MeasurePolicy {
    public final Measurer a;
    public final ConstraintSet b;
    public final int c;

    public o(Measurer measurer0, ConstraintSet constraintSet0, int v) {
        this.a = measurer0;
        this.b = constraintSet0;
        this.c = v;
    }

    @Override  // androidx.compose.ui.layout.MeasurePolicy
    public final int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope0, List list0, int v) {
        return DefaultImpls.maxIntrinsicHeight(this, intrinsicMeasureScope0, list0, v);
    }

    @Override  // androidx.compose.ui.layout.MeasurePolicy
    public final int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope0, List list0, int v) {
        return DefaultImpls.maxIntrinsicWidth(this, intrinsicMeasureScope0, list0, v);
    }

    @Override  // androidx.compose.ui.layout.MeasurePolicy
    public final MeasureResult measure-3p2s80s(MeasureScope measureScope0, List list0, long v) {
        Intrinsics.checkNotNullParameter(measureScope0, "$this$MeasurePolicy");
        Intrinsics.checkNotNullParameter(list0, "measurables");
        LayoutDirection layoutDirection0 = measureScope0.getLayoutDirection();
        long v1 = this.a.performMeasure-DjhGOtQ(v, layoutDirection0, this.b, list0, this.c, measureScope0);
        return MeasureScope.layout$default(measureScope0, IntSize.getWidth-impl(v1), IntSize.getHeight-impl(v1), null, new m(this.a, list0, 1), 4, null);
    }

    @Override  // androidx.compose.ui.layout.MeasurePolicy
    public final int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope0, List list0, int v) {
        return DefaultImpls.minIntrinsicHeight(this, intrinsicMeasureScope0, list0, v);
    }

    @Override  // androidx.compose.ui.layout.MeasurePolicy
    public final int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope0, List list0, int v) {
        return DefaultImpls.minIntrinsicWidth(this, intrinsicMeasureScope0, list0, v);
    }
}

