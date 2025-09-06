package pd;

import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;

public final class g implements Comparator {
    public final Comparator a;

    public g(Comparator comparator0) {
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        super();
        this.a = comparator0;
    }

    @Override
    public final int compare(Object object0, Object object1) {
        return this.a.compare(object1, object0);
    }

    @Override
    public final Comparator reversed() {
        return this.a;
    }
}

