package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.Intrinsics;

public final class z2 implements PaddingValues {
    public final WindowInsets a;
    public final Density b;

    public z2(WindowInsets windowInsets0, Density density0) {
        this.a = windowInsets0;
        this.b = density0;
    }

    @Override  // androidx.compose.foundation.layout.PaddingValues
    public final float calculateBottomPadding-D9Ej5fM() {
        int v = this.a.getBottom(this.b);
        return this.b.toDp-u2uoSUM(v);
    }

    @Override  // androidx.compose.foundation.layout.PaddingValues
    public final float calculateLeftPadding-u2uoSUM(LayoutDirection layoutDirection0) {
        int v = this.a.getLeft(this.b, layoutDirection0);
        return this.b.toDp-u2uoSUM(v);
    }

    @Override  // androidx.compose.foundation.layout.PaddingValues
    public final float calculateRightPadding-u2uoSUM(LayoutDirection layoutDirection0) {
        int v = this.a.getRight(this.b, layoutDirection0);
        return this.b.toDp-u2uoSUM(v);
    }

    @Override  // androidx.compose.foundation.layout.PaddingValues
    public final float calculateTopPadding-D9Ej5fM() {
        int v = this.a.getTop(this.b);
        return this.b.toDp-u2uoSUM(v);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof z2 ? Intrinsics.areEqual(this.a, ((z2)object0).a) && Intrinsics.areEqual(this.b, ((z2)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 0x1F;
    }

    @Override
    public final String toString() {
        return "InsetsPaddingValues(insets=" + this.a + ", density=" + this.b + ')';
    }
}

