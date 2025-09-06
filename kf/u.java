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

public final class u extends RestrictedSuspendLambda implements Function2 {
    public Iterator p;
    public Object q;
    public int r;
    public Object s;
    public final Sequence t;
    public final Function2 u;

    public u(Sequence sequence0, Function2 function20, Continuation continuation0) {
        this.t = sequence0;
        this.u = function20;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new u(this.t, this.u, continuation0);
        continuation1.s = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((u)this.create(((SequenceScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object4;
        Iterator iterator1;
        Object object3;
        SequenceScope sequenceScope1;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.r) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                SequenceScope sequenceScope0 = (SequenceScope)this.s;
                Iterator iterator0 = this.t.iterator();
                if(!iterator0.hasNext()) {
                    return Unit.INSTANCE;
                }
                Object object2 = iterator0.next();
                sequenceScope1 = sequenceScope0;
                object3 = object2;
                iterator1 = iterator0;
                goto label_18;
            }
            case 1: {
                object4 = this.q;
                iterator1 = this.p;
                sequenceScope1 = (SequenceScope)this.s;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        while(true) {
            object3 = object4;
        label_18:
            if(!iterator1.hasNext()) {
                break;
            }
            object4 = iterator1.next();
            Object object5 = this.u.invoke(object3, object4);
            this.s = sequenceScope1;
            this.p = iterator1;
            this.q = object4;
            this.r = 1;
            if(sequenceScope1.yield(object5, this) != object1) {
                continue;
            }
            return object1;
        }
        return Unit.INSTANCE;
    }
}

