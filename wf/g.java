package wf;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.sequences.SequenceScope;
import kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl;

public final class g extends ContinuationImpl {
    public DebugCoroutineInfoImpl o;
    public SequenceScope p;
    public CoroutineStackFrame q;
    public Object r;
    public final DebugCoroutineInfoImpl s;
    public int t;

    public g(Continuation continuation0, DebugCoroutineInfoImpl debugCoroutineInfoImpl0) {
        this.s = debugCoroutineInfoImpl0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.r = object0;
        this.t |= 0x80000000;
        return DebugCoroutineInfoImpl.access$yieldFrames(this.s, null, null, this);
    }
}

