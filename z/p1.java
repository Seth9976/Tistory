package z;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;

public final class p1 extends ContinuationImpl {
    public PointerInputScope o;
    public Function2 p;
    public CoroutineContext q;
    public Object r;
    public int s;

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.r = object0;
        this.s |= 0x80000000;
        return ForEachGestureKt.forEachGesture(null, null, this);
    }
}

