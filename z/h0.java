package z;

import androidx.compose.foundation.gestures.TransformScope;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import qd.a;

public final class h0 extends SuspendLambda implements Function2 {
    public int o;
    public Object p;
    public final j0 q;
    public final Function2 r;

    public h0(j0 j00, Function2 function20, Continuation continuation0) {
        this.q = j00;
        this.r = function20;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new h0(this.q, this.r, continuation0);
        continuation1.p = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((h0)this.create(((TransformScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        j0 j00 = this.q;
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                TransformScope transformScope0 = (TransformScope)this.p;
                j00.d.setValue(Boxing.boxBoolean(true));
                try {
                    this.o = 1;
                    if(this.r.invoke(transformScope0, this) == object1) {
                        return object1;
                    label_10:
                        ResultKt.throwOnFailure(object0);
                    }
                    break;
                }
                catch(Throwable throwable0) {
                    j00.d.setValue(Boxing.boxBoolean(false));
                    throw throwable0;
                }
            }
            case 1: {
                goto label_10;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        j00.d.setValue(Boxing.boxBoolean(false));
        return Unit.INSTANCE;
    }
}

