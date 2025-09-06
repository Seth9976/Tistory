package x;

import androidx.compose.foundation.contextmenu.ContextMenuGestures_androidKt;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class b extends ContinuationImpl {
    public AwaitPointerEventScope o;
    public Object p;
    public int q;

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.p = object0;
        this.q |= 0x80000000;
        return ContextMenuGestures_androidKt.access$awaitFirstRightClickDown(null, this);
    }
}

