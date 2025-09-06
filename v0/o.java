package v0;

import r0.a;

public final class o {
    public final float a;
    public final boolean b;

    public o(float f, boolean z) {
        this.a = f;
        this.b = z;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof o)) {
            return false;
        }
        return Float.compare(this.a, ((o)object0).a) == 0 ? this.b == ((o)object0).b : false;
    }

    @Override
    public final int hashCode() {
        return Boolean.hashCode(this.b) + Float.hashCode(this.a) * 0x1F;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("TmpKeyline(size=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", isAnchor=");
        return a.p(stringBuilder0, this.b, ')');
    }
}

