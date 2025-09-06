package kf;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.o;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.random.Random;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequenceScope;
import kotlin.sequences.SequencesKt___SequencesKt;
import qd.a;

public final class i extends RestrictedSuspendLambda implements Function2 {
    public List p;
    public int q;
    public Object r;
    public final Sequence s;
    public final Random t;

    public i(Sequence sequence0, Random random0, Continuation continuation0) {
        this.s = sequence0;
        this.t = random0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new i(this.s, this.t, continuation0);
        continuation1.r = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((i)this.create(((SequenceScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        SequenceScope sequenceScope1;
        List list0;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.q) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                SequenceScope sequenceScope0 = (SequenceScope)this.r;
                list0 = SequencesKt___SequencesKt.toMutableList(this.s);
                sequenceScope1 = sequenceScope0;
                break;
            }
            case 1: {
                list0 = this.p;
                sequenceScope1 = (SequenceScope)this.r;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        while(!list0.isEmpty()) {
            int v = this.t.nextInt(list0.size());
            Object object2 = o.removeLast(list0);
            if(v < list0.size()) {
                object2 = list0.set(v, object2);
            }
            this.r = sequenceScope1;
            this.p = list0;
            this.q = 1;
            if(sequenceScope1.yield(object2, this) == object1) {
                return object1;
            }
            if(false) {
                break;
            }
        }
        return Unit.INSTANCE;
    }
}

