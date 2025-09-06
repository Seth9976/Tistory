package androidx.compose.material3;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class ga extends SuspendLambda implements Function2 {
    public int o;
    public final ma p;
    public final FloatingActionButtonElevation q;

    public ga(ma ma0, FloatingActionButtonElevation floatingActionButtonElevation0, Continuation continuation0) {
        this.p = ma0;
        this.q = floatingActionButtonElevation0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new ga(this.p, this.q, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((ga)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                this.o = 1;
                this.p.a = this.q.a;
                this.p.b = this.q.b;
                this.p.c = this.q.d;
                this.p.d = this.q.c;
                Unit unit0 = this.p.b(this);
                if(unit0 != a.getCOROUTINE_SUSPENDED()) {
                    unit0 = Unit.INSTANCE;
                }
                return unit0 == object1 ? object1 : Unit.INSTANCE;
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
                return Unit.INSTANCE;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

