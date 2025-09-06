package z;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref.LongRef;

public final class c1 extends ContinuationImpl {
    public AwaitPointerEventScope o;
    public Function1 p;
    public Orientation q;
    public Function1 r;
    public AwaitPointerEventScope s;
    public LongRef t;
    public Object u;
    public int v;

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.u = object0;
        this.v |= 0x80000000;
        return DragGestureDetectorKt.drag-VnAYq1g(null, 0L, null, null, null, this);
    }
}

