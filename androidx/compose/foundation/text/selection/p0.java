package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputChange;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref.LongRef;

public final class p0 extends ContinuationImpl {
    public AwaitPointerEventScope o;
    public TextDragObserver p;
    public PointerInputChange q;
    public LongRef r;
    public long s;
    public Object t;
    public int u;

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.t = object0;
        this.u |= 0x80000000;
        return SelectionGesturesKt.access$touchSelectionSubsequentPress(null, null, null, this);
    }
}

