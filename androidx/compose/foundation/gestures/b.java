package androidx.compose.foundation.gestures;

import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.ui.geometry.Offset;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class b extends Lambda implements Function1 {
    public final d w;
    public final AnchoredDragScope x;

    public b(d d0, AnchoredDragScope anchoredDragScope0) {
        this.w = d0;
        this.x = anchoredDragScope0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        d d0 = this.w;
        OverscrollEffect overscrollEffect0 = d0.A;
        AnchoredDragScope anchoredDragScope0 = this.x;
        if(overscrollEffect0 == null) {
            AnchoredDraggableState anchoredDraggableState0 = d0.x;
            long v = ((DragDelta)object0).getDelta-F1C5BW0();
            long v1 = d0.c() ? Offset.times-tuRUvjQ(v, -1.0f) : Offset.times-tuRUvjQ(v, 1.0f);
            AnchoredDragScope.dragTo$default(anchoredDragScope0, anchoredDraggableState0.newOffsetForDelta$foundation_release((d0.y == Orientation.Vertical ? Offset.getY-impl(v1) : Offset.getX-impl(v1))), 0.0f, 2, null);
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNull(overscrollEffect0);
        long v2 = ((DragDelta)object0).getDelta-F1C5BW0();
        overscrollEffect0.applyToScroll-Rhakbz0((d0.c() ? Offset.times-tuRUvjQ(v2, -1.0f) : Offset.times-tuRUvjQ(v2, 1.0f)), 1, new a(d0, anchoredDragScope0));
        return Unit.INSTANCE;
    }
}

