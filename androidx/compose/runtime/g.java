package androidx.compose.runtime;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.ExceptionsKt;
import kotlinx.coroutines.Job;

public final class g extends Lambda implements Function1 {
    public final Recomposer w;

    public g(Recomposer recomposer0) {
        this.w = recomposer0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Continuation continuation0;
        CancellableContinuation cancellableContinuation0;
        CancellationException cancellationException0 = ExceptionsKt.CancellationException("Recomposer effect job completed", ((Throwable)object0));
        Object object1 = this.w.c;
        Recomposer recomposer0 = this.w;
        synchronized(object1) {
            Job job0 = recomposer0.d;
            continuation0 = null;
            if(job0 == null) {
                recomposer0.e = cancellationException0;
                recomposer0.u.setValue(State.ShutDown);
            }
            else {
                recomposer0.u.setValue(State.ShuttingDown);
                if(recomposer0.r) {
                    cancellableContinuation0 = recomposer0.p == null ? null : recomposer0.p;
                }
                else {
                    job0.cancel(cancellationException0);
                    cancellableContinuation0 = null;
                }
                recomposer0.p = null;
                job0.invokeOnCompletion(new f(recomposer0, ((Throwable)object0)));
                continuation0 = cancellableContinuation0;
            }
        }
        if(continuation0 != null) {
            continuation0.resumeWith(Unit.INSTANCE);
        }
        return Unit.INSTANCE;
    }
}

