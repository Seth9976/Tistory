package b2;

import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;

public final class o implements Measurable {
    public final int a;
    public final IntrinsicMeasurable b;
    public final int c;
    public final int d;

    public o(IntrinsicMeasurable intrinsicMeasurable0, int v, int v1, int v2) {
        this.a = v2;
        this.b = intrinsicMeasurable0;
        this.c = v;
        this.d = v1;
        super();
    }

    @Override  // androidx.compose.ui.layout.IntrinsicMeasurable
    public final Object getParentData() {
        return this.b.getParentData();
    }

    @Override  // androidx.compose.ui.layout.IntrinsicMeasurable
    public final int maxIntrinsicHeight(int v) {
        return this.b.maxIntrinsicHeight(v);
    }

    @Override  // androidx.compose.ui.layout.IntrinsicMeasurable
    public final int maxIntrinsicWidth(int v) {
        return this.b.maxIntrinsicWidth(v);
    }

    @Override  // androidx.compose.ui.layout.Measurable
    public final Placeable measure-BRTryo0(long v) {
        if(this.a != 0) {
            int v1 = 0x7FFF;
            int v2 = this.c;
            IntrinsicMeasurable intrinsicMeasurable0 = this.b;
            if(this.d == 1) {
                int v3 = v2 == 2 ? intrinsicMeasurable0.maxIntrinsicWidth(Constraints.getMaxHeight-impl(v)) : intrinsicMeasurable0.minIntrinsicWidth(Constraints.getMaxHeight-impl(v));
                if(Constraints.getHasBoundedHeight-impl(v)) {
                    v1 = Constraints.getMaxHeight-impl(v);
                }
                return new p(v3, v1, 2);
            }
            int v4 = v2 == 2 ? intrinsicMeasurable0.maxIntrinsicHeight(Constraints.getMaxWidth-impl(v)) : intrinsicMeasurable0.minIntrinsicHeight(Constraints.getMaxWidth-impl(v));
            if(Constraints.getHasBoundedWidth-impl(v)) {
                v1 = Constraints.getMaxWidth-impl(v);
            }
            return new p(v1, v4, 2);
        }
        int v5 = 0x7FFF;
        int v6 = this.c;
        IntrinsicMeasurable intrinsicMeasurable1 = this.b;
        if(this.d == 1) {
            int v7 = v6 == 2 ? intrinsicMeasurable1.maxIntrinsicWidth(Constraints.getMaxHeight-impl(v)) : intrinsicMeasurable1.minIntrinsicWidth(Constraints.getMaxHeight-impl(v));
            if(Constraints.getHasBoundedHeight-impl(v)) {
                v5 = Constraints.getMaxHeight-impl(v);
            }
            return new p(v7, v5, 0);
        }
        int v8 = v6 == 2 ? intrinsicMeasurable1.maxIntrinsicHeight(Constraints.getMaxWidth-impl(v)) : intrinsicMeasurable1.minIntrinsicHeight(Constraints.getMaxWidth-impl(v));
        if(Constraints.getHasBoundedWidth-impl(v)) {
            v5 = Constraints.getMaxWidth-impl(v);
        }
        return new p(v5, v8, 0);
    }

    @Override  // androidx.compose.ui.layout.IntrinsicMeasurable
    public final int minIntrinsicHeight(int v) {
        return this.b.minIntrinsicHeight(v);
    }

    @Override  // androidx.compose.ui.layout.IntrinsicMeasurable
    public final int minIntrinsicWidth(int v) {
        return this.b.minIntrinsicWidth(v);
    }
}

