package p6;

import androidx.compose.ui.unit.Dp;
import r0.a;

public final class h {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;

    public h(float f, float f1, float f2, float f3, float f4) {
        this.a = f;
        this.b = f1;
        this.c = f2;
        this.d = f3;
        this.e = f4;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof h)) {
            return false;
        }
        if(!Dp.equals-impl0(this.a, ((h)object0).a)) {
            return false;
        }
        if(!Dp.equals-impl0(this.b, ((h)object0).b)) {
            return false;
        }
        if(!Dp.equals-impl0(this.c, ((h)object0).c)) {
            return false;
        }
        return Dp.equals-impl0(this.d, ((h)object0).d) ? Dp.equals-impl0(this.e, ((h)object0).e) : false;
    }

    @Override
    public final int hashCode() {
        return Dp.hashCode-impl(this.e) + a.C(this.d, a.C(this.c, a.C(this.b, Dp.hashCode-impl(this.a) * 0x1F, 0x1F), 0x1F), 0x1F);
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("SwipeRefreshIndicatorSizes(size=");
        a.u(this.a, ", arcRadius=", stringBuilder0);
        a.u(this.b, ", strokeWidth=", stringBuilder0);
        a.u(this.c, ", arrowWidth=", stringBuilder0);
        a.u(this.d, ", arrowHeight=", stringBuilder0);
        stringBuilder0.append(Dp.toString-impl(this.e));
        stringBuilder0.append(')');
        return stringBuilder0.toString();
    }
}

