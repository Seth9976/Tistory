package sf;

import java.util.concurrent.Future;
import kotlin.Unit;
import kotlinx.coroutines.JobNode;

public final class i extends JobNode {
    public final Future d;

    public i(Future future0) {
        this.d = future0;
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        this.invoke(((Throwable)object0));
        return Unit.INSTANCE;
    }

    @Override  // kotlinx.coroutines.CompletionHandlerBase
    public final void invoke(Throwable throwable0) {
        if(throwable0 != null) {
            this.d.cancel(false);
        }
    }
}

