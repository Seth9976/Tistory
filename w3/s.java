package w3;

import androidx.datastore.core.DataStoreImpl;
import java.io.Serializable;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref.ObjectRef;

public final class s extends ContinuationImpl {
    public Object o;
    public Object p;
    public Serializable q;
    public ObjectRef r;
    public boolean s;
    public int t;
    public Object u;
    public final DataStoreImpl v;
    public int w;

    public s(DataStoreImpl dataStoreImpl0, Continuation continuation0) {
        this.v = dataStoreImpl0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.u = object0;
        this.w |= 0x80000000;
        return DataStoreImpl.access$readDataOrHandleCorruption(this.v, false, this);
    }
}

