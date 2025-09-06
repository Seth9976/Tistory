package androidx.room;

import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

public final class d implements Comparable {
    public final List a;
    public final int b;
    public final int c;
    public static final AmbiguousColumnResolver.Solution.Companion d;
    public static final d e;

    static {
        d.d = new AmbiguousColumnResolver.Solution.Companion(null);
        d.e = new d(CollectionsKt__CollectionsKt.emptyList(), 0x7FFFFFFF, 0x7FFFFFFF);
    }

    public d(List list0, int v, int v1) {
        Intrinsics.checkNotNullParameter(list0, "matches");
        super();
        this.a = list0;
        this.b = v;
        this.c = v1;
    }

    @Override
    public final int compareTo(Object object0) {
        Intrinsics.checkNotNullParameter(((d)object0), "other");
        int v = Intrinsics.compare(this.c, ((d)object0).c);
        return v == 0 ? Intrinsics.compare(this.b, ((d)object0).b) : v;
    }
}

