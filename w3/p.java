package w3;

import androidx.datastore.core.DataStoreImpl;
import androidx.datastore.core.State;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class p extends ContinuationImpl {
    public DataStoreImpl o;
    public State p;
    public boolean q;
    public Object r;
    public final DataStoreImpl s;
    public int t;

    public p(DataStoreImpl dataStoreImpl0, Continuation continuation0) {
        this.s = dataStoreImpl0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.r = object0;
        this.t |= 0x80000000;
        return DataStoreImpl.access$readDataAndUpdateCache(this.s, false, this);
    }
}

