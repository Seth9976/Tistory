package u;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.TimeoutKt;
import qd.a;

public final class z extends SuspendLambda implements Function1 {
    public int o;
    public final b0 p;
    public final a0 q;

    public z(b0 b00, a0 a00, Continuation continuation0) {
        this.p = b00;
        this.q = a00;
        super(1, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation0) {
        return new z(this.p, this.q, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        return ((z)this.create(((Continuation)object0))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        b0 b00 = this.p;
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                a0 a00 = this.q;
                try {
                    if(b00.a) {
                        this.o = 1;
                        if(a00.invoke(this) == object1) {
                            return object1;
                        }
                    }
                    else {
                        y y0 = new y(a00, null);
                        this.o = 2;
                        if(TimeoutKt.withTimeout(1500L, y0, this) == object1) {
                            return object1;
                        label_14:
                            ResultKt.throwOnFailure(object0);
                        }
                    }
                    break;
                }
                catch(Throwable throwable0) {
                    b00.c.setValue(Boolean.FALSE);
                    throw throwable0;
                }
            }
            case 1: 
            case 2: {
                goto label_14;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        b00.c.setValue(Boolean.FALSE);
        return Unit.INSTANCE;
    }
}

