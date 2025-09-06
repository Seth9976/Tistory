package b;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class g extends p {
    public final List a;

    public g(List list0) {
        Intrinsics.checkNotNullParameter(list0, "kdPhoto");
        super(0);
        this.a = list0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof g ? Intrinsics.areEqual(this.a, ((g)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "HistoryLoaded(kdPhoto=" + this.a + ")";
    }
}

