package q1;

import androidx.compose.ui.graphics.colorspace.DoubleFunction;
import androidx.compose.ui.graphics.colorspace.Rgb;
import kotlin.ranges.c;

public final class a implements DoubleFunction {
    public final int a;
    public final Rgb b;

    public a(Rgb rgb0, int v) {
        this.a = v;
        this.b = rgb0;
        super();
    }

    @Override  // androidx.compose.ui.graphics.colorspace.DoubleFunction
    public final double invoke(double f) {
        if(this.a != 0) {
            double f1 = c.coerceIn(f, this.b.e, this.b.f);
            return this.b.n.invoke(f1);
        }
        return c.coerceIn(this.b.k.invoke(f), this.b.e, this.b.f);
    }
}

