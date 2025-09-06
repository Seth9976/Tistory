package androidx.compose.ui.platform;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class s0 extends ContinuationImpl {
    public Object o;
    public final ChainedPlatformTextInputInterceptor.textInputSession.2.scope.1 p;
    public int q;

    public s0(ChainedPlatformTextInputInterceptor.textInputSession.2.scope.1 chainedPlatformTextInputInterceptor$textInputSession$2$scope$10, Continuation continuation0) {
        this.p = chainedPlatformTextInputInterceptor$textInputSession$2$scope$10;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.o = object0;
        this.q |= 0x80000000;
        return this.p.startInputMethod(null, this);
    }
}

