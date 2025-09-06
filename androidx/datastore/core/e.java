package androidx.datastore.core;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CompletableDeferred;

public final class e extends ContinuationImpl {
    public Object o;
    public DataStoreImpl p;
    public CompletableDeferred q;
    public Object r;
    public final DataStoreImpl s;
    public int t;

    public e(DataStoreImpl dataStoreImpl0, Continuation continuation0) {
        this.s = dataStoreImpl0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.r = object0;
        this.t |= 0x80000000;
        return DataStoreImpl.access$handleUpdate(this.s, null, this);
    }
}

