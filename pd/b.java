package pd;

import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;

public final class b implements Comparator {
    public final int a;
    public final Comparator b;
    public final Comparator c;

    public b(Comparator comparator0, Comparator comparator1, int v) {
        this.a = v;
        this.b = comparator0;
        this.c = comparator1;
        super();
    }

    @Override
    public final int compare(Object object0, Object object1) {
        if(this.a != 0) {
            Intrinsics.checkNotNullParameter(this.b, "$this_then");
            Intrinsics.checkNotNullParameter(this.c, "$comparator");
            int v = this.b.compare(object0, object1);
            return v == 0 ? this.c.compare(object0, object1) : v;
        }
        Intrinsics.checkNotNullParameter(this.b, "$this_thenDescending");
        Intrinsics.checkNotNullParameter(this.c, "$comparator");
        int v1 = this.b.compare(object0, object1);
        return v1 == 0 ? this.c.compare(object1, object0) : v1;
    }
}

