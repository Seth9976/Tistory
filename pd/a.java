package pd;

import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;

public final class a implements Comparator {
    public final int a;
    public final Comparator b;

    public a(Comparator comparator0, int v) {
        this.a = v;
        this.b = comparator0;
        super();
    }

    @Override
    public final int compare(Object object0, Object object1) {
        if(this.a != 0) {
            Comparator comparator0 = this.b;
            Intrinsics.checkNotNullParameter(comparator0, "$comparator");
            if(object0 == object1) {
                return 0;
            }
            if(object0 == null) {
                return -1;
            }
            return object1 == null ? 1 : comparator0.compare(object0, object1);
        }
        Comparator comparator1 = this.b;
        Intrinsics.checkNotNullParameter(comparator1, "$comparator");
        if(object0 == object1) {
            return 0;
        }
        if(object0 == null) {
            return 1;
        }
        return object1 == null ? -1 : comparator1.compare(object0, object1);
    }
}

