package y0;

import androidx.collection.MutableScatterMap;
import kotlin.jvm.internal.Intrinsics;

public final class x {
    public final MutableScatterMap a;

    public x(MutableScatterMap mutableScatterMap0) {
        this.a = mutableScatterMap0;
    }

    // 去混淆评级： 低(20)
    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof x && Intrinsics.areEqual(this.a, ((x)object0).a);
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "MutableScatterMultiMap(map=" + this.a + ')';
    }
}

