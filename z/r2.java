package z;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventPass;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class r2 extends ContinuationImpl {
    public AwaitPointerEventScope o;
    public PointerEventPass p;
    public boolean q;
    public Object r;
    public int s;

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.r = object0;
        this.s |= 0x80000000;
        return TapGestureDetectorKt.awaitFirstDown(null, false, null, this);
    }
}

