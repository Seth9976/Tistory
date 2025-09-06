package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputChange;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class o0 extends ContinuationImpl {
    public AwaitPointerEventScope o;
    public TextDragObserver p;
    public PointerInputChange q;
    public Object r;
    public int s;

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.r = object0;
        this.s |= 0x80000000;
        return SelectionGesturesKt.access$touchSelectionFirstPress(null, null, null, this);
    }
}

