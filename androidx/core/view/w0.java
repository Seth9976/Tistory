package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequenceScope;
import qd.a;

public final class w0 extends RestrictedSuspendLambda implements Function2 {
    public int p;
    public Object q;
    public final View r;

    public w0(View view0, Continuation continuation0) {
        this.r = view0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new w0(this.r, continuation0);
        continuation1.q = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((w0)this.create(((SequenceScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        SequenceScope sequenceScope0;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        View view0 = this.r;
        switch(this.p) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                sequenceScope0 = (SequenceScope)this.q;
                this.q = sequenceScope0;
                this.p = 1;
                if(sequenceScope0.yield(view0, this) == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                sequenceScope0 = (SequenceScope)this.q;
                ResultKt.throwOnFailure(object0);
                break;
            }
            case 2: {
                ResultKt.throwOnFailure(object0);
                return Unit.INSTANCE;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(view0 instanceof ViewGroup) {
            Sequence sequence0 = ViewGroupKt.getDescendants(((ViewGroup)view0));
            this.q = null;
            this.p = 2;
            if(sequenceScope0.yieldAll(sequence0, this) == object1) {
                return object1;
            }
        }
        return Unit.INSTANCE;
    }
}

