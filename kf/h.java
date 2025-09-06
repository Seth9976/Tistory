package kf;

import java.util.Iterator;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequenceScope;
import qd.a;

public final class h extends RestrictedSuspendLambda implements Function2 {
    public int p;
    public Object q;
    public final Sequence r;
    public final Function0 s;

    public h(Sequence sequence0, Function0 function00, Continuation continuation0) {
        this.r = sequence0;
        this.s = function00;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new h(this.r, this.s, continuation0);
        continuation1.q = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((h)this.create(((SequenceScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.p) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                SequenceScope sequenceScope0 = (SequenceScope)this.q;
                Iterator iterator0 = this.r.iterator();
                if(iterator0.hasNext()) {
                    this.p = 1;
                    if(sequenceScope0.yieldAll(iterator0, this) == object1) {
                        return object1;
                    }
                }
                else {
                    Sequence sequence0 = (Sequence)this.s.invoke();
                    this.p = 2;
                    if(sequenceScope0.yieldAll(sequence0, this) == object1) {
                        return object1;
                    }
                }
                return Unit.INSTANCE;
            }
            case 1: 
            case 2: {
                ResultKt.throwOnFailure(object0);
                return Unit.INSTANCE;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

