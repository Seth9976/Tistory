package t;

import androidx.compose.animation.core.SeekableTransitionState;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class w extends ContinuationImpl {
    public SeekableTransitionState o;
    public Object p;
    public Object q;
    public final SeekableTransitionState r;
    public int s;

    public w(SeekableTransitionState seekableTransitionState0, Continuation continuation0) {
        this.r = seekableTransitionState0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.q = object0;
        this.s |= 0x80000000;
        return SeekableTransitionState.access$waitForComposition(this.r, this);
    }
}

