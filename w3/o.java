package w3;

import androidx.datastore.core.DataStoreImpl;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class o extends ContinuationImpl {
    public DataStoreImpl o;
    public int p;
    public Object q;
    public final DataStoreImpl r;
    public int s;

    public o(DataStoreImpl dataStoreImpl0, Continuation continuation0) {
        this.r = dataStoreImpl0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.q = object0;
        this.s |= 0x80000000;
        return this.r.b(this);
    }
}

