package u;

import androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class j extends ContinuationImpl {
    public AndroidEdgeEffectOverscrollEffect o;
    public long p;
    public Object q;
    public final AndroidEdgeEffectOverscrollEffect r;
    public int s;

    public j(AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect0, Continuation continuation0) {
        this.r = androidEdgeEffectOverscrollEffect0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.q = object0;
        this.s |= 0x80000000;
        return this.r.applyToFling-BMRW4eQ(0L, null, this);
    }
}

