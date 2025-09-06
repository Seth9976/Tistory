package vc;

import dev.chrisbanes.snapper.SnapperFlingBehavior;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref.FloatRef;

public final class g extends ContinuationImpl {
    public SnapperFlingBehavior o;
    public FloatRef p;
    public Object q;
    public final SnapperFlingBehavior r;
    public int s;

    public g(SnapperFlingBehavior snapperFlingBehavior0, Continuation continuation0) {
        this.r = snapperFlingBehavior0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.q = object0;
        this.s |= 0x80000000;
        return this.r.d(null, null, 0, 0.0f, this);
    }
}

