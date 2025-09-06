package b;

import kotlin.jvm.internal.Intrinsics;

public final class d extends p {
    public final s a;

    public d(s s0) {
        Intrinsics.checkNotNullParameter(s0, "screen");
        super(0);
        this.a = s0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof d ? this.a == ((d)object0).a : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "ChangeScreen(screen=" + this.a + ")";
    }
}

