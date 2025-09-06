package z;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputChange;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref.LongRef;

public final class m0 extends ContinuationImpl {
    public Function2 o;
    public AwaitPointerEventScope p;
    public LongRef q;
    public p3 r;
    public PointerInputChange s;
    public float t;
    public Object u;
    public int v;

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.u = object0;
        this.v |= 0x80000000;
        return DragGestureDetectorKt.awaitHorizontalPointerSlopOrCancellation-gDDlDlE(null, 0L, 0, null, this);
    }
}

