package androidx.compose.foundation.layout;

import a5.b;
import androidx.compose.ui.unit.Dp;
import java.util.List;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import r0.a;

public final class g2 implements FlowLineMeasurePolicy {
    public final boolean a;
    public final Horizontal b;
    public final Vertical c;
    public final float d;
    public final CrossAxisAlignment e;
    public final float f;
    public final int g;
    public final int h;
    public final int i;
    public final FlowLayoutOverflowState j;
    public final List k;
    public final Function4 l;

    public g2(boolean z, Horizontal arrangement$Horizontal0, Vertical arrangement$Vertical0, float f, CrossAxisAlignment crossAxisAlignment0, float f1, int v, int v1, int v2, FlowLayoutOverflowState flowLayoutOverflowState0, List list0, Function4 function40) {
        this.a = z;
        this.b = arrangement$Horizontal0;
        this.c = arrangement$Vertical0;
        this.d = f;
        this.e = crossAxisAlignment0;
        this.f = f1;
        this.g = v;
        this.h = v1;
        this.i = v2;
        this.j = flowLayoutOverflowState0;
        this.k = list0;
        this.l = function40;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof g2)) {
            return false;
        }
        if(this.a != ((g2)object0).a) {
            return false;
        }
        if(!Intrinsics.areEqual(this.b, ((g2)object0).b)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.c, ((g2)object0).c)) {
            return false;
        }
        if(!Dp.equals-impl0(this.d, ((g2)object0).d)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.e, ((g2)object0).e)) {
            return false;
        }
        if(!Dp.equals-impl0(this.f, ((g2)object0).f)) {
            return false;
        }
        if(this.g != ((g2)object0).g) {
            return false;
        }
        if(this.h != ((g2)object0).h) {
            return false;
        }
        if(this.i != ((g2)object0).i) {
            return false;
        }
        if(!Intrinsics.areEqual(this.j, ((g2)object0).j)) {
            return false;
        }
        return Intrinsics.areEqual(this.k, ((g2)object0).k) ? Intrinsics.areEqual(this.l, ((g2)object0).l) : false;
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
        return this.l.hashCode() + b.c(this.k, (this.j.hashCode() + a.c(this.i, a.c(this.h, a.c(this.g, a.C(this.f, (this.e.hashCode() + a.C(this.d, (this.c.hashCode() + (this.b.hashCode() + Boolean.hashCode(this.a) * 0x1F) * 0x1F) * 0x1F, 0x1F)) * 0x1F, 0x1F), 0x1F), 0x1F), 0x1F)) * 0x1F, 0x1F);
    }

    @Override  // androidx.compose.foundation.layout.FlowLineMeasurePolicy
    public final boolean isHorizontal() {
        return this.a;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("FlowMeasureLazyPolicy(isHorizontal=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", horizontalArrangement=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", verticalArrangement=");
        stringBuilder0.append(this.c);
        stringBuilder0.append(", mainAxisSpacing=");
        a.u(this.d, ", crossAxisAlignment=", stringBuilder0);
        stringBuilder0.append(this.e);
        stringBuilder0.append(", crossAxisArrangementSpacing=");
        a.u(this.f, ", itemCount=", stringBuilder0);
        stringBuilder0.append(this.g);
        stringBuilder0.append(", maxLines=");
        stringBuilder0.append(this.h);
        stringBuilder0.append(", maxItemsInMainAxis=");
        stringBuilder0.append(this.i);
        stringBuilder0.append(", overflow=");
        stringBuilder0.append(this.j);
        stringBuilder0.append(", overflowComposables=");
        stringBuilder0.append(this.k);
        stringBuilder0.append(", getComposable=");
        stringBuilder0.append(this.l);
        stringBuilder0.append(')');
        return stringBuilder0.toString();
    }
}

