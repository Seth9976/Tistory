package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.Intrinsics;

public final class e3 implements WindowInsets {
    public final WindowInsets a;
    public final int b;

    public e3(WindowInsets windowInsets0, int v) {
        this.a = windowInsets0;
        this.b = v;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof e3 ? Intrinsics.areEqual(this.a, ((e3)object0).a) && WindowInsetsSides.equals-impl0(this.b, ((e3)object0).b) : false;
    }

    // 去混淆评级： 低(40)
    @Override  // androidx.compose.foundation.layout.WindowInsets
    public final int getBottom(Density density0) {
        return WindowInsetsSides.hasAny-bkgdKaI$foundation_layout_release(this.b, 0x20) ? this.a.getBottom(density0) : 0;
    }

    // 去混淆评级： 中等(70)
    @Override  // androidx.compose.foundation.layout.WindowInsets
    public final int getLeft(Density density0, LayoutDirection layoutDirection0) {
        return WindowInsetsSides.hasAny-bkgdKaI$foundation_layout_release(this.b, (layoutDirection0 == LayoutDirection.Ltr ? 8 : 2)) ? this.a.getLeft(density0, layoutDirection0) : 0;
    }

    // 去混淆评级： 中等(70)
    @Override  // androidx.compose.foundation.layout.WindowInsets
    public final int getRight(Density density0, LayoutDirection layoutDirection0) {
        return WindowInsetsSides.hasAny-bkgdKaI$foundation_layout_release(this.b, (layoutDirection0 == LayoutDirection.Ltr ? 4 : 1)) ? this.a.getRight(density0, layoutDirection0) : 0;
    }

    // 去混淆评级： 低(40)
    @Override  // androidx.compose.foundation.layout.WindowInsets
    public final int getTop(Density density0) {
        return WindowInsetsSides.hasAny-bkgdKaI$foundation_layout_release(this.b, 16) ? this.a.getTop(density0) : 0;
    }

    @Override
    public final int hashCode() {
        return WindowInsetsSides.hashCode-impl(this.b) + this.a.hashCode() * 0x1F;
    }

    @Override
    public final String toString() {
        return "(" + this.a + " only " + WindowInsetsSides.toString-impl(this.b) + ')';
    }
}

