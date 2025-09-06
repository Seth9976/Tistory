package q1;

import androidx.compose.ui.graphics.colorspace.Rgb;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.c;

public final class d extends Lambda implements Function1 {
    public final int w;
    public final Rgb x;

    public d(Rgb rgb0, int v) {
        this.w = v;
        this.x = rgb0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        if(this.w != 0) {
            return c.coerceIn(this.x.getOetfOrig$ui_graphics_release().invoke(((Number)object0).doubleValue()), this.x.e, this.x.f);
        }
        double f = c.coerceIn(((Number)object0).doubleValue(), this.x.e, this.x.f);
        return this.x.getEotfOrig$ui_graphics_release().invoke(f);
    }
}

