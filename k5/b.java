package k5;

import androidx.work.OperationKt;
import com.google.common.util.concurrent.ListenableFuture;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class b extends ContinuationImpl {
    public ListenableFuture o;
    public Object p;
    public int q;

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.p = object0;
        this.q |= 0x80000000;
        return OperationKt.await(null, this);
    }
}

