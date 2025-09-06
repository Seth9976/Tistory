package androidx.compose.material3;

import androidx.compose.material3.internal.AnchoredDraggableKt;
import androidx.compose.ui.unit.IntSize;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class rm extends Lambda implements Function2 {
    public final SwipeToDismissBoxState w;
    public final boolean x;
    public final boolean y;
    public final boolean z;

    public rm(SwipeToDismissBoxState swipeToDismissBoxState0, boolean z, boolean z1, boolean z2) {
        this.w = swipeToDismissBoxState0;
        this.x = z;
        this.y = z1;
        this.z = z2;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        long v = ((IntSize)object0).unbox-impl();
        return TuplesKt.to(AnchoredDraggableKt.DraggableAnchors(new qm(this.x, this.y, ((float)IntSize.getWidth-impl(v)), this.z)), this.w.getTargetValue());
    }
}

