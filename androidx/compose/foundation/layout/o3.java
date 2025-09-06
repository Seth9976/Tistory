package androidx.compose.foundation.layout;

import kotlin.jvm.internal.Intrinsics;

public final class o3 extends w2 {
    public final PaddingValues b;

    public o3(PaddingValues paddingValues0) {
        this.b = paddingValues0;
    }

    @Override  // androidx.compose.foundation.layout.w2
    public final WindowInsets a(WindowInsets windowInsets0) {
        return WindowInsetsKt.add(WindowInsetsKt.asInsets(this.b), windowInsets0);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof o3 ? Intrinsics.areEqual(((o3)object0).b, this.b) : false;
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode();
    }
}

