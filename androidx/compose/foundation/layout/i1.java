package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import r0.a;

public final class i1 implements WindowInsets {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public i1(float f, float f1, float f2, float f3) {
        this.a = f;
        this.b = f1;
        this.c = f2;
        this.d = f3;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof i1 ? Dp.equals-impl0(this.a, ((i1)object0).a) && Dp.equals-impl0(this.b, ((i1)object0).b) && Dp.equals-impl0(this.c, ((i1)object0).c) && Dp.equals-impl0(this.d, ((i1)object0).d) : false;
    }

    @Override  // androidx.compose.foundation.layout.WindowInsets
    public final int getBottom(Density density0) {
        return density0.roundToPx-0680j_4(this.d);
    }

    @Override  // androidx.compose.foundation.layout.WindowInsets
    public final int getLeft(Density density0, LayoutDirection layoutDirection0) {
        return density0.roundToPx-0680j_4(this.a);
    }

    @Override  // androidx.compose.foundation.layout.WindowInsets
    public final int getRight(Density density0, LayoutDirection layoutDirection0) {
        return density0.roundToPx-0680j_4(this.c);
    }

    @Override  // androidx.compose.foundation.layout.WindowInsets
    public final int getTop(Density density0) {
        return density0.roundToPx-0680j_4(this.b);
    }

    @Override
    public final int hashCode() {
        return Dp.hashCode-impl(this.d) + a.C(this.c, a.C(this.b, Dp.hashCode-impl(this.a) * 0x1F, 0x1F), 0x1F);
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("Insets(left=");
        a.u(this.a, ", top=", stringBuilder0);
        a.u(this.b, ", right=", stringBuilder0);
        a.u(this.c, ", bottom=", stringBuilder0);
        stringBuilder0.append(Dp.toString-impl(this.d));
        stringBuilder0.append(')');
        return stringBuilder0.toString();
    }
}

