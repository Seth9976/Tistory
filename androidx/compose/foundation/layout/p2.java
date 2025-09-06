package androidx.compose.foundation.layout;

import androidx.collection.IntIntPair;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.MultiContentMeasurePolicy;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import r0.a;

public final class p2 implements FlowLineMeasurePolicy, MultiContentMeasurePolicy {
    public final boolean a;
    public final Horizontal b;
    public final Vertical c;
    public final float d;
    public final CrossAxisAlignment e;
    public final float f;
    public final int g;
    public final int h;
    public final FlowLayoutOverflowState i;
    public final Lambda j;
    public final Lambda k;
    public final Lambda l;

    public p2(boolean z, Horizontal arrangement$Horizontal0, Vertical arrangement$Vertical0, float f, CrossAxisAlignment crossAxisAlignment0, float f1, int v, int v1, FlowLayoutOverflowState flowLayoutOverflowState0) {
        this.a = z;
        this.b = arrangement$Horizontal0;
        this.c = arrangement$Vertical0;
        this.d = f;
        this.e = crossAxisAlignment0;
        this.f = f1;
        this.g = v;
        this.h = v1;
        this.i = flowLayoutOverflowState0;
        h2 h20 = z ? h2.w : i2.w;
        this.j = h20;
        l2 l20 = z ? l2.w : m2.w;
        this.k = l20;
        n2 n20 = z ? n2.w : o2.w;
        this.l = n20;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof p2)) {
            return false;
        }
        if(this.a != ((p2)object0).a) {
            return false;
        }
        if(!Intrinsics.areEqual(this.b, ((p2)object0).b)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.c, ((p2)object0).c)) {
            return false;
        }
        if(!Dp.equals-impl0(this.d, ((p2)object0).d)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.e, ((p2)object0).e)) {
            return false;
        }
        if(!Dp.equals-impl0(this.f, ((p2)object0).f)) {
            return false;
        }
        if(this.g != ((p2)object0).g) {
            return false;
        }
        return this.h == ((p2)object0).h ? Intrinsics.areEqual(this.i, ((p2)object0).i) : false;
    }

    @Override  // androidx.compose.foundation.layout.FlowLineMeasurePolicy
    public final CrossAxisAlignment getCrossAxisAlignment() {
        return this.e;
    }

    @Override  // androidx.compose.foundation.layout.FlowLineMeasurePolicy
    public final Horizontal getHorizontalArrangement() {
        return this.b;
    }

    @Override  // androidx.compose.foundation.layout.FlowLineMeasurePolicy
    public final Vertical getVerticalArrangement() {
        return this.c;
    }

    @Override
    public final int hashCode() {
        return this.i.hashCode() + a.c(this.h, a.c(this.g, a.C(this.f, (this.e.hashCode() + a.C(this.d, (this.c.hashCode() + (this.b.hashCode() + Boolean.hashCode(this.a) * 0x1F) * 0x1F) * 0x1F, 0x1F)) * 0x1F, 0x1F), 0x1F), 0x1F);
    }

    @Override  // androidx.compose.foundation.layout.FlowLineMeasurePolicy
    public final boolean isHorizontal() {
        return this.a;
    }

    @Override  // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public final int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope0, List list0, int v) {
        List list1 = (List)CollectionsKt___CollectionsKt.getOrNull(list0, 1);
        IntrinsicMeasurable intrinsicMeasurable0 = null;
        IntrinsicMeasurable intrinsicMeasurable1 = list1 == null ? null : ((IntrinsicMeasurable)CollectionsKt___CollectionsKt.firstOrNull(list1));
        List list2 = (List)CollectionsKt___CollectionsKt.getOrNull(list0, 2);
        if(list2 != null) {
            intrinsicMeasurable0 = (IntrinsicMeasurable)CollectionsKt___CollectionsKt.firstOrNull(list2);
        }
        long v1 = ConstraintsKt.Constraints$default(0, v, 0, 0, 13, null);
        this.i.setOverflowMeasurables--hBUhpc$foundation_layout_release(intrinsicMeasurable1, intrinsicMeasurable0, this.a, v1);
        float f = this.d;
        if(this.a) {
            List list3 = (List)CollectionsKt___CollectionsKt.firstOrNull(list0);
            if(list3 == null) {
                list3 = CollectionsKt__CollectionsKt.emptyList();
            }
            int v2 = intrinsicMeasureScope0.roundToPx-0680j_4(f);
            int v3 = intrinsicMeasureScope0.roundToPx-0680j_4(this.f);
            return IntIntPair.getFirst-impl(FlowLayoutKt.a(list3, ((Function3)this.l), ((Function3)this.k), v, v2, v3, this.g, this.h, this.i));
        }
        List list4 = (List)CollectionsKt___CollectionsKt.firstOrNull(list0);
        if(list4 == null) {
            list4 = CollectionsKt__CollectionsKt.emptyList();
        }
        int v4 = intrinsicMeasureScope0.roundToPx-0680j_4(f);
        return FlowLayoutKt.access$maxIntrinsicMainAxisSize(list4, ((Function3)this.j), v, v4, this.g);
    }

    @Override  // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public final int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope0, List list0, int v) {
        List list1 = (List)CollectionsKt___CollectionsKt.getOrNull(list0, 1);
        IntrinsicMeasurable intrinsicMeasurable0 = null;
        IntrinsicMeasurable intrinsicMeasurable1 = list1 == null ? null : ((IntrinsicMeasurable)CollectionsKt___CollectionsKt.firstOrNull(list1));
        List list2 = (List)CollectionsKt___CollectionsKt.getOrNull(list0, 2);
        if(list2 != null) {
            intrinsicMeasurable0 = (IntrinsicMeasurable)CollectionsKt___CollectionsKt.firstOrNull(list2);
        }
        long v1 = ConstraintsKt.Constraints$default(0, 0, 0, v, 7, null);
        this.i.setOverflowMeasurables--hBUhpc$foundation_layout_release(intrinsicMeasurable1, intrinsicMeasurable0, this.a, v1);
        float f = this.d;
        if(this.a) {
            List list3 = (List)CollectionsKt___CollectionsKt.firstOrNull(list0);
            if(list3 == null) {
                list3 = CollectionsKt__CollectionsKt.emptyList();
            }
            int v2 = intrinsicMeasureScope0.roundToPx-0680j_4(f);
            return FlowLayoutKt.access$maxIntrinsicMainAxisSize(list3, ((Function3)this.j), v, v2, this.g);
        }
        List list4 = (List)CollectionsKt___CollectionsKt.firstOrNull(list0);
        if(list4 == null) {
            list4 = CollectionsKt__CollectionsKt.emptyList();
        }
        int v3 = intrinsicMeasureScope0.roundToPx-0680j_4(f);
        int v4 = intrinsicMeasureScope0.roundToPx-0680j_4(this.f);
        return IntIntPair.getFirst-impl(FlowLayoutKt.a(list4, ((Function3)this.l), ((Function3)this.k), v, v3, v4, this.g, this.h, this.i));
    }

    @Override  // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public final MeasureResult measure-3p2s80s(MeasureScope measureScope0, List list0, long v) {
        if(this.h != 0 && this.g != 0 && !list0.isEmpty()) {
            FlowLayoutOverflowState flowLayoutOverflowState0 = this.i;
            if(Constraints.getMaxHeight-impl(v) != 0 || flowLayoutOverflowState0.getType$foundation_layout_release() == OverflowType.Visible) {
                Object object0 = CollectionsKt___CollectionsKt.first(list0);
                if(((List)object0).isEmpty()) {
                    return MeasureScope.layout$default(measureScope0, 0, 0, null, k2.w, 4, null);
                }
                List list1 = (List)CollectionsKt___CollectionsKt.getOrNull(list0, 1);
                Measurable measurable0 = null;
                Measurable measurable1 = list1 == null ? null : ((Measurable)CollectionsKt___CollectionsKt.firstOrNull(list1));
                List list2 = (List)CollectionsKt___CollectionsKt.getOrNull(list0, 2);
                if(list2 != null) {
                    measurable0 = (Measurable)CollectionsKt___CollectionsKt.firstOrNull(list2);
                }
                flowLayoutOverflowState0.setItemCount$foundation_layout_release(((List)object0).size());
                this.i.setOverflowMeasurables--hBUhpc$foundation_layout_release(this, measurable1, measurable0, v);
                Iterator iterator0 = ((List)object0).iterator();
                long v1 = OrientationIndependentConstraints.constructor-impl(v, (this.a ? LayoutOrientation.Horizontal : LayoutOrientation.Vertical));
                return FlowLayoutKt.breakDownItems-di9J0FM(measureScope0, this, iterator0, this.d, this.f, v1, this.g, this.h, this.i);
            }
        }
        return MeasureScope.layout$default(measureScope0, 0, 0, null, j2.w, 4, null);
    }

    @Override  // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public final int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope0, List list0, int v) {
        List list1 = (List)CollectionsKt___CollectionsKt.getOrNull(list0, 1);
        IntrinsicMeasurable intrinsicMeasurable0 = null;
        IntrinsicMeasurable intrinsicMeasurable1 = list1 == null ? null : ((IntrinsicMeasurable)CollectionsKt___CollectionsKt.firstOrNull(list1));
        List list2 = (List)CollectionsKt___CollectionsKt.getOrNull(list0, 2);
        if(list2 != null) {
            intrinsicMeasurable0 = (IntrinsicMeasurable)CollectionsKt___CollectionsKt.firstOrNull(list2);
        }
        long v1 = ConstraintsKt.Constraints$default(0, v, 0, 0, 13, null);
        this.i.setOverflowMeasurables--hBUhpc$foundation_layout_release(intrinsicMeasurable1, intrinsicMeasurable0, this.a, v1);
        Lambda lambda0 = this.k;
        Lambda lambda1 = this.l;
        float f = this.f;
        float f1 = this.d;
        if(this.a) {
            List list3 = (List)CollectionsKt___CollectionsKt.firstOrNull(list0);
            if(list3 == null) {
                list3 = CollectionsKt__CollectionsKt.emptyList();
            }
            return IntIntPair.getFirst-impl(FlowLayoutKt.a(list3, ((Function3)lambda1), ((Function3)lambda0), v, intrinsicMeasureScope0.roundToPx-0680j_4(f1), intrinsicMeasureScope0.roundToPx-0680j_4(f), this.g, this.h, this.i));
        }
        List list4 = (List)CollectionsKt___CollectionsKt.firstOrNull(list0);
        if(list4 == null) {
            list4 = CollectionsKt__CollectionsKt.emptyList();
        }
        return FlowLayoutKt.access$minIntrinsicMainAxisSize(list4, ((Function3)lambda1), ((Function3)lambda0), v, intrinsicMeasureScope0.roundToPx-0680j_4(f1), intrinsicMeasureScope0.roundToPx-0680j_4(f), this.g, this.h, this.i);
    }

    @Override  // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public final int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope0, List list0, int v) {
        List list1 = (List)CollectionsKt___CollectionsKt.getOrNull(list0, 1);
        IntrinsicMeasurable intrinsicMeasurable0 = null;
        IntrinsicMeasurable intrinsicMeasurable1 = list1 == null ? null : ((IntrinsicMeasurable)CollectionsKt___CollectionsKt.firstOrNull(list1));
        List list2 = (List)CollectionsKt___CollectionsKt.getOrNull(list0, 2);
        if(list2 != null) {
            intrinsicMeasurable0 = (IntrinsicMeasurable)CollectionsKt___CollectionsKt.firstOrNull(list2);
        }
        long v1 = ConstraintsKt.Constraints$default(0, 0, 0, v, 7, null);
        this.i.setOverflowMeasurables--hBUhpc$foundation_layout_release(intrinsicMeasurable1, intrinsicMeasurable0, this.a, v1);
        Lambda lambda0 = this.k;
        Lambda lambda1 = this.l;
        float f = this.f;
        float f1 = this.d;
        if(this.a) {
            List list3 = (List)CollectionsKt___CollectionsKt.firstOrNull(list0);
            if(list3 == null) {
                list3 = CollectionsKt__CollectionsKt.emptyList();
            }
            return FlowLayoutKt.access$minIntrinsicMainAxisSize(list3, ((Function3)lambda1), ((Function3)lambda0), v, intrinsicMeasureScope0.roundToPx-0680j_4(f1), intrinsicMeasureScope0.roundToPx-0680j_4(f), this.g, this.h, this.i);
        }
        List list4 = (List)CollectionsKt___CollectionsKt.firstOrNull(list0);
        if(list4 == null) {
            list4 = CollectionsKt__CollectionsKt.emptyList();
        }
        return IntIntPair.getFirst-impl(FlowLayoutKt.a(list4, ((Function3)lambda1), ((Function3)lambda0), v, intrinsicMeasureScope0.roundToPx-0680j_4(f1), intrinsicMeasureScope0.roundToPx-0680j_4(f), this.g, this.h, this.i));
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("FlowMeasurePolicy(isHorizontal=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", horizontalArrangement=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", verticalArrangement=");
        stringBuilder0.append(this.c);
        stringBuilder0.append(", mainAxisSpacing=");
        a.u(this.d, ", crossAxisAlignment=", stringBuilder0);
        stringBuilder0.append(this.e);
        stringBuilder0.append(", crossAxisArrangementSpacing=");
        a.u(this.f, ", maxItemsInMainAxis=", stringBuilder0);
        stringBuilder0.append(this.g);
        stringBuilder0.append(", maxLines=");
        stringBuilder0.append(this.h);
        stringBuilder0.append(", overflow=");
        stringBuilder0.append(this.i);
        stringBuilder0.append(')');
        return stringBuilder0.toString();
    }
}

