package u0;

import androidx.compose.material.ripple.RippleAnimation;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class g extends ContinuationImpl {
    public RippleAnimation o;
    public Object p;
    public final RippleAnimation q;
    public int r;

    public g(RippleAnimation rippleAnimation0, Continuation continuation0) {
        this.q = rippleAnimation0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.p = object0;
        this.r |= 0x80000000;
        return this.q.animate(this);
    }
}

