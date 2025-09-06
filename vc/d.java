package vc;

import androidx.compose.foundation.gestures.ScrollScope;
import dev.chrisbanes.snapper.SnapperFlingBehavior;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class d extends ContinuationImpl {
    public SnapperFlingBehavior o;
    public ScrollScope p;
    public int q;
    public float r;
    public Object s;
    public final SnapperFlingBehavior t;
    public int u;

    public d(SnapperFlingBehavior snapperFlingBehavior0, Continuation continuation0) {
        this.t = snapperFlingBehavior0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.s = object0;
        this.u |= 0x80000000;
        return this.t.b(null, 0, 0.0f, this);
    }
}

