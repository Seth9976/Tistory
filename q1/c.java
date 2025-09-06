package q1;

import androidx.compose.ui.graphics.colorspace.DoubleFunction;

public final class c implements DoubleFunction {
    public final int a;
    public final double b;

    public c(double f, int v) {
        this.a = v;
        this.b = f;
        super();
    }

    @Override  // androidx.compose.ui.graphics.colorspace.DoubleFunction
    public final double invoke(double f) {
        double f1 = this.b;
        if(this.a != 0) {
            if(f < 0.0) {
                f = 0.0;
            }
            return Math.pow(f, f1);
        }
        if(f < 0.0) {
            f = 0.0;
        }
        return Math.pow(f, 1.0 / f1);
    }
}

