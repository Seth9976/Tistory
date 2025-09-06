package b;

import kotlin.jvm.internal.Intrinsics;

public final class j extends p {
    public final s a;
    public final int b;

    public j(s s0, int v) {
        Intrinsics.checkNotNullParameter(s0, "screen");
        super(0);
        this.a = s0;
        this.b = v;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof j)) {
            return false;
        }
        return this.a == ((j)object0).a ? this.b == ((j)object0).b : false;
    }

    @Override
    public final int hashCode() {
        return this.b + this.a.hashCode() * 0x1F;
    }

    @Override
    public final String toString() {
        return "RestoreUIState(screen=" + this.a + ", selectedIndex=" + this.b + ")";
    }
}

