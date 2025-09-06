package n4;

import kotlin.jvm.internal.Intrinsics;

public final class h implements Comparable {
    public String a;
    public String b;

    @Override
    public final int compareTo(Object object0) {
        Intrinsics.checkNotNullParameter(((h)object0), "other");
        int v = Intrinsics.areEqual(this.a, ((h)object0).a) ? 2 : 0;
        return Intrinsics.areEqual(this.b, ((h)object0).b) ? v + 1 : v;
    }
}

