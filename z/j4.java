package z;

import androidx.compose.foundation.gestures.UpdatableAnimationState;
import kotlin.Function;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;

public final class j4 extends ContinuationImpl {
    public UpdatableAnimationState o;
    public Function p;
    public Function0 q;
    public float r;
    public Object s;
    public final UpdatableAnimationState t;
    public int u;

    public j4(UpdatableAnimationState updatableAnimationState0, Continuation continuation0) {
        this.t = updatableAnimationState0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.s = object0;
        this.u |= 0x80000000;
        return this.t.animateToZero(null, null, this);
    }
}

