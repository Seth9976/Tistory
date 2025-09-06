package sf;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CompletedExceptionally;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;

public final class x extends CancellableContinuationImpl {
    public final JobSupport f;

    public x(JobSupport jobSupport0, Continuation continuation0) {
        super(continuation0, 1);
        this.f = jobSupport0;
    }

    @Override  // kotlinx.coroutines.CancellableContinuationImpl
    public final Throwable getContinuationCancellationCause(Job job0) {
        Object object0 = this.f.getState$kotlinx_coroutines_core();
        if(object0 instanceof z) {
            Throwable throwable0 = ((z)object0).b();
            if(throwable0 != null) {
                return throwable0;
            }
        }
        return object0 instanceof CompletedExceptionally ? ((CompletedExceptionally)object0).cause : job0.getCancellationException();
    }

    @Override  // kotlinx.coroutines.CancellableContinuationImpl
    public final String nameString() {
        return "AwaitContinuation";
    }
}

