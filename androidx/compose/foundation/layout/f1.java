package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.c;

public final class f1 implements WindowInsets {
    public final WindowInsets a;
    public final WindowInsets b;

    public f1(WindowInsets windowInsets0, WindowInsets windowInsets1) {
        this.a = windowInsets0;
        this.b = windowInsets1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof f1 ? Intrinsics.areEqual(((f1)object0).a, this.a) && Intrinsics.areEqual(((f1)object0).b, this.b) : false;
    }

    @Override  // androidx.compose.foundation.layout.WindowInsets
    public final int getBottom(Density density0) {
        return c.coerceAtLeast(this.a.getBottom(density0) - this.b.getBottom(density0), 0);
    }

    @Override  // androidx.compose.foundation.layout.WindowInsets
    public final int getLeft(Density density0, LayoutDirection layoutDirection0) {
        return c.coerceAtLeast(this.a.getLeft(density0, layoutDirection0) - this.b.getLeft(density0, layoutDirection0), 0);
    }

    @Override  // androidx.compose.foundation.layout.WindowInsets
    public final int getRight(Density density0, LayoutDirection layoutDirection0) {
        return c.coerceAtLeast(this.a.getRight(density0, layoutDirection0) - this.b.getRight(density0, layoutDirection0), 0);
    }

    @Override  // androidx.compose.foundation.layout.WindowInsets
    public final int getTop(Density density0) {
        return c.coerceAtLeast(this.a.getTop(density0) - this.b.getTop(density0), 0);
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 0x1F;
    }

    @Override
    public final String toString() {
        return "(" + this.a + " - " + this.b + ')';
    }
}

