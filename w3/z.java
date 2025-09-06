package w3;

import androidx.datastore.core.DataStoreImpl;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref.IntRef;

public final class z extends ContinuationImpl {
    public IntRef o;
    public Object p;
    public final DataStoreImpl q;
    public int r;

    public z(DataStoreImpl dataStoreImpl0, Continuation continuation0) {
        this.q = dataStoreImpl0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.p = object0;
        this.r |= 0x80000000;
        return this.q.writeData$datastore_core_release(null, false, this);
    }
}

