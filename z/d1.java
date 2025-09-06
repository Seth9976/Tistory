package z;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref.LongRef;

public final class d1 extends ContinuationImpl {
    public Function1 o;
    public AwaitPointerEventScope p;
    public Orientation q;
    public AwaitPointerEventScope r;
    public LongRef s;
    public Object t;
    public int u;

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.t = object0;
        this.u |= 0x80000000;
        return DragGestureDetectorKt.horizontalDrag-jO51t88(null, 0L, null, this);
    }
}

