package p0;

import androidx.compose.foundation.MutatePriority;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class i7 extends SuspendLambda implements Function2 {
    public int o;
    public final j7 p;
    public final MutatePriority q;
    public final Function2 r;

    public i7(j7 j70, MutatePriority mutatePriority0, Function2 function20, Continuation continuation0) {
        this.p = j70;
        this.q = mutatePriority0;
        this.r = function20;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new i7(this.p, this.q, this.r, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((i7)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        j7 j70 = this.p;
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                j70.b.setValue(Boolean.TRUE);
                this.o = 1;
                if(j70.d.mutateWith(j70.c, this.q, this.r, this) == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        j70.b.setValue(Boolean.FALSE);
        return Unit.INSTANCE;
    }
}

