package sf;

import kotlin.Unit;
import kotlinx.coroutines.JobNode;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.selects.SelectInstance;

public final class b0 extends JobNode {
    public final SelectInstance d;
    public final JobSupport e;

    public b0(JobSupport jobSupport0, SelectInstance selectInstance0) {
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
        this.d.trySelect(this.e, Unit.INSTANCE);
    }
}

