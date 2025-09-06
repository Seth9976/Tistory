package q1;

import androidx.compose.ui.graphics.colorspace.ColorSpaceKt;
import androidx.compose.ui.graphics.colorspace.DoubleFunction;
import androidx.compose.ui.graphics.colorspace.TransferParameters;

public final class b implements DoubleFunction {
    public final int a;
    public final TransferParameters b;

    public b(TransferParameters transferParameters0, int v) {
        this.a = v;
        this.b = transferParameters0;
        super();
    }

    @Override  // androidx.compose.ui.graphics.colorspace.DoubleFunction
    public final double invoke(double f) {
        TransferParameters transferParameters0 = this.b;
        switch(this.a) {
            case 0: {
                return ColorSpaceKt.rcpResponse(f, transferParameters0.getA(), transferParameters0.getB(), transferParameters0.getC(), transferParameters0.getD(), transferParameters0.getE(), transferParameters0.getF(), transferParameters0.getGamma());
            }
            case 1: {
                return ColorSpaceKt.response(f, transferParameters0.getA(), transferParameters0.getB(), transferParameters0.getC(), transferParameters0.getD(), transferParameters0.getGamma());
            }
            case 2: {
                return ColorSpaceKt.response(f, transferParameters0.getA(), transferParameters0.getB(), transferParameters0.getC(), transferParameters0.getD(), transferParameters0.getE(), transferParameters0.getF(), transferParameters0.getGamma());
            }
            default: {
                return ColorSpaceKt.rcpResponse(f, transferParameters0.getA(), transferParameters0.getB(), transferParameters0.getC(), transferParameters0.getD(), transferParameters0.getGamma());
            }
        }
    }
}

