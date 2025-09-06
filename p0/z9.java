package p0;

import androidx.compose.material3.fj;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class z9 extends ContinuationImpl {
    public fj o;
    public Map p;
    public Object q;
    public final fj r;
    public int s;

    public z9(fj fj0, Continuation continuation0) {
        this.r = fj0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.q = object0;
        this.s |= 0x80000000;
        return this.r.a(null, this);
    }
}

