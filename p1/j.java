package p1;

import android.graphics.ColorSpace.Rgb;
import android.graphics.ColorSpace;
import androidx.compose.ui.graphics.colorspace.DoubleFunction;

public final class j implements DoubleFunction {
    public final int a;
    public final ColorSpace b;

    public j(int v, ColorSpace colorSpace0) {
        this.a = v;
        this.b = colorSpace0;
        super();
    }

    @Override  // androidx.compose.ui.graphics.colorspace.DoubleFunction
    public final double invoke(double f) {
        return this.a == 0 ? ((ColorSpace.Rgb)this.b).getOetf().applyAsDouble(f) : ((ColorSpace.Rgb)this.b).getEotf().applyAsDouble(f);
    }
}

