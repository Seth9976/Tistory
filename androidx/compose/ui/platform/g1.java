package androidx.compose.ui.platform;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class g1 extends ContinuationImpl {
    public Object o;
    public int p;

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.o = object0;
        this.p |= 0x80000000;
        return PlatformTextInputModifierNodeKt.a(null, null, null, this);
    }
}

