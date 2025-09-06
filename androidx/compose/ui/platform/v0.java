package androidx.compose.ui.platform;

import androidx.compose.ui.SessionMutex;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import qd.a;

public final class v0 extends SuspendLambda implements Function2 {
    public int o;
    public Object p;
    public final Function2 q;
    public final w0 r;

    public v0(Function2 function20, w0 w00, Continuation continuation0) {
        this.q = function20;
        this.r = w00;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new v0(this.q, this.r, continuation0);
        continuation1.p = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((v0)this.create(((PlatformTextInputSessionScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                ChainedPlatformTextInputInterceptor.textInputSession.2.scope.1 chainedPlatformTextInputInterceptor$textInputSession$2$scope$10 = new ChainedPlatformTextInputInterceptor.textInputSession.2.scope.1(((PlatformTextInputSessionScope)this.p), SessionMutex.constructor-impl(), this.r);
                this.o = 1;
                if(this.q.invoke(chainedPlatformTextInputInterceptor$textInputSession$2$scope$10, this) == object1) {
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
        throw new KotlinNothingValueException();
    }
}

