package pd;

import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;

public final class f implements Comparator {
    public final int a;
    public static final f b;
    public static final f c;

    static {
        f.b = new f(0);
        f.c = new f(1);
    }

    public f(int v) {
        this.a = v;
        super();
    }

    @Override
    public final int compare(Object object0, Object object1) {
        if(this.a != 0) {
            Intrinsics.checkNotNullParameter(((Comparable)object0), "a");
            Intrinsics.checkNotNullParameter(((Comparable)object1), "b");
            return ((Comparable)object1).compareTo(((Comparable)object0));
        }
        Intrinsics.checkNotNullParameter(((Comparable)object0), "a");
        Intrinsics.checkNotNullParameter(((Comparable)object1), "b");
        return ((Comparable)object0).compareTo(((Comparable)object1));
    }

    @Override
    public final Comparator reversed() {
        return this.a == 0 ? f.c : f.b;
    }
}

