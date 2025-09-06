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

public final class r extends RestrictedSuspendLambda implements Function2 {
    public Iterator p;
    public Object q;
    public int r;
    public Object s;
    public final Sequence t;
    public final Function2 u;

    public r(Sequence sequence0, Function2 function20, Continuation continuation0) {
        this.t = sequence0;
        this.u = function20;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new r(this.t, this.u, continuation0);
        continuation1.s = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((r)this.create(((SequenceScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Iterator iterator1;
        Object object2;
        SequenceScope sequenceScope0;
        Object object1 = a.getCOROUTINE_SUSPENDED();
    alab1:
        switch(this.r) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                sequenceScope0 = (SequenceScope)this.s;
                Iterator iterator0 = this.t.iterator();
                if(iterator0.hasNext()) {
                    object2 = iterator0.next();
                    this.s = sequenceScope0;
                    this.p = iterator0;
                    this.q = object2;
                    this.r = 1;
                    if(sequenceScope0.yield(object2, this) == object1) {
                        return object1;
                    }
                    iterator1 = iterator0;
                    goto label_20;
                }
                break;
            }
            case 1: 
            case 2: {
                object2 = this.q;
                iterator1 = this.p;
                sequenceScope0 = (SequenceScope)this.s;
                ResultKt.throwOnFailure(object0);
                while(true) {
                label_20:
                    if(!iterator1.hasNext()) {
                        break alab1;
                    }
                    Object object3 = iterator1.next();
                    object2 = this.u.invoke(object2, object3);
                    this.s = sequenceScope0;
                    this.p = iterator1;
                    this.q = object2;
                    this.r = 2;
                    if(sequenceScope0.yield(object2, this) == object1) {
                        return object1;
                    }
                    if(false) {
                        break alab1;
                    }
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return Unit.INSTANCE;
    }
}

