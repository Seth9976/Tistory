package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.core.AnimationState;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref.FloatRef;

public final class i extends ContinuationImpl {
    public float o;
    public AnimationState p;
    public FloatRef q;
    public Object r;
    public int s;

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.r = object0;
        this.s |= 0x80000000;
        return SnapFlingBehaviorKt.access$animateDecay(null, 0.0f, null, null, null, this);
    }
}

