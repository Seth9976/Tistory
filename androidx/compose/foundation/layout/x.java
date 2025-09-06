package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref.IntRef;
import r0.a;

public final class x implements MeasurePolicy {
    public final Alignment a;
    public final boolean b;

    public x(Alignment alignment0, boolean z) {
        this.a = alignment0;
        this.b = z;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof x)) {
            return false;
        }
        return Intrinsics.areEqual(this.a, ((x)object0).a) ? this.b == ((x)object0).b : false;
    }

    @Override
    public final int hashCode() {
        return Boolean.hashCode(this.b) + this.a.hashCode() * 0x1F;
    }

    @Override  // androidx.compose.ui.layout.MeasurePolicy
    public final MeasureResult measure-3p2s80s(MeasureScope measureScope0, List list0, long v) {
        int v4;
        int v3;
        if(list0.isEmpty()) {
            return MeasureScope.layout$default(measureScope0, Constraints.getMinWidth-impl(v), Constraints.getMinHeight-impl(v), null, u.w, 4, null);
        }
        long v1 = this.b ? v : Constraints.copy-Zbe2FdA$default(v, 0, 0, 0, 0, 10, null);
        if(list0.size() == 1) {
            Object object0 = list0.get(0);
            if(!BoxKt.access$getMatchesParentSize(((Measurable)object0))) {
                Placeable placeable0 = ((Measurable)object0).measure-BRTryo0(v1);
                v3 = Math.max(Constraints.getMinWidth-impl(v), placeable0.getWidth());
                v4 = Math.max(Constraints.getMinHeight-impl(v), placeable0.getHeight());
                return MeasureScope.layout$default(measureScope0, v3, v4, null, new v(placeable0, ((Measurable)object0), measureScope0, v3, v4, this), 4, null);
            }
            v3 = Constraints.getMinWidth-impl(v);
            v4 = Constraints.getMinHeight-impl(v);
            return MeasureScope.layout$default(measureScope0, v3, v4, null, new v(((Measurable)object0).measure-BRTryo0(Constraints.Companion.fixed-JhjzzOo(Constraints.getMinWidth-impl(v), Constraints.getMinHeight-impl(v))), ((Measurable)object0), measureScope0, v3, v4, this), 4, null);
        }
        Placeable[] arr_placeable = new Placeable[list0.size()];
        IntRef ref$IntRef0 = new IntRef();
        ref$IntRef0.element = Constraints.getMinWidth-impl(v);
        IntRef ref$IntRef1 = new IntRef();
        ref$IntRef1.element = Constraints.getMinHeight-impl(v);
        int v5 = list0.size();
        boolean z = false;
        for(int v6 = 0; v6 < v5; ++v6) {
            Measurable measurable0 = (Measurable)list0.get(v6);
            if(BoxKt.access$getMatchesParentSize(measurable0)) {
                z = true;
            }
            else {
                Placeable placeable1 = measurable0.measure-BRTryo0(v1);
                arr_placeable[v6] = placeable1;
                ref$IntRef0.element = Math.max(ref$IntRef0.element, placeable1.getWidth());
                ref$IntRef1.element = Math.max(ref$IntRef1.element, placeable1.getHeight());
            }
        }
        if(z) {
            long v7 = ConstraintsKt.Constraints((ref$IntRef0.element == 0x7FFFFFFF ? 0 : ref$IntRef0.element), ref$IntRef0.element, (ref$IntRef1.element == 0x7FFFFFFF ? 0 : ref$IntRef1.element), ref$IntRef1.element);
            int v8 = list0.size();
            for(int v2 = 0; v2 < v8; ++v2) {
                Measurable measurable1 = (Measurable)list0.get(v2);
                if(BoxKt.access$getMatchesParentSize(measurable1)) {
                    arr_placeable[v2] = measurable1.measure-BRTryo0(v7);
                }
            }
        }
        return MeasureScope.layout$default(measureScope0, ref$IntRef0.element, ref$IntRef1.element, null, new w(arr_placeable, list0, measureScope0, ref$IntRef0, ref$IntRef1, this), 4, null);
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("BoxMeasurePolicy(alignment=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", propagateMinConstraints=");
        return a.p(stringBuilder0, this.b, ')');
    }
}

