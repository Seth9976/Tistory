package androidx.room;

import a5.b;
import kotlin.jvm.internal.Intrinsics;

public final class c {
    public final String a;
    public final int b;

    public c(String s, int v) {
        Intrinsics.checkNotNullParameter(s, "name");
        super();
        this.a = s;
        this.b = v;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof c)) {
            return false;
        }
        return Intrinsics.areEqual(this.a, ((c)object0).a) ? this.b == ((c)object0).b : false;
    }

    @Override
    public final int hashCode() {
        return this.b + this.a.hashCode() * 0x1F;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("ResultColumn(name=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", index=");
        return b.p(stringBuilder0, this.b, ')');
    }
}

