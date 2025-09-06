package m3;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

public final class c extends AtomicBoolean implements Runnable {
    public final Continuation a;

    public c(Continuation continuation0) {
        super(false);
        this.a = continuation0;
    }

    @Override
    public final void run() {
        if(this.compareAndSet(false, true)) {
            this.a.resumeWith(Unit.INSTANCE);
        }
    }

    @Override
    public final String toString() {
        return "ContinuationRunnable(ran = " + this.get() + ')';
    }
}

