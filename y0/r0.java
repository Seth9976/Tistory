package y0;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import qd.a;

public final class r0 extends SuspendLambda implements Function2 {
    public int o;
    public final Function1 p;

    public r0(Function1 function10, Continuation continuation0) {
        this.p = function10;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new r0(this.p, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((r0)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                this.o = 1;
                return DelayKt.delay(16L, this) == object1 ? object1 : this.p.invoke(Boxing.boxLong(System.nanoTime()));
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
                return this.p.invoke(Boxing.boxLong(System.nanoTime()));
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

