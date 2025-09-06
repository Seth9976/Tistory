package z;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref.LongRef;

public final class l0 extends ContinuationImpl {
    public AwaitPointerEventScope o;
    public LongRef p;
    public Object q;
    public int r;

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.q = object0;
        this.r |= 0x80000000;
        return DragGestureDetectorKt.awaitHorizontalDragOrCancellation-rnUCldI(null, 0L, this);
    }
}

