package z;

import androidx.compose.foundation.gestures.AnchoredDraggableKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref.FloatRef;

public final class e extends ContinuationImpl {
    public float o;
    public FloatRef p;
    public Object q;
    public int r;

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.q = object0;
        this.r |= 0x80000000;
        return AnchoredDraggableKt.animateToWithDecay(null, null, 0.0f, this);
    }
}

