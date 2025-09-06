package sf;

import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.CoroutineExceptionHandlerKt;

public class k0 extends AbstractCoroutine {
    @Override  // kotlinx.coroutines.JobSupport
    public final boolean handleJobException(Throwable throwable0) {
        CoroutineExceptionHandlerKt.handleCoroutineException(this.getContext(), throwable0);
        return true;
    }
}

