package sf;

import kotlin.Unit;
import kotlinx.coroutines.CompletedExceptionally;
import kotlinx.coroutines.JobNode;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.JobSupportKt;
import kotlinx.coroutines.selects.SelectInstance;

public final class a0 extends JobNode {
    public final SelectInstance d;
    public final JobSupport e;

    public a0(JobSupport jobSupport0, SelectInstance selectInstance0) {
        this.e = jobSupport0;
        super();
        this.d = selectInstance0;
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        this.invoke(((Throwable)object0));
        return Unit.INSTANCE;
    }

    @Override  // kotlinx.coroutines.CompletionHandlerBase
    public final void invoke(Throwable throwable0) {
        JobSupport jobSupport0 = this.e;
        Object object0 = jobSupport0.getState$kotlinx_coroutines_core();
        if(!(object0 instanceof CompletedExceptionally)) {
            object0 = JobSupportKt.unboxState(object0);
        }
        this.d.trySelect(jobSupport0, object0);
    }
}

