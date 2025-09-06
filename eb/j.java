package eb;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.ui.graphics.Color;
import kotlin.jvm.internal.Intrinsics;
import r0.a;

public final class j {
    public final long a;
    public final boolean b;
    public final BorderStroke c;

    public j(long v, boolean z, int v1) {
        if((v1 & 2) != 0) {
            z = false;
        }
        this(v, z, null);
    }

    public j(long v, boolean z, BorderStroke borderStroke0) {
        this.a = v;
        this.b = z;
        this.c = borderStroke0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof j)) {
            return false;
        }
        if(!Color.equals-impl0(this.a, ((j)object0).a)) {
            return false;
        }
        return this.b == ((j)object0).b ? Intrinsics.areEqual(this.c, ((j)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        int v = a.e(Color.hashCode-impl(this.a) * 0x1F, 0x1F, this.b);
        return this.c == null ? v : v + this.c.hashCode();
    }

    @Override
    public final String toString() {
        return "PaletteColor(colorValue=" + Color.toString-impl(this.a) + ", isDarkColor=" + this.b + ", border=" + this.c + ")";
    }
}

