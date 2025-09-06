package x3;

import androidx.datastore.core.okio.OkioReadScope;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import okio.BufferedSource;

public final class a extends ContinuationImpl {
    public OkioReadScope o;
    public BufferedSource p;
    public Object q;
    public final OkioReadScope r;
    public int s;

    public a(OkioReadScope okioReadScope0, Continuation continuation0) {
        this.r = okioReadScope0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.q = object0;
        this.s |= 0x80000000;
        return OkioReadScope.a(this.r, this);
    }
}

