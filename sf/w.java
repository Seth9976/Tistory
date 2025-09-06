package sf;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.JobNode;

public final class w extends JobNode {
    public final Function1 d;

    public w(Function1 function10) {
        this.d = function10;
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        this.invoke(((Throwable)object0));
        return Unit.INSTANCE;
    }

    @Override  // kotlinx.coroutines.CompletionHandlerBase
    public final void invoke(Throwable throwable0) {
        this.d.invoke(throwable0);
    }
}

