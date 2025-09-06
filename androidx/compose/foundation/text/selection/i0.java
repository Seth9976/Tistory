package androidx.compose.foundation.text.selection;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class i0 extends ContinuationImpl {
    public AwaitPointerEventScope o;
    public MouseSelectionObserver p;
    public Object q;
    public int r;

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.q = object0;
        this.r |= 0x80000000;
        return SelectionGesturesKt.access$mouseSelectionBtf2(null, null, null, null, this);
    }
}

