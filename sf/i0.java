package sf;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlinx.coroutines.CompletedExceptionally;
import kotlinx.coroutines.JobNode;
import kotlinx.coroutines.JobSupportKt;

public final class i0 extends JobNode {
    public final x d;

    public i0(x x0) {
        this.d = x0;
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        this.invoke(((Throwable)object0));
        return Unit.INSTANCE;
    }

    @Override  // kotlinx.coroutines.CompletionHandlerBase
    public final void invoke(Throwable throwable0) {
        Object object0 = this.getJob().getState$kotlinx_coroutines_core();
        x x0 = this.d;
        if(object0 instanceof CompletedExceptionally) {
            x0.resumeWith(Result.constructor-impl(ResultKt.createFailure(((CompletedExceptionally)object0).cause)));
            return;
        }
        x0.resumeWith(Result.constructor-impl(JobSupportKt.unboxState(object0)));
    }
}

