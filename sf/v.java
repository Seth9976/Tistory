package sf;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Unit;
import kotlin.jvm.Volatile;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.JobCancellingNode;

public final class v extends JobCancellingNode {
    @Volatile
    private volatile int _invoked;
    public final Function1 d;
    public static final AtomicIntegerFieldUpdater e;

    static {
        v.e = AtomicIntegerFieldUpdater.newUpdater(v.class, "_invoked");
    }

    public v(Function1 function10) {
        this.d = function10;
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        this.invoke(((Throwable)object0));
        return Unit.INSTANCE;
    }

    @Override  // kotlinx.coroutines.CompletionHandlerBase
    public final void invoke(Throwable throwable0) {
        if(v.e.compareAndSet(this, 0, 1)) {
            this.d.invoke(throwable0);
        }
    }
}

