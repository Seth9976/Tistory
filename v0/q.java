package v0;

import r0.a;

public final class q {
    public final int a;
    public final int b;
    public final float c;

    public q(int v, int v1, float f) {
        this.a = v;
        this.b = v1;
        this.c = f;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof q)) {
            return false;
        }
        if(this.a != ((q)object0).a) {
            return false;
        }
        return this.b == ((q)object0).b ? Float.compare(this.c, ((q)object0).c) == 0 : false;
    }

    @Override
    public final int hashCode() {
        return Float.hashCode(this.c) + a.c(this.b, this.a * 0x1F, 0x1F);
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("ShiftPointRange(fromStepIndex=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", toStepIndex=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", steppedInterpolation=");
        return a.n(stringBuilder0, this.c, ')');
    }
}

