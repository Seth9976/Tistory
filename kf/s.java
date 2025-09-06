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

public final class s extends RestrictedSuspendLambda implements Function2 {
    public Iterator p;
    public Object q;
    public int r;
    public int s;
    public Object t;
    public final Sequence u;
    public final Function3 v;

    public s(Sequence sequence0, Function3 function30, Continuation continuation0) {
        this.u = sequence0;
        this.v = function30;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new s(this.u, this.v, continuation0);
        continuation1.t = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((s)this.create(((SequenceScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object2;
        Iterator iterator0;
        SequenceScope sequenceScope0;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        int v = 1;
    alab1:
        switch(this.s) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                sequenceScope0 = (SequenceScope)this.t;
                iterator0 = this.u.iterator();
                if(iterator0.hasNext()) {
                    object2 = iterator0.next();
                    this.t = sequenceScope0;
                    this.p = iterator0;
                    this.q = object2;
                    this.s = 1;
                    if(sequenceScope0.yield(object2, this) == object1) {
                        return object1;
                    }
                    goto label_27;
                }
                break;
            }
            case 1: {
                object2 = this.q;
                iterator0 = this.p;
                sequenceScope0 = (SequenceScope)this.t;
                ResultKt.throwOnFailure(object0);
                goto label_27;
            }
            case 2: {
                int v1 = this.r;
                Object object3 = this.q;
                iterator0 = this.p;
                sequenceScope0 = (SequenceScope)this.t;
                ResultKt.throwOnFailure(object0);
                v = v1;
                object2 = object3;
                while(true) {
                label_27:
                    if(!iterator0.hasNext()) {
                        break alab1;
                    }
                    if(v < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                    }
                    Object object4 = iterator0.next();
                    Object object5 = this.v.invoke(Boxing.boxInt(v), object2, object4);
                    this.t = sequenceScope0;
                    this.p = iterator0;
                    this.q = object5;
                    this.r = v + 1;
                    this.s = 2;
                    if(sequenceScope0.yield(object5, this) == object1) {
                        return object1;
                    }
                    object2 = object5;
                    ++v;
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return Unit.INSTANCE;
    }
}

