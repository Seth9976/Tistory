package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.core.AnimationState;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref.FloatRef;

public final class k extends ContinuationImpl {
    public float o;
    public float p;
    public AnimationState q;
    public FloatRef r;
    public Object s;
    public int t;

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.s = object0;
        this.t |= 0x80000000;
        return SnapFlingBehaviorKt.access$animateWithTarget(null, 0.0f, 0.0f, null, null, null, this);
    }
}

