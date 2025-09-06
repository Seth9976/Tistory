package kotlinx.coroutines.flow.internal;

import androidx.compose.material3.o7;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.Flow;

public final class d extends ContinuationImpl {
    public o7 o;
    public Flow p;
    public Object q;
    public final o7 r;
    public int s;

    public d(o7 o70, Continuation continuation0) {
        this.r = o70;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.q = object0;
        this.s |= 0x80000000;
        return this.r.a(null, this);
    }
}

