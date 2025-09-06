package androidx.compose.foundation.gestures;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class u extends Lambda implements Function1 {
    public final DragScope w;
    public final DraggableNode x;

    public u(DragScope dragScope0, DraggableNode draggableNode0) {
        this.w = dragScope0;
        this.x = draggableNode0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        long v = ((DragDelta)object0).getDelta-F1C5BW0();
        float f = DraggableKt.access$toFloat-3MmeM6k(DraggableNode.access$reverseIfNeeded-MK-Hz9U(this.x, v), this.x.y);
        this.w.dragBy(f);
        return Unit.INSTANCE;
    }
}

