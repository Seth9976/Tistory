package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class a extends Lambda implements Function1 {
    public final d w;
    public final AnchoredDragScope x;

    public a(d d0, AnchoredDragScope anchoredDragScope0) {
        this.w = d0;
        this.x = anchoredDragScope0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        long v = ((Offset)object0).unbox-impl();
        float f = this.w.x.newOffsetForDelta$foundation_release((this.w.y == Orientation.Vertical ? Offset.getY-impl(v) : Offset.getX-impl(v)));
        float f1 = f - this.w.x.requireOffset();
        float f2 = this.w.y == Orientation.Horizontal ? f1 : 0.0f;
        if(this.w.y != Orientation.Vertical) {
            f1 = 0.0f;
        }
        AnchoredDragScope.dragTo$default(this.x, f, 0.0f, 2, null);
        return Offset.box-impl(OffsetKt.Offset(f2, f1));
    }
}

