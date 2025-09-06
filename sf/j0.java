package sf;

import kotlin.Unit;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.JobNode;

public final class j0 extends JobNode {
    public final CancellableContinuationImpl d;

    public j0(CancellableContinuationImpl cancellableContinuationImpl0) {
        this.d = cancellableContinuationImpl0;
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        this.invoke(((Throwable)object0));
        return Unit.INSTANCE;
    }

    @Override  // kotlinx.coroutines.CompletionHandlerBase
    public final void invoke(Throwable throwable0) {
        this.d.resumeWith(Unit.INSTANCE);
    }
}

