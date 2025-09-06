package p0;

import androidx.compose.material.SwipeableState;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class ba extends ContinuationImpl {
    public SwipeableState o;
    public Map p;
    public float q;
    public Object r;
    public final SwipeableState s;
    public int t;

    public ba(SwipeableState swipeableState0, Continuation continuation0) {
        this.s = swipeableState0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.r = object0;
        this.t |= 0x80000000;
        return this.s.processNewAnchors$material_release(null, null, this);
    }
}

