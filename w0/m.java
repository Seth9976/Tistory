package w0;

import androidx.compose.material3.internal.AnchoredDraggableKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class m extends ContinuationImpl {
    public Object o;
    public int p;

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.o = object0;
        this.p |= 0x80000000;
        return AnchoredDraggableKt.access$restartable(null, null, this);
    }
}

