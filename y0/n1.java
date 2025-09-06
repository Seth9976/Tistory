package y0;

import a5.b;
import kotlin.jvm.internal.Intrinsics;

public final class n1 {
    public final Object a;
    public final int b;

    public n1(Object object0, int v) {
        this.a = object0;
        this.b = v;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof n1)) {
            return false;
        }
        return Intrinsics.areEqual(this.a, ((n1)object0).a) ? this.b == ((n1)object0).b : false;
    }

    @Override
    public final int hashCode() {
        return this.b + this.a.hashCode() * 0x1F;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("SourceInformationSlotTableGroupIdentity(parentIdentity=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", index=");
        return b.p(stringBuilder0, this.b, ')');
    }
}

