package y0;

import androidx.compose.runtime.SnapshotMutationPolicy;
import kotlin.jvm.internal.Intrinsics;

public final class y implements SnapshotMutationPolicy {
    public final int a;
    public static final y b;
    public static final y c;
    public static final y d;

    static {
        y.b = new y(0);
        y.c = new y(1);
        y.d = new y(2);
    }

    public y(int v) {
        this.a = v;
        super();
    }

    @Override  // androidx.compose.runtime.SnapshotMutationPolicy
    public final boolean equivalent(Object object0, Object object1) {
        switch(this.a) {
            case 0: {
                return false;
            }
            case 1: {
                return object0 == object1;
            }
            default: {
                return Intrinsics.areEqual(object0, object1);
            }
        }
    }

    @Override
    public final String toString() {
        switch(this.a) {
            case 0: {
                return "NeverEqualPolicy";
            }
            case 1: {
                return "ReferentialEqualityPolicy";
            }
            default: {
                return "StructuralEqualityPolicy";
            }
        }
    }
}

