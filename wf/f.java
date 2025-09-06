package wf;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.SequenceScope;
import kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl;
import kotlinx.coroutines.debug.internal.StackTraceFrame;
import qd.a;

public final class f extends RestrictedSuspendLambda implements Function2 {
    public int p;
    public Object q;
    public final DebugCoroutineInfoImpl r;
    public final StackTraceFrame s;

    public f(DebugCoroutineInfoImpl debugCoroutineInfoImpl0, StackTraceFrame stackTraceFrame0, Continuation continuation0) {
        this.r = debugCoroutineInfoImpl0;
        this.s = stackTraceFrame0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new f(this.r, this.s, continuation0);
        continuation1.q = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((f)this.create(((SequenceScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.p) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                this.p = 1;
                return DebugCoroutineInfoImpl.access$yieldFrames(this.r, ((SequenceScope)this.q), this.s.getCallerFrame(), this) == object1 ? object1 : Unit.INSTANCE;
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
                return Unit.INSTANCE;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

