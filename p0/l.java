package p0;

import androidx.compose.material.AnchoredDraggableKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class l extends ContinuationImpl {
    public Object o;
    public int p;

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.o = object0;
        this.p |= 0x80000000;
        return AnchoredDraggableKt.access$restartable(null, null, this);
    }
}

