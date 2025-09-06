package u;

import androidx.compose.foundation.MarqueeSpacing;
import androidx.compose.ui.unit.Density;
import zd.c;

public final class x implements MarqueeSpacing {
    public final int a;
    public final float b;

    public x(float f, int v) {
        this.a = v;
        this.b = f;
        super();
    }

    @Override  // androidx.compose.foundation.MarqueeSpacing
    public final int calculateSpacing(Density density0, int v, int v1) {
        return this.a == 0 ? density0.roundToPx-0680j_4(this.b) : c.roundToInt(this.b * ((float)v1));
    }
}

