package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.Intrinsics;

public final class p3 implements WindowInsets {
    public final PaddingValues a;

    public p3(PaddingValues paddingValues0) {
        this.a = paddingValues0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof p3 ? Intrinsics.areEqual(((p3)object0).a, this.a) : false;
    }

    @Override  // androidx.compose.foundation.layout.WindowInsets
    public final int getBottom(Density density0) {
        return density0.roundToPx-0680j_4(this.a.calculateBottomPadding-D9Ej5fM());
    }

    @Override  // androidx.compose.foundation.layout.WindowInsets
    public final int getLeft(Density density0, LayoutDirection layoutDirection0) {
        return density0.roundToPx-0680j_4(this.a.calculateLeftPadding-u2uoSUM(layoutDirection0));
    }

    @Override  // androidx.compose.foundation.layout.WindowInsets
    public final int getRight(Density density0, LayoutDirection layoutDirection0) {
        return density0.roundToPx-0680j_4(this.a.calculateRightPadding-u2uoSUM(layoutDirection0));
    }

    @Override  // androidx.compose.foundation.layout.WindowInsets
    public final int getTop(Density density0) {
        return density0.roundToPx-0680j_4(this.a.calculateTopPadding-D9Ej5fM());
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        float f = this.a.calculateLeftPadding-u2uoSUM(LayoutDirection.Ltr);
        float f1 = this.a.calculateTopPadding-D9Ej5fM();
        float f2 = this.a.calculateRightPadding-u2uoSUM(LayoutDirection.Ltr);
        float f3 = this.a.calculateBottomPadding-D9Ej5fM();
        return "PaddingValues(" + Dp.toString-impl(f) + ", " + Dp.toString-impl(f1) + ", " + Dp.toString-impl(f2) + ", " + Dp.toString-impl(f3) + ')';
    }
}

