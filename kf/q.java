package kf;

import java.util.Iterator;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequenceScope;
import qd.a;

public final class q extends RestrictedSuspendLambda implements Function2 {
    public Object p;
    public Iterator q;
    public int r;
    public int s;
    public Object t;
    public final Object u;
    public final Sequence v;
    public final Function3 w;

    public q(Object object0, Sequence sequence0, Function3 function30, Continuation continuation0) {
        this.u = object0;
        this.v = sequence0;
        this.w = function30;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new q(this.u, this.v, this.w, continuation0);
        continuation1.t = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((q)this.create(((SequenceScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        int v;
        Iterator iterator0;
        SequenceScope sequenceScope1;
        SequenceScope sequenceScope0;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        Object object2 = this.u;
        switch(this.s) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                sequenceScope0 = (SequenceScope)this.t;
                this.t = sequenceScope0;
                this.s = 1;
                if(sequenceScope0.yield(object2, this) == object1) {
                    return object1;
                }
                sequenceScope1 = sequenceScope0;
                iterator0 = this.v.iterator();
                v = 0;
                break;
            }
            case 1: {
                sequenceScope0 = (SequenceScope)this.t;
                ResultKt.throwOnFailure(object0);
                sequenceScope1 = sequenceScope0;
                iterator0 = this.v.iterator();
                v = 0;
                break;
            }
            case 2: {
                int v1 = this.r;
                iterator0 = this.q;
                object2 = this.p;
                sequenceScope1 = (SequenceScope)this.t;
                ResultKt.throwOnFailure(object0);
                v = v1;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        while(iterator0.hasNext()) {
            Object object3 = iterator0.next();
            if(v < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            Object object4 = this.w.invoke(Boxing.boxInt(v), object2, object3);
            this.t = sequenceScope1;
            this.p = object4;
            this.q = iterator0;
            this.r = v + 1;
            this.s = 2;
            if(sequenceScope1.yield(object4, this) == object1) {
                return object1;
            }
            object2 = object4;
            ++v;
        }
        return Unit.INSTANCE;
    }
}

