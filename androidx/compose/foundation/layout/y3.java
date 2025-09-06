package androidx.compose.foundation.layout;

import kotlin.jvm.internal.Intrinsics;

public final class y3 extends w2 {
    public final WindowInsets b;

    public y3(WindowInsets windowInsets0) {
        this.b = windowInsets0;
    }

    @Override  // androidx.compose.foundation.layout.w2
    public final WindowInsets a(WindowInsets windowInsets0) {
        return WindowInsetsKt.union(this.b, windowInsets0);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof y3 ? Intrinsics.areEqual(((y3)object0).b, this.b) : false;
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode();
    }
}

