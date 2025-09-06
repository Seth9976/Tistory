package sf;

import java.util.concurrent.locks.LockSupport;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.AbstractTimeSource;
import kotlinx.coroutines.AbstractTimeSourceKt;
import kotlinx.coroutines.EventLoop;

public final class g extends AbstractCoroutine {
    public final Thread d;
    public final EventLoop e;

    public g(CoroutineContext coroutineContext0, Thread thread0, EventLoop eventLoop0) {
        super(coroutineContext0, true, true);
        this.d = thread0;
        this.e = eventLoop0;
    }

    @Override  // kotlinx.coroutines.JobSupport
    public final void afterCompletion(Object object0) {
        Unit unit0;
        Thread thread0 = this.d;
        if(!Intrinsics.areEqual(Thread.currentThread(), thread0)) {
            AbstractTimeSource abstractTimeSource0 = AbstractTimeSourceKt.getTimeSource();
            if(abstractTimeSource0 == null) {
                unit0 = null;
            }
            else {
                abstractTimeSource0.unpark(thread0);
                unit0 = Unit.INSTANCE;
            }
            if(unit0 == null) {
                LockSupport.unpark(thread0);
            }
        }
    }

    @Override  // kotlinx.coroutines.JobSupport
    public final boolean isScopedCoroutine() {
        return true;
    }
}

