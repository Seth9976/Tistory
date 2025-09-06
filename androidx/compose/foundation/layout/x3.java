package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.Intrinsics;

public final class x3 implements WindowInsets {
    public final WindowInsets a;
    public final WindowInsets b;

    public x3(WindowInsets windowInsets0, WindowInsets windowInsets1) {
        this.a = windowInsets0;
        this.b = windowInsets1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof x3 ? Intrinsics.areEqual(((x3)object0).a, this.a) && Intrinsics.areEqual(((x3)object0).b, this.b) : false;
    }

    @Override  // androidx.compose.foundation.layout.WindowInsets
    public final int getBottom(Density density0) {
        return Math.max(this.a.getBottom(density0), this.b.getBottom(density0));
    }

    @Override  // androidx.compose.foundation.layout.WindowInsets
    public final int getLeft(Density density0, LayoutDirection layoutDirection0) {
        return Math.max(this.a.getLeft(density0, layoutDirection0), this.b.getLeft(density0, layoutDirection0));
    }

    @Override  // androidx.compose.foundation.layout.WindowInsets
    public final int getRight(Density density0, LayoutDirection layoutDirection0) {
        return Math.max(this.a.getRight(density0, layoutDirection0), this.b.getRight(density0, layoutDirection0));
    }

    @Override  // androidx.compose.foundation.layout.WindowInsets
    public final int getTop(Density density0) {
        return Math.max(this.a.getTop(density0), this.b.getTop(density0));
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() * 0x1F + this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "(" + this.a + " ∪ " + this.b + ')';
    }
}

