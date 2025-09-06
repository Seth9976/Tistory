package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.unit.Constraints;

public final class a3 extends c3 {
    public IntrinsicSize n;
    public boolean o;

    @Override  // androidx.compose.foundation.layout.c3
    public final long b(Measurable measurable0, long v) {
        int v1 = this.n == IntrinsicSize.Min ? measurable0.minIntrinsicHeight(Constraints.getMaxWidth-impl(v)) : measurable0.maxIntrinsicHeight(Constraints.getMaxWidth-impl(v));
        if(v1 < 0) {
            v1 = 0;
        }
        return Constraints.Companion.fixedHeight-OenEA2s(v1);
    }

    @Override  // androidx.compose.foundation.layout.c3
    public final boolean c() {
        return this.o;
    }

    @Override  // androidx.compose.foundation.layout.c3
    public final int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope0, IntrinsicMeasurable intrinsicMeasurable0, int v) {
        return this.n == IntrinsicSize.Min ? intrinsicMeasurable0.minIntrinsicHeight(v) : intrinsicMeasurable0.maxIntrinsicHeight(v);
    }

    @Override  // androidx.compose.foundation.layout.c3
    public final int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope0, IntrinsicMeasurable intrinsicMeasurable0, int v) {
        return this.n == IntrinsicSize.Min ? intrinsicMeasurable0.minIntrinsicHeight(v) : intrinsicMeasurable0.maxIntrinsicHeight(v);
    }
}

