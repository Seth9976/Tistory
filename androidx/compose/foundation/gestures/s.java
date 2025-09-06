package androidx.compose.foundation.gestures;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class s extends Lambda implements Function1 {
    public final Drag2DScope w;
    public final Draggable2DNode x;

    public s(Drag2DScope drag2DScope0, Draggable2DNode draggable2DNode0) {
        this.w = drag2DScope0;
        this.x = draggable2DNode0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        long v = ((DragDelta)object0).getDelta-F1C5BW0();
        long v1 = Draggable2DNode.access$reverseIfNeeded-MK-Hz9U(this.x, v);
        this.w.dragBy-k-4lQ0M(v1);
        return Unit.INSTANCE;
    }
}

