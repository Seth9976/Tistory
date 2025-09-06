package w3;

import androidx.datastore.core.DataStoreImpl.InitDataStore.doRun.initData.1.api.1;
import androidx.datastore.core.DataStoreImpl;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref.ObjectRef;

public final class b extends ContinuationImpl {
    public Object o;
    public Object p;
    public Object q;
    public ObjectRef r;
    public DataStoreImpl s;
    public Object t;
    public final DataStoreImpl.InitDataStore.doRun.initData.1.api.1 u;
    public int v;

    public b(DataStoreImpl.InitDataStore.doRun.initData.1.api.1 dataStoreImpl$InitDataStore$doRun$initData$1$api$10, Continuation continuation0) {
        this.u = dataStoreImpl$InitDataStore$doRun$initData$1$api$10;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.t = object0;
        this.v |= 0x80000000;
        return this.u.updateData(null, this);
    }
}

