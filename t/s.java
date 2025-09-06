package t;

import androidx.compose.animation.core.SeekableTransitionState;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class s extends ContinuationImpl {
    public SeekableTransitionState o;
    public Object p;
    public final SeekableTransitionState q;
    public int r;

    public s(SeekableTransitionState seekableTransitionState0, Continuation continuation0) {
        this.q = seekableTransitionState0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.p = object0;
        this.r |= 0x80000000;
        return SeekableTransitionState.access$runAnimations(this.q, this);
    }
}

