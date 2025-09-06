package androidx.constraintlayout.compose;

import aa.o;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.MeasurePolicy.DefaultImpls;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class e0 implements MeasurePolicy {
    public final MotionMeasurer a;
    public final ConstraintSet b;
    public final ConstraintSet c;
    public final Transition d;
    public final int e;
    public final MutableState f;

    public e0(MotionMeasurer motionMeasurer0, ConstraintSet constraintSet0, ConstraintSet constraintSet1, Transition transition0, int v, MutableState mutableState0) {
        this.a = motionMeasurer0;
        this.b = constraintSet0;
        this.c = constraintSet1;
        this.d = transition0;
        this.e = v;
        this.f = mutableState0;
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
        float f = ((Number)this.f.getValue()).floatValue();
        long v1 = this.a.performInterpolationMeasure-OQbXsTc(v, layoutDirection0, this.b, this.c, this.d, list0, this.e, f, measureScope0);
        return MeasureScope.layout$default(measureScope0, IntSize.getWidth-impl(v1), IntSize.getHeight-impl(v1), null, new o(18, this.a, list0), 4, null);
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

