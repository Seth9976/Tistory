package androidx.compose.foundation.layout;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref.FloatRef;

public final class g4 extends ContinuationImpl {
    public n4 o;
    public FloatRef p;
    public long q;
    public float r;
    public Object s;
    public final n4 t;
    public int u;

    public g4(n4 n40, Continuation continuation0) {
        this.t = n40;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.s = object0;
        this.u |= 0x80000000;
        return this.t.b(0L, 0.0f, false, this);
    }
}

