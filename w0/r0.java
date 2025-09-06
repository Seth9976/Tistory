package w0;

import androidx.compose.material3.internal.DragGestureDetectorCopyKt;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputChange;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref.LongRef;

public final class r0 extends ContinuationImpl {
    public Function2 o;
    public AwaitPointerEventScope p;
    public LongRef q;
    public PointerInputChange r;
    public float s;
    public float t;
    public Object u;
    public int v;

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.u = object0;
        this.v |= 0x80000000;
        return DragGestureDetectorCopyKt.awaitHorizontalPointerSlopOrCancellation-gDDlDlE(null, 0L, 0, null, this);
    }
}

