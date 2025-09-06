package z;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.pointer.PointerInputChange;

public final class p3 {
    public final Orientation a;
    public long b;

    public p3(Orientation orientation0) {
        this.a = orientation0;
        this.b = 0L;
    }

    public final Offset a(PointerInputChange pointerInputChange0, float f) {
        long v = Offset.plus-MK-Hz9U(this.b, Offset.minus-MK-Hz9U(pointerInputChange0.getPosition-F1C5BW0(), pointerInputChange0.getPreviousPosition-F1C5BW0()));
        this.b = v;
        Orientation orientation0 = this.a;
        if((orientation0 == null ? Offset.getDistance-impl(v) : Math.abs((orientation0 == Orientation.Horizontal ? Offset.getX-impl(v) : Offset.getY-impl(v)))) >= f) {
            if(orientation0 == null) {
                return Offset.box-impl(Offset.minus-MK-Hz9U(this.b, Offset.times-tuRUvjQ(Offset.div-tuRUvjQ(this.b, Offset.getDistance-impl(this.b)), f)));
            }
            float f1 = (orientation0 == Orientation.Horizontal ? Offset.getX-impl(this.b) : Offset.getY-impl(this.b)) - Math.signum((orientation0 == Orientation.Horizontal ? Offset.getX-impl(this.b) : Offset.getY-impl(this.b))) * f;
            float f2 = orientation0 == Orientation.Horizontal ? Offset.getY-impl(this.b) : Offset.getX-impl(this.b);
            return orientation0 == Orientation.Horizontal ? Offset.box-impl(OffsetKt.Offset(f1, f2)) : Offset.box-impl(OffsetKt.Offset(f2, f1));
        }
        return null;
    }

    public final void b() {
        this.b = 0L;
    }
}

