package androidx.compose.foundation.layout;

import a5.b;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;

public final class j1 implements WindowInsets {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public j1(int v, int v1, int v2, int v3) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof j1 ? this.a == ((j1)object0).a && this.b == ((j1)object0).b && this.c == ((j1)object0).c && this.d == ((j1)object0).d : false;
    }

    @Override  // androidx.compose.foundation.layout.WindowInsets
    public final int getBottom(Density density0) {
        return this.d;
    }

    @Override  // androidx.compose.foundation.layout.WindowInsets
    public final int getLeft(Density density0, LayoutDirection layoutDirection0) {
        return this.a;
    }

    @Override  // androidx.compose.foundation.layout.WindowInsets
    public final int getRight(Density density0, LayoutDirection layoutDirection0) {
        return this.c;
    }

    @Override  // androidx.compose.foundation.layout.WindowInsets
    public final int getTop(Density density0) {
        return this.b;
    }

    @Override
    public final int hashCode() {
        return ((this.a * 0x1F + this.b) * 0x1F + this.c) * 0x1F + this.d;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("Insets(left=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", top=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", right=");
        stringBuilder0.append(this.c);
        stringBuilder0.append(", bottom=");
        return b.p(stringBuilder0, this.d, ')');
    }
}

