package b;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class n extends p {
    public final List a;

    public n(List list0) {
        Intrinsics.checkNotNullParameter(list0, "updatedList");
        super(0);
        this.a = list0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof n ? Intrinsics.areEqual(this.a, ((n)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "UpdateMultiplePhoto(updatedList=" + this.a + ")";
    }
}

