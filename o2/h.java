package o2;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.o;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.SequenceScope;
import qd.a;

public final class h extends RestrictedSuspendLambda implements Function2 {
    public Iterator p;
    public int q;
    public Object r;
    public final i s;

    public h(i i0, Continuation continuation0) {
        this.s = i0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new h(this.s, continuation0);
        continuation1.r = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((h)this.create(((SequenceScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Iterator iterator1;
        SequenceScope sequenceScope1;
        Iterator iterator0;
        ArrayList arrayList0;
        SequenceScope sequenceScope0;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        i i0 = this.s;
        switch(this.q) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                sequenceScope0 = (SequenceScope)this.r;
                this.r = sequenceScope0;
                this.q = 1;
                if(sequenceScope0.yield(i0, this) == object1) {
                    return object1;
                }
                arrayList0 = new ArrayList();
                iterator0 = i0.c.iterator();
                goto label_17;
            }
            case 1: {
                sequenceScope0 = (SequenceScope)this.r;
                ResultKt.throwOnFailure(object0);
                arrayList0 = new ArrayList();
                iterator0 = i0.c.iterator();
            label_17:
                while(iterator0.hasNext()) {
                    Object object2 = iterator0.next();
                    o.addAll(arrayList0, ((i)object2).d);
                }
                sequenceScope1 = sequenceScope0;
                iterator1 = arrayList0.iterator();
                break;
            }
            case 2: {
                iterator1 = this.p;
                sequenceScope1 = (SequenceScope)this.r;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        while(iterator1.hasNext()) {
            Object object3 = iterator1.next();
            this.r = sequenceScope1;
            this.p = iterator1;
            this.q = 2;
            if(sequenceScope1.yield(((i)object3), this) == object1) {
                return object1;
            }
            if(false) {
                break;
            }
        }
        return Unit.INSTANCE;
    }
}

