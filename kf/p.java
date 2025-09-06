package kf;

import java.util.Iterator;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequenceScope;
import qd.a;

public final class p extends RestrictedSuspendLambda implements Function2 {
    public Object p;
    public Iterator q;
    public int r;
    public Object s;
    public final Object t;
    public final Sequence u;
    public final Function2 v;

    public p(Object object0, Sequence sequence0, Function2 function20, Continuation continuation0) {
        this.t = object0;
        this.u = sequence0;
        this.v = function20;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new p(this.t, this.u, this.v, continuation0);
        continuation1.s = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((p)this.create(((SequenceScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Iterator iterator0;
        SequenceScope sequenceScope1;
        SequenceScope sequenceScope0;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        Object object2 = this.t;
        switch(this.r) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                sequenceScope0 = (SequenceScope)this.s;
                this.s = sequenceScope0;
                this.r = 1;
                if(sequenceScope0.yield(object2, this) == object1) {
                    return object1;
                }
                sequenceScope1 = sequenceScope0;
                iterator0 = this.u.iterator();
                break;
            }
            case 1: {
                sequenceScope0 = (SequenceScope)this.s;
                ResultKt.throwOnFailure(object0);
                sequenceScope1 = sequenceScope0;
                iterator0 = this.u.iterator();
                break;
            }
            case 2: {
                iterator0 = this.q;
                object2 = this.p;
                sequenceScope1 = (SequenceScope)this.s;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        while(iterator0.hasNext()) {
            Object object3 = iterator0.next();
            Object object4 = this.v.invoke(object2, object3);
            this.s = sequenceScope1;
            this.p = object4;
            this.q = iterator0;
            this.r = 2;
            if(sequenceScope1.yield(object4, this) == object1) {
                return object1;
            }
            object2 = object4;
        }
        return Unit.INSTANCE;
    }
}

