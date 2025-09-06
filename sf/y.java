package sf;

import kotlin.Unit;
import kotlinx.coroutines.ChildHandleNode;
import kotlinx.coroutines.JobNode;
import kotlinx.coroutines.JobSupport;

public final class y extends JobNode {
    public final JobSupport d;
    public final z e;
    public final ChildHandleNode f;
    public final Object g;

    public y(JobSupport jobSupport0, z z0, ChildHandleNode childHandleNode0, Object object0) {
        this.d = jobSupport0;
        this.e = z0;
        this.f = childHandleNode0;
        this.g = object0;
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        this.invoke(((Throwable)object0));
        return Unit.INSTANCE;
    }

    @Override  // kotlinx.coroutines.CompletionHandlerBase
    public final void invoke(Throwable throwable0) {
        JobSupport.access$continueCompleting(this.d, this.e, this.f, this.g);
    }
}

