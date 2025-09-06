package androidx.compose.ui.platform;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class i0 extends ContinuationImpl {
    public Object o;
    public final AndroidPlatformTextInputSession p;
    public int q;

    public i0(AndroidPlatformTextInputSession androidPlatformTextInputSession0, Continuation continuation0) {
        this.p = androidPlatformTextInputSession0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.o = object0;
        this.q |= 0x80000000;
        return this.p.startInputMethod(null, this);
    }
}

