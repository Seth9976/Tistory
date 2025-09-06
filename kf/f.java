package kf;

import java.util.Iterator;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequenceScope;
import qd.a;

public final class f extends RestrictedSuspendLambda implements Function2 {
    public Iterator p;
    public int q;
    public int r;
    public Object s;
    public final Sequence t;
    public final Function2 u;
    public final Function1 v;

    public f(Sequence sequence0, Function2 function20, Function1 function10, Continuation continuation0) {
        this.t = sequence0;
        this.u = function20;
        this.v = function10;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new f(this.t, this.u, this.v, continuation0);
        continuation1.s = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((f)this.create(((SequenceScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Iterator iterator0;
        int v;
        SequenceScope sequenceScope0;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.r) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                sequenceScope0 = (SequenceScope)this.s;
                v = 0;
                iterator0 = this.t.iterator();
                break;
            }
            case 1: {
                int v1 = this.q;
                iterator0 = this.p;
                sequenceScope0 = (SequenceScope)this.s;
                ResultKt.throwOnFailure(object0);
                v = v1;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        while(iterator0.hasNext()) {
            Object object2 = iterator0.next();
            if(v < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            Object object3 = this.u.invoke(Boxing.boxInt(v), object2);
            Iterator iterator1 = (Iterator)this.v.invoke(object3);
            this.s = sequenceScope0;
            this.p = iterator0;
            this.q = v + 1;
            this.r = 1;
            if(sequenceScope0.yieldAll(iterator1, this) == object1) {
                return object1;
            }
            ++v;
        }
        return Unit.INSTANCE;
    }
}

